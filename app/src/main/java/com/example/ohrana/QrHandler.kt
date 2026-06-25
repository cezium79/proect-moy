package com.example.ohrana

import org.json.JSONObject
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

// 1. Все возможные исходы сканирования
sealed class QrResult {
    data class QuestionFormat(val text: String, val answers: List<String>) : QrResult()
    data class InputFormat(val title: String) : QrResult()
    data class LocationCheckpoint(val name: String, val timestamp: String) : QrResult()
    object ShiftReportTrigger : QrResult() // Тип для вызова отчета
    data class Error(val message: String) : QrResult()
}

// Модель данных записи для отчета
data class CheckpointEntry(
    val type: String,
    val titleOrLocation: String,
    val userResult: String,
    val timestamp: String
)

object QrHandler {

    // Единый формат даты для всего класса
    private val dateFormat = SimpleDateFormat("dd.MM.yyyy HH:mm:ss", Locale.US)

    // Список логов в памяти устройства
    private val shiftLogs = mutableListOf<CheckpointEntry>()

    fun parseQrCode(rawText: String): QrResult {
        val trimmed = rawText.trim()

        // 1. Проверка на точную команду вызова отчета (сработает мгновенно)
        if (trimmed.equals("отчет о смене", ignoreCase = true)) {
            return QrResult.ShiftReportTrigger
        }

        // 2. Строгая проверка: если это не JSON, сразу игнорируем любой другой простой текст
        if (!trimmed.startsWith("{") || !trimmed.endsWith("}")) {
            return QrResult.Error("Игнорируется: это не рабочий QR-код системы")
        }

        return try {
            val json = JSONObject(trimmed)

            // Проверяем тип JSON-документа
            when {
                // Обработчик для валидных точек контроля (чекпоинтов)
                json.has("type") && json.getString("type") == "checkpoint" -> {
                    val name = json.getString("name")
                    val currentTime = dateFormat.format(Date())
                    QrResult.LocationCheckpoint(name = name, timestamp = currentTime)
                }

                // Обработчик вопросов
                json.has("action") && json.getString("action") == "question" -> {
                    val text = json.getString("text")
                    val jsonArray = json.getJSONArray("answers")
                    val answersList = List(jsonArray.length()) { jsonArray.getString(it) }
                    QrResult.QuestionFormat(text, answersList)
                }

                // Обработчик полей ввода
                json.has("type") && json.getString("type") == "input" -> {
                    val title = json.getString("title")
                    QrResult.InputFormat(title)
                }

                // Если JSON корректный, но поля неизвестны
                else -> QrResult.Error("Игнорируется: неизвестный тип данных")
            }
        } catch (e: Exception) {
            // Если внутри скобок оказался сломанный текст
            QrResult.Error("Игнорируется: невалидный JSON-формат")
        }
    }

        // 🔥 ПОЛНОСТЬЮ ИСПРАВЛЕННЫЙ МЕТОД РАСЧЕТА ВРЕМЕНИ ОБХОДОВ
    fun saveLocationCheckpoint(context: android.content.Context, name: String, timestamp: String) {
        val sharedPrefsManager = SharedPrefsManager(context)

        // 1. Загружаем сохраненные будильники
        val savedAlarms = sharedPrefsManager.loadRouteAlarms()

        // ⏱️ Читаем допуск напрямую из SharedPreferences (по умолчанию 15 минут)
        val localPrefs = context.getSharedPreferences("OhranaPrefs", android.content.Context.MODE_PRIVATE)
        val toleranceString = localPrefs.getString("route_tolerance_key", "15") ?: "15"
        val tolerance = toleranceString.toIntOrNull() ?: 15

        var finalStatus = "Отметка пройдена вне расписания"

        if (savedAlarms.isNotEmpty()) {
            try {
                // Вырезаем "HH:mm" из строки вида "dd.MM.yyyy HH:mm:ss"
                val timePartString = timestamp.substringAfter(" ").substringBeforeLast(":") // Результат: "14:30"
                val currentParts = timePartString.split(":")

                if (currentParts.size == 2) {
                    // Используем ЖЕСТКИЕ индексы [0] для часов и [1] для минут
                    val currentHours = currentParts[0].toIntOrNull() ?: 0
                    val currentMinutes = currentParts[1].toIntOrNull() ?: 0
                    val currentMinutesTotal = currentHours * 60 + currentMinutes

                    var closestAlarm: RouteAlarm? = null
                    var minDifference = Int.MAX_VALUE

                    // Поиск ближайшего включенного будильника администратора
                    for (alarm in savedAlarms) {
                        if (!alarm.isEnabled) continue

                        val alarmParts = alarm.time.split(":")
                        if (alarmParts.size == 2) {
                            // Используем ЖЕСТКИЕ индексы [0] и [1]
                            val alarmHours = alarmParts[0].toIntOrNull() ?: 0
                            val alarmMinutes = alarmParts[1].toIntOrNull() ?: 0
                            val alarmMinutesTotal = alarmHours * 60 + alarmMinutes

                            val diff = currentMinutesTotal - alarmMinutesTotal

                            if (java.lang.Math.abs(diff) < java.lang.Math.abs(minDifference)) {
                                minDifference = diff
                                closestAlarm = alarm
                            }
                        }
                    }

                    // 2. Сравнение с допуском обхода (tolerance)
                    closestAlarm?.let { alarm ->
                        val absDiff = java.lang.Math.abs(minDifference)
                        finalStatus = when {
                            absDiff <= tolerance -> "Вовремя (Обход №${alarm.id})"
                            minDifference > 0 -> "Опоздание на $absDiff мин (Обход №${alarm.id})"
                            else -> "Раньше графика на $absDiff мин (Обход №${alarm.id})"
                        }
                    }
                }
            } catch (e: Exception) {
                // Если парсинг упадет, запишем ошибку в системный лог Android Studio
                android.util.Log.e("QrHandlerError", "Ошибка расчета времени обхода: ${e.message}")
                finalStatus = "Отметка пройдена (Ошибка расчета)"
            }
        }

        // Записываем итоговый результат в локальный журнал текущей смены
        shiftLogs.add(
            CheckpointEntry(
                type = "Метка локации",
                titleOrLocation = name,
                userResult = finalStatus,
                timestamp = timestamp
            )
        )
    }



    // Сохранение ответов на вопросы или введенных показаний счетчиков (Типы 1 и 2)
    fun saveUserResponse(type: String, title: String, response: String) {
        val currentTime = dateFormat.format(Date()) // Исправлено на использование dateFormat
        shiftLogs.add(
            CheckpointEntry(
                type = type,
                titleOrLocation = title,
                userResult = response,
                timestamp = currentTime
            )
        )
    }

    // Генерация финального текстового отчета
    fun generateFullReport(): String {
        if (shiftLogs.isEmpty()) {
            return "Отчет пуст. За смену не было зафиксировано ни одного сканирования."
        }
        val builder = StringBuilder()
        builder.append("=== ОТЧЕТ О СМЕНЕ ОХРАНЫ ===\n")
        builder.append("Сгенерирован: ${dateFormat.format(Date())}\n") // Исправлено на использование dateFormat
        builder.append("----------------------------------------\n")
        shiftLogs.forEachIndexed { index, entry ->
            builder.append("${index + 1}. [${entry.timestamp}]\n")
            builder.append("   Тип: ${entry.type}\n")
            builder.append("   Объект: ${entry.titleOrLocation}\n")
            builder.append("   Результат/Ответ: ${entry.userResult}\n")
            builder.append("----------------------------------------\n")
        }
        return builder.toString()
    }
}
