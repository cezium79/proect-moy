package com.example.ohrana

import android.content.Context
import java.io.File
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

// Модель для сохранения сканирований
data class QrScanRecord(val employeeName: String, val time: String, val qrContent: String)

class SharedPrefsManager(private val context: Context) {
    private val prefs = context.getSharedPreferences("ohrana_prefs", Context.MODE_PRIVATE)

    // (Ваши старые методы loadEmployees и saveEmployees остаются здесь без изменений)
    fun loadEmployees(): List<Employee> { /* ... */ return emptyList() }
    fun saveEmployees(list: List<Employee>) { /* ... */ }

    // Сохранение логов сканирования в SharedPrefs (в виде простой строки для упрощения)
    fun saveScanResult(employeeName: String, qrContent: String) {
        val currentTime = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(Date())
        val currentLogs = prefs.getString("qr_logs", "") ?: ""
        val newLogs = if (currentLogs.isEmpty()) {
            "$employeeName;$currentTime;$qrContent"
        } else {
            "$currentLogs\n$employeeName;$currentTime;$qrContent"
        }
        prefs.edit().putString("qr_logs", newLogs).apply()
    }

    // Получение всех логов
    fun getScanLogs(): List<QrScanRecord> {
        val logsString = prefs.getString("qr_logs", "") ?: ""
        if (logsString.isEmpty()) return emptyList()

        return logsString.split("\n").mapNotNull { line ->
            val parts = line.split(";")
            if (parts.size == 3) QrScanRecord(parts[0], parts[1], parts[2]) else null
        }
    }

    // Очистка логов после генерации отчета
    fun clearScanLogs() {
        prefs.edit().remove("qr_logs").apply()
    }

    // Генерация CSV отчета для Excel
    fun generateExcelReport(employeeName: String): File? {
        val logs = getScanLogs()
        val timestamp = SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(Date())
        val fileName = "Отчет_${employeeName.replace(" ", "_")}_$timestamp.csv"

        // Создаем файл во внутреннем хранилище (доступно для просмотра внутри приложения)
        val reportsDir = File(context.filesDir, "reports")
        if (!reportsDir.exists()) reportsDir.mkdirs()

        val file = File(reportsDir, fileName)

        try {
            // ИСПРАВЛЕНИЕ: открываем поток записи строго в кодировке UTF-8
            file.bufferedWriter(charset = Charsets.UTF_8).use { writer ->

                // Записываем правильный UTF-8 BOM маркер, чтобы Excel сразу понял русский язык
                writer.write("\uFEFF")

                // Заголовки столбцов
                writer.write("Сотрудник;Дата и Время;Данные QR-кода\n")

                // Запись накопленных данных
                for (log in logs) {
                    writer.write("${log.employeeName};${log.time};${log.qrContent}\n")
                }
            }
            // После успешной записи отчета очищаем текущие логи
            clearScanLogs()
            return file
        } catch (e: Exception) {
            e.printStackTrace()
            return null
        }

    }

    // Получить список всех файлов отчетов
    fun getReportsList(): List<File> {
        val reportsDir = File(context.filesDir, "reports")
        return reportsDir.listFiles()?.filter { it.isFile && it.extension == "csv" }?.toList() ?: emptyList()
    }
}


