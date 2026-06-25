package com.example.ohrana

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MarshrutiScreen(
    onBack: () -> Unit
) {
    val savedAlarms = remember { sharedPrefsManager.loadRouteAlarms() }
    val routeAlarms = remember {
        mutableStateListOf<RouteAlarm>().apply {
            if (savedAlarms.isNotEmpty()) {
                addAll(savedAlarms)
            } else {
                // Дефолтный список, если приложение запущено впервые
                addAll(
                    listOf(
                        RouteAlarm(id = 1, time = "08:00", isEnabled = true),
                        RouteAlarm(id = 2, time = "14:00", isEnabled = true),
                        RouteAlarm(id = 3, time = "20:00", isEnabled = true)
                    )
                )
            }
        }
    }

    // Обновляем также начальное количество обходов на основе загруженных данных
    var roundsCount by remember { mutableStateOf(routeAlarms.size) }
    val context = LocalContext.current
    val sharedPrefsManager = remember { SharedPrefsManager(context) } // Ваша сессия памяти
    val alarmScheduler = remember { AlarmScheduler(context) }


    // 2. Список объектов будильников (вместо обычных строк)
    val routeAlarms = remember {
        mutableStateListOf(
            RouteAlarm(id = 1, time = "08:00", isEnabled = true),
            RouteAlarm(id = 2, time = "14:00", isEnabled = true),
            RouteAlarm(id = 3, time = "20:00", isEnabled = true)
        )
    }

    // Синхронизация количества полей времени и структуры будильников со счетчиком обходов
    LaunchedEffect(roundsCount) {
        if (routeAlarms.size < roundsCount) {
            while (routeAlarms.size < roundsCount) {
                val nextId = routeAlarms.size + 1
                routeAlarms.add(RouteAlarm(id = nextId, time = "", isEnabled = true))
            }
        } else if (routeAlarms.size > roundsCount) {
            while (routeAlarms.size > roundsCount) {
                routeAlarms.removeAt(routeAlarms.lastIndex)
            }
        }
    }

    // 🔥 АВТОКОРРЕКЦИЯ: При любом изменении списка будильников, данные отправляются в AlarmScheduler
    LaunchedEffect(routeAlarms.map { "${it.time}-${it.isEnabled}" }) {
        alarmScheduler.updateAlarms(routeAlarms.toList())
    }

    // Допуск к началу обхода (+- минут)
    var timeToleranceMinutes by remember { mutableStateOf("15") }

    // 3. Обязательные точки обхода (QR)
    var newPointInput by remember { mutableStateOf("") }
    val checkpointList = remember { mutableStateListOf("Точка_Вход", "Точка_Склад_1", "Точка_Забор") }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Настройка маршрутов и смен") },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Назад")
                    }
                }
            )
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            // --- РАЗДЕЛ 1: КОЛИЧЕСТВО ОБХОДОВ ---
            item {
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant)
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text("1. Обязательное количество обходов", fontSize = 16.sp, style = MaterialTheme.typography.titleMedium)
                        Spacer(modifier = Modifier.height(8.dp))
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(16.dp)
                        ) {
                            Button(onClick = { if (roundsCount > 1) roundsCount-- }) {
                                Text("-", fontSize = 20.sp)
                            }
                            Text("$roundsCount обходов за смену", fontSize = 18.sp)
                            Button(onClick = { roundsCount++ }) {
                                Text("+", fontSize = 20.sp)
                            }
                        }
                    }
                }
            }

            // --- РАЗДЕЛ 2: ДИНАМИЧЕСКОЕ РАСПИСАНИЕ, ПЕРЕКЛЮЧАТЕЛИ И ДОПУСКИ ---
            item {
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant)
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text("2. Расписание и временные рамки", fontSize = 16.sp, style = MaterialTheme.typography.titleMedium)
                        Spacer(modifier = Modifier.height(12.dp))

                        routeAlarms.forEachIndexed { index, alarm ->
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(bottom = 8.dp),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(12.dp)
                            ) {
                                // Поле ввода времени (Занимает основную ширину)
                                OutlinedTextField(
                                    value = alarm.time,
                                    onValueChange = { newValue ->
                                        routeAlarms[index] = alarm.copy(time = newValue)
                                    },
                                    label = { Text("Время обхода №${alarm.id} (например, 08:00)") },
                                    modifier = Modifier.weight(1f),
                                    singleLine = true
                                )

                                // 🔘 Переключатель подтверждения / игнорирования будильника
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center
                                ) {
                                    Text(
                                        text = if (alarm.isEnabled) "Вкл" else "Игнор",
                                        fontSize = 12.sp,
                                        color = if (alarm.isEnabled) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.outline
                                    )
                                    Switch(
                                        checked = alarm.isEnabled,
                                        onCheckedChange = { isChecked ->
                                            routeAlarms[index] = alarm.copy(isEnabled = isChecked)
                                        },
                                        colors = SwitchDefaults.colors(
                                            checkedThumbColor = MaterialTheme.colorScheme.primary,
                                            checkedTrackColor = MaterialTheme.colorScheme.primaryContainer
                                        )
                                    )
                                }
                            }
                        }

                        Spacer(modifier = Modifier.height(8.dp))

                        OutlinedTextField(
                            value = timeToleranceMinutes,
                            onValueChange = { timeToleranceMinutes = it },
                            label = { Text("Допуск к началу обхода (+- минут)") },
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                }
            }

            // --- РАЗДЕЛ 3: ОБЯЗАТЕЛЬНЫЕ ТОЧКИ ОБХОДА ---
            item {
                Text("3. Обязательные контрольные точки (QR)", fontSize = 16.sp, style = MaterialTheme.typography.titleMedium)
                Spacer(modifier = Modifier.height(8.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    OutlinedTextField(
                        value = newPointInput,
                        onValueChange = { newPointInput = it },
                        label = { Text("ID точки или текст QR-кода") },
                        modifier = Modifier.weight(1f)
                    )
                    IconButton(
                        onClick = {
                            if (newPointInput.isNotBlank()) {
                                checkpointList.add(newPointInput.trim())
                                newPointInput = ""
                            }
                        },
                        colors = IconButtonDefaults.iconButtonColors(containerColor = MaterialTheme.colorScheme.primary)
                    ) {
                        Icon(Icons.Default.Add, contentDescription = "Добавить", tint = MaterialTheme.colorScheme.onPrimary)
                    }
                }
            }

            items(checkpointList) { checkpoint ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(6.dp))
                        .background(MaterialTheme.colorScheme.secondaryContainer)
                        .padding(horizontal = 10.dp, vertical = 4.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = checkpoint,
                        fontSize = 14.sp,
                        color = MaterialTheme.colorScheme.onSecondaryContainer,
                        modifier = Modifier.weight(1f)
                    )

                    IconButton(
                        onClick = { checkpointList.remove(checkpoint) },
                        modifier = Modifier.size(32.dp)
                    ) {
                        Icon(
                            Icons.Default.Delete,
                            contentDescription = "Удалить",
                            tint = MaterialTheme.colorScheme.error,
                            modifier = Modifier.size(18.dp)
                        )
                    }
                }
            }

            // Кнопка сохранения настроек
            item {
                Spacer(modifier = Modifier.height(8.dp))
                Button(
                    onClick = {
                        // Сохраняем в память телефона перед выходом
                        sharedPrefsManager.saveRouteAlarms(routeAlarms.toList())
                        onBack()
                    },
                    modifier = Modifier.fillMaxWidth().height(50.dp)
                ) {
                    Text("Сохранить настройки маршрута", fontSize = 16.sp)
                }

            }
        }
    }
}
