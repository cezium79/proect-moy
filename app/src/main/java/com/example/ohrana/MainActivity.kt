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
import com.example.ohrana.CameraScannerScreen



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppNavigation()
        }
    }
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



    when (currentScreen) {
        "privet" -> PrivetScreen(
            onNavigateToOhrannik = { currentScreen = "ohrannik" },
            onNavigateToAdministrator = { currentScreen = "admin" }
        )

        "ohrannik" -> OhrannikScreen(
            employees = employeeList,
            onSelectEmployee = { employee ->
                selectedEmployeeName = employee.name
                currentScreen = "ohrannik_cabinet"
            },
            onBack = { currentScreen = "privet" }
        )

        "ohrannik_cabinet" -> OhrannikCabinetScreen(
            employeeName = selectedEmployeeName,
            onLogout = { currentScreen = "ohrannik" },
            onNavigateToReports = {
                previousScreenWasAdmin = false // <-- ЗАПОМИНАЕМ, ЧТО ПЕРЕШЕЛ ОХРАННИК
                QrHandler.generateFullReport() // Ваша логика генерации отчета
                currentScreen = "spisok_otchetov"
            }
        )



        // ТО ЧЕГО НЕ ХВАТАЛО: Экран Администратора
        "admin" -> AdministratorScreen(
            onNavigateToEmployeeList = { currentScreen = "employee_list" },
            onNavigateToSpisokOtchetov = {
                previousScreenWasAdmin = true // <-- ЗАПОМИНАЕМ, ЧТО ПЕРЕШЕЛ АДМИН
                currentScreen = "spisok_otchetov"
            },
            onNavigateToArchive = { currentScreen = "spisok_otchetov" },
            onBack = { currentScreen = "privet" }
        )

        // Дополнительный экран: Список охранников
        "employee_list" -> EmployeeListScreen(
            employees = employeeList,
            onAddEmployee = { name, position -> currentScreen = "add_employee" },     // <-- ДОБАВИТЬ
            onDeleteEmployee = { currentScreen = "delete_employee" }, // <-- ДОБАВИТЬ
            onEditEmployee = { employee, param1, param2 ->
                currentScreen = "edit_employee"
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