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
    object ShiftReportTrigger : QrResult() // Новый тип для вызова отчета
    data class Error(val message: String) : QrResult()
}

// Перенесено СЮДА (вне QrResult), чтобы класс был доступен напрямую
data class CheckpointEntry(
    val type: String,
    val titleOrLocation: String,
    val userResult: String,
    val timestamp: String
)

object QrHandler {

    // Добавлен пробел после private (было privateval)
    private val shiftLogs = mutableListOf<CheckpointEntry>()

    fun parseQrCode(rawText: String): QrResult {
        val trimmed = rawText.trim()

        // Проверка на команду вызова отчета о смене
        if (trimmed.contains("отчет о смене") || trimmed == "отчет о смене") {
            return QrResult.ShiftReportTrigger
        }

        if (trimmed.startsWith("{") && trimmed.endsWith("}")) {
            return try {
                val json = JSONObject(trimmed)

                if (json.has("action") && json.getString("action") == "question") {
                    val text = json.getString("text")
                    val jsonArray = json.getJSONArray("answers")
                    val answersList = mutableListOf<String>()
                    for (i in 0 until jsonArray.length()) {
                        answersList.add(jsonArray.getString(i))
                    }
                    QrResult.QuestionFormat(text, answersList)

                } else if (json.has("type") && json.getString("type") == "input") {
                    val title = json.getString("title")
                    QrResult.InputFormat(title)

                } else {
                    QrResult.Error("Неизвестный формат JSON")
                }
            } catch (e: Exception) {
                QrResult.Error("Ошибка синтаксиса JSON: ${e.localizedMessage}")
            }
        } else {
            val currentTime =
                SimpleDateFormat("dd.MM.yyyy HH:mm:ss", Locale.getDefault()).format(Date())
            return QrResult.LocationCheckpoint(name = trimmed, timestamp = currentTime)
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
        val currentTime =
            SimpleDateFormat("dd.MM.yyyy HH:mm:ss", Locale.getDefault()).format(Date())
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
        builder.append(
            "Сгенерирован: ${
                SimpleDateFormat(
                    "dd.MM.yyyy HH:mm:ss",
                    Locale.getDefault()
                ).format(Date())
            }\n"
        )
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
