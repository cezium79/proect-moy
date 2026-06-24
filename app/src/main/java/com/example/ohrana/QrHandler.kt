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

    // Сохранение обычной текстовой точки (Тип 3) автоматически
    fun saveLocationCheckpoint(name: String, timestamp: String) {
        shiftLogs.add(
            CheckpointEntry(
                type = "Метка локации",
                titleOrLocation = name,
                userResult = "Отметка пройдена",
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
