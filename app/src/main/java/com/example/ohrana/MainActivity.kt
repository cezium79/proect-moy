package com.example.ohrana

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import android.content.Context

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.*
import androidx.compose.ui.platform.LocalContext
import androidx.camera.core.Preview
import androidx.camera.view.PreviewView
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import com.example.ohrana.CameraScannerScreen
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp




class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppNavigation()
        }
    }
}
@Composable
fun AdminPasswordDialog(
    onDismiss: () -> Unit,
    onConfirm: (String) -> Unit,
    isError: Boolean
) {
    var passwordInput by remember { mutableStateOf("") }

    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text("Доступ ограничен") },
        text = {
            Column {
                Text("Введите пароль администратора:")
                Spacer(modifier = Modifier.height(8.dp))
                OutlinedTextField(
                    value = passwordInput,
                    onValueChange = { passwordInput = it },
                    label = { Text("Пароль") },
                    singleLine = true,
                    visualTransformation = PasswordVisualTransformation(),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.NumberPassword),
                    isError = isError,
                    modifier = Modifier.fillMaxWidth()
                )
                if (isError) {
                    Text(
                        text = "Неверный пароль. Попробуйте еще раз.",
                        color = MaterialTheme.colorScheme.error,
                        style = MaterialTheme.typography.bodySmall,
                        modifier = Modifier.padding(top = 4.dp)
                    )
                }
            }
        },
        confirmButton = {
            Button(onClick = { onConfirm(passwordInput) }) { Text("Вход") }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) { Text("Отмена") }
        }
    )
}


@Composable
fun AppNavigation() {


    var previousScreenWasAdmin by remember { mutableStateOf(false) }
    var currentScreen by remember { mutableStateOf("privet") }
    var selectedEmployeeName by remember { mutableStateOf("") }

    val context = LocalContext.current
    val prefsManager = remember { SharedPrefsManager(context) }

    val employeeList = remember {
        val savedList = prefsManager.loadEmployees()
        val initialList = if (savedList.isEmpty()) {
            listOf(
                Employee(name = "Иванов Иван", role = "Старший смены"),
                Employee(name = "Петров Петр", role = "Охранник")
            )
        } else {
            savedList
        }
        mutableStateListOf<Employee>().apply { addAll(initialList) }
    }
    var showPasswordDialog by remember { mutableStateOf(false) }
    var isPasswordError by remember { mutableStateOf(false) }


    // 🔔 ВСПЛЫВАЮЩЕЕ ДИАЛОГОВОЕ ОКНО
    if (showPasswordDialog) {
        AdminPasswordDialog(
            onDismiss = { showPasswordDialog = false; isPasswordError = false },
            onConfirm = { enteredPassword ->
                if (enteredPassword == "1234")// Пароль для входа в окно настроек
                {
                    showPasswordDialog = false
                    isPasswordError = false
                    currentScreen = "admin"
                } else {
                    isPasswordError = true
                }
            },
            isError = isPasswordError
        )
    }

    when (currentScreen) {
        "privet" -> PrivetScreen(
            onNavigateToOhrannik = {
                // ИНТЕЛЛЕКТУАЛЬНЫЙ ПЕРЕХВАТ НА СТАРТЕ:
                // Смотрим, есть ли в системе вообще чья-то запущенная смена
                val activeGuardName = prefsManager.getActiveShiftEmployeeName()

                if (activeGuardName.isNotEmpty()) {
                    // Смена идет! Игнорируем выбор фамилий, подставляем имя и сразу шлем в ShiftControl
                    selectedEmployeeName = activeGuardName
                    currentScreen = "shift_control"
                } else {
                    // Смен нет, всё как обычно — отправляем выбирать фамилию
                    currentScreen = "ohrannik"
                }
            },
            onNavigateToAdministrator = { showPasswordDialog = true }
        )

        "ohrannik" -> OhrannikScreen(
            employees = employeeList,
            onSelectEmployee = { employee ->
                selectedEmployeeName = employee.name

                // УМНЫЙ ПЕРЕХВАТ: Если смена у этого сотрудника уже активна — сразу шлем в камеру
                if (prefsManager.isShiftActiveFor(employee.name)) {
                    currentScreen = "ohrannik_cabinet"
                } else {
                    // Если смены нет — отправляем на экран открытия смены (Старт/Стоп)
                    currentScreen = "shift_control"
                }
            },
            onBack = { currentScreen = "privet" }
        )



        "shift_control" -> OhrannikShiftControlScreen(
            employeeName = selectedEmployeeName,
            onStartShiftSuccess = {
                currentScreen = "ohrannik_cabinet" // После СТАРТа уходим в камеру
            },
            onContinueShift = {
                currentScreen = "ohrannik_cabinet" // При нажатии ПРОДОЛЖИТЬ уходим в камеру
            },
            onShiftClosedSuccess = {
                previousScreenWasAdmin = false
                currentScreen = "spisok_otchetov" // После СТОПа уходим в отчеты
            },
            onBack = {
                // Кнопка "Назад" с этого экрана теперь ВСЕГДА выбрасывает в окно privet
                currentScreen = "privet"
            }
        )

        "ohrannik_cabinet" -> OhrannikCabinetScreen(
            employeeName = selectedEmployeeName,
            onLogout = {
                // Из окна камеры при нажатии "Выход/Назад" выбрасывает СТРОГО в окно privet
                currentScreen = "privet"
            },
            onNavigateToReports = {
                previousScreenWasAdmin = false
                currentScreen = "spisok_otchetov"
            }
        )




        // ТО ЧЕГО НЕ ХВАТАЛО: Экран Администратора
        "admin" -> AdministratorScreen(
            onNavigateToEmployeeList = { currentScreen = "employee_list" },
            onNavigateToSpisokOtchetov = {
                previousScreenWasAdmin = true
                currentScreen = "spisok_otchetov"
            },
            onNavigateToArchive = { currentScreen = "spisok_otchetov" },
            onNavigateToRoutes = { currentScreen = "routes" }, // <-- ДОБАВЛЕНО
            onBack = { currentScreen = "privet" }
        )

        // Экран управления маршрутами (Новый блок)
        "routes" -> MarshrutiScreen(
            onBack = { currentScreen = "admin" }
        )

        // Дополнительный экран: Список охранников
        "employee_list" -> EmployeeListScreen(
            employees = employeeList,
            onAddEmployee = { name, position ->
                // Создаем и добавляем нового сотрудника прямо в список
                val newEmployee = Employee(name = name, role = position)
                employeeList.add(newEmployee)
                // Сохраняем обновленный список в SharedPreferences
                prefsManager.saveEmployees(employeeList.toList())
            },
            onDeleteEmployee = { employee ->
                // Удаляем сотрудника из списка и обновляем хранилище
                employeeList.remove(employee)
                prefsManager.saveEmployees(employeeList.toList())
            },
            onEditEmployee = { employee, newName, newPosition ->
                // Находим редактируемого сотрудника и обновляем его поля
                val index = employeeList.indexOf(employee)
                if (index != -1) {
                    employeeList[index] = employee.copy(name = newName, role = newPosition)
                    prefsManager.saveEmployees(employeeList.toList())
                }
            },
            onBack = { currentScreen = "admin" }
        )

        // Дополнительный экран: Список отчетов
        "spisok_otchetov" -> SpisokOtchetovScreen(
            onBack = {
                if (previousScreenWasAdmin) {
                    currentScreen = "admin" // Если пришел админ — возвращаем в админку
                } else {
                    currentScreen = "ohrannik_cabinet" // Если охранник — возвращаем в кабинет
                }
            }
        )



    }


}
