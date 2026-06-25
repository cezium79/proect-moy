package com.example.ohrana

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OhrannikShiftControlScreen(
    employeeName: String,
    onStartShiftSuccess: () -> Unit,      // Вызывается при первом СТАРТЕ смены
    onContinueShift: () -> Unit,          // Вызывается при нажатии ПРОДОЛЖИТЬ
    onShiftClosedSuccess: () -> Unit,     // Вызывается при СТОПЕ смены
    onBack: () -> Unit
) {
    val context = LocalContext.current
    val prefsManager = remember { SharedPrefsManager(context) }
    val dateTimeFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US)

    var isShiftActive by remember { mutableStateOf(prefsManager.isShiftActiveFor(employeeName)) }
    val shiftStartTime = remember { prefsManager.getShiftStartTime() }

    // 🔥 СТАТУС ДЛЯ ОТОБРАЖЕНИЯ ЖУРНАЛА ОБХОДОВ
    var showLogsDialog by remember { mutableStateOf(false) }

    // 🔔 ВСПЛЫВАЮЩЕЕ ОКНО С ИСТОРИЕЙ ОБХОДОВ ТЕКУЩЕЙ СМЕНЫ
    if (showLogsDialog) {
        AlertDialog(
            onDismissRequest = { showLogsDialog = false },
            title = { Text("Журнал текущих обходов", fontWeight = FontWeight.Bold) },
            text = {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(350.dp),
                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant)
                ) {
                    LazyColumn(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(12.dp)
                    ) {
                        item {
                            Text(
                                text = QrHandler.generateFullReport(), // Вызываем функцию отчета
                                fontSize = 14.sp,
                                style = MaterialTheme.typography.bodyMedium,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                    }
                }
            },
            confirmButton = {
                Button(onClick = { showLogsDialog = false }) {
                    Text("Закрыть")
                }
            }
        )
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Управление сменой") },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Назад")
                    }
                }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(24.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Сотрудник:", fontSize = 16.sp, color = MaterialTheme.colorScheme.outline)
            Text(
                text = employeeName,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            if (isShiftActive) {
                Text(text = "СТАТУС: СМЕНА ОТКРЫТА", fontSize = 16.sp, color = MaterialTheme.colorScheme.primary, fontWeight = FontWeight.Bold)
                Text(
                    text = "Время начала: $shiftStartTime",
                    fontSize = 14.sp,
                    color = MaterialTheme.colorScheme.outline,
                    modifier = Modifier.padding(bottom = 32.dp)
                )

                // 1. Кнопка "ПРОДОЛЖИТЬ ОБХОД" (Основное действие)
                Button(
                    onClick = onContinueShift,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 12.dp)
                        .height(60.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary)
                ) {
                    Text("ПРОДОЛЖИТЬ ОБХОД", fontSize = 18.sp, fontWeight = FontWeight.Bold)
                }

                // 2. 🔥 НОВАЯ КНОПКА «ПОСМОТРЕТЬ МОИ ОБХОДЫ»
                Button(
                    onClick = { showLogsDialog = true },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 24.dp)
                        .height(50.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.secondary)
                ) {
                    Text("ПОСМОТРЕТЬ МОИ ОБХОДЫ", fontSize = 16.sp, fontWeight = FontWeight.SemiBold)
                }

                // 3. Кнопка СТОП (Завершить смену)
                OutlinedButton(
                    onClick = {
                        prefsManager.generateExcelReport(employeeName)
                        prefsManager.closeCurrentShift()
                        isShiftActive = false
                        onShiftClosedSuccess()
                    },
                    modifier = Modifier.fillMaxWidth().height(50.dp),
                    colors = ButtonDefaults.outlinedButtonColors(contentColor = MaterialTheme.colorScheme.error),
                    border = BorderStroke(1.dp, MaterialTheme.colorScheme.error)
                ) {
                    Text("ЗАВЕРШИТЬ СМЕНУ (СТОП)", fontSize = 16.sp, fontWeight = FontWeight.Bold)
                }

            } else {
                // ЕСЛИ СМЕНА ЕЩЕ НЕ НАЧАТА
                Text(text = "СТАТУС: СМЕНА ЗАКРЫТА", fontSize = 16.sp, color = MaterialTheme.colorScheme.error, fontWeight = FontWeight.Bold, modifier = Modifier.padding(bottom = 48.dp))

                // КНОПКА СТАРТ
                Button(
                    onClick = {
                        val currentTime = dateTimeFormat.format(Date())
                        prefsManager.startNewShift(employeeName, currentTime)
                        isShiftActive = true
                        onStartShiftSuccess()
                    },
                    modifier = Modifier.fillMaxWidth().height(64.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary)
                ) {
                    Text("НАЧАТЬ СМЕНУ (СТАРТ)", fontSize = 18.sp, fontWeight = FontWeight.Bold)
                }
            }
        }
    }
}
