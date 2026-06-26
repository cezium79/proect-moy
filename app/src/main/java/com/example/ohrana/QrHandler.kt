package com.example.ohrana

import org.json.JSONObject
import java.text.SimpleDateFormat
import java.util.*

// 1. ОБНОВЛЕННАЯ МОДЕЛЬ ДАННЫХ ДЛЯ ЗАПИСИ В ЛОГ
// Добавлены поля id, userResult (теперь может быть null) и photoPath (для будущего)
data class CheckpointEntry(
    val id: String,
    val type: String,
    val titleOrLocation: String,
    val userResult: String? = null, // Может хранить ответ "Да/Нет", введенное число и т.д.
    val photoPath: String? = null, // Предусмотрено для будущего (фото)
    val timestamp: String
)

// 2. ОБНОВЛЕННАЯ СИСТЕМА РЕЗУЛЬТАТОВ ПАРСИНГА
// Теперь все виды чекпоинтов описываются одним классом Checkpoint
sealed class QrResult {
    data class Checkpoint(
        val id: String,
        val name: String,
        val action: String? = null, // "question", "input", "photo" или null для простого чекпоинта
        val text: String? = null,
        val answers: List<String>? = null,
        val placeholder: String? = null
    ) : QrResult()

    object ShiftReportTrigger : QrResult()
    data class Error(val message: String) : QrResult()
}

// 3. ГЛАВНЫЙ ОБЪЕКТ ДЛЯ РАБОТЫ С QR-КОДАМИ
object QrHandler {

    private val dateFormat = SimpleDateFormat("dd.MM.yyyy HH:mm:ss", Locale.US)

    // В памяти хранятся все события смены
    private val shiftLogs = mutableListOf<CheckpointEntry>()

    // --- ОСНОВНОЙ МЕТОД ПАРСИНГА ---
    fun parseQrCode(rawText: String): QrResult {
        val trimmed = rawText.trim()

        // Проверка на команду вызова отчета (сработает мгновенно)
        if (trimmed.equals("отчет о смене", ignoreCase = true)) {
            return QrResult.ShiftReportTrigger
        }

        // Если это не JSON-объект, сразу ошибка
        if (!trimmed.startsWith("{") || !trimmed.endsWith("}")) {
            return QrResult.Error("Игнорируется: это не рабочий QR-код системы")
        }

        return try {
            val json = JSONObject(trimmed)

            // Жесткая проверка на тип "checkpoint"
            if (json.getString("type") == "checkpoint") {
                val id = json.getString("id")
                val name = json.getString("name")

                // Используем optString, чтобы избежать исключения, если поля нет.
                // Если поле есть, но пустое - вернет пустую строку.
                val action = json.optString("action")
                val text = json.optString("text")
                val placeholder = json.optString("placeholder")

                // Безопасная обработка массива ответов
                val answers = if (json.has("answers") && !json.isNull("answers")) {
                    val jsonArray = json.getJSONArray("answers")
                    List(jsonArray.length()) { jsonArray.getString(it) }
                } else {
                    null
                }

                return QrResult.Checkpoint(
                    id = id,
                    name = name,
                    action = if (action.isNotEmpty()) action else null,
                    text = if (text.isNotEmpty()) text else null,
                    placeholder = if (placeholder.isNotEmpty()) placeholder else null,
                    answers = answers
                )
            } else {
                QrResult.Error("Игнорируется: неизвестный тип данных")
            }
        } catch (e: Exception) {
            QrResult.Error("Игнорируется: невалидный JSON-формат")
        }
    }


    // --- МЕТОДЫ СОХРАНЕНИЯ И ГЕНЕРАЦИИ ОТЧЕТА ---
    // Эти методы остаются, но в идеале должны быть перемещены в отдельный Repository

    fun saveUserResponse(entry: CheckpointEntry) {
        shiftLogs.add(entry)
    }

    fun generateFullReport(): String {
        if (shiftLogs.isEmpty()) {
            return "Отчет пуст. За смену не было зафиксировано ни одного сканирования."
        }

        val builder = StringBuilder()
        builder.append("=== ОТЧЕТ О СМЕНЕ ОХРАНЫ ===\n")
        builder.append("Сгенерирован: ${dateFormat.format(Date())}\n")
        builder.append("----------------------------------------\n")

        shiftLogs.forEachIndexed { index, entry ->
            builder.append("${index + 1}. [${entry.timestamp}]\n")
            builder.append(" Тип: ${entry.type}\n")
            builder.append(" Объект: ${entry.titleOrLocation}\n")
            builder.append(" Результат/Ответ: ${entry.userResult ?: "нет ответа"}\n")
            builder.append("----------------------------------------\n")
        }

        return builder.toString()
    }
}