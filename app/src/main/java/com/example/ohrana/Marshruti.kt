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
    // Инициализируем менеджер памяти
    val context = LocalContext.current
    val prefsManager = remember { SharedPrefsManager(context) }

    // 1. Загружаем сохраненное количество обходов
    var roundsCount by remember { mutableStateOf(prefsManager.loadRouteRoundsCount()) }

    // 2. Загружаем сохраненный список временных полей
    val roundTimes = remember { mutableStateListOf<String>().apply { addAll(prefsManager.loadRouteTimes()) } }

    // Синхронизация количества полей времени со счетчиком обходов
    LaunchedEffect(roundsCount) {
        if (roundTimes.size < roundsCount) {
            while (roundTimes.size < roundsCount) {
                roundTimes.add("")
            }
        } else if (roundTimes.size > roundsCount) {
            while (roundTimes.size > roundsCount) {
                roundTimes.removeAt(roundTimes.lastIndex)
            }
        }
    }

    // Загружаем сохраненный допуск к началу обхода
    var timeToleranceMinutes by remember { mutableStateOf(prefsManager.loadRouteTolerance()) }

    // 3. Загружаем сохраненные обязательные точки обхода
    var newPointInput by remember { mutableStateOf("") }
    val checkpointList = remember { mutableStateListOf<String>().apply { addAll(prefsManager.loadRouteCheckpoints()) } }

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

            // --- РАЗДЕЛ 2: ДИНАМИЧЕСКОЕ РАСПИСАНИЕ И ДОПУСКИ ---
            item {
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant)
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text("2. Расписание и временные рамки", fontSize = 16.sp, style = MaterialTheme.typography.titleMedium)
                        Spacer(modifier = Modifier.height(12.dp))

                        roundTimes.forEachIndexed { index, timeValue ->
                            OutlinedTextField(
                                value = timeValue,
                                onValueChange = { newValue -> roundTimes[index] = newValue },
                                label = { Text("Время начала обхода №${index + 1} (например, 08:00)") },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(bottom = 8.dp)
                            )
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

            // Вывод уменьшенных чек-поинтов
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
                        // Сохраняем все данные в SharedPreferences перед выходом
                        prefsManager.saveRouteSettings(
                            roundsCount = roundsCount,
                            times = roundTimes.toList(),
                            tolerance = timeToleranceMinutes,
                            checkpoints = checkpointList.toList()
                        )
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
