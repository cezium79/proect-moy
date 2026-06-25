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

    // Формат даты вынесен в константу для единообразия логов
    private val dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US)
    // --- МЕТОДЫ УПРАВЛЕНИЯ СМЕНОЙ ОХРАННИКА ---

    // Начать новую смену (сохраняем имя и время старта)
    fun startNewShift(employeeName: String, startTime: String) {
        prefs.edit().apply {
            putString("active_shift_employee", employeeName)
            putString("active_shift_start_time", startTime)
            putBoolean("active_shift_is_running", true)
            apply()
        }
    }

    // Проверить, идет ли сейчас активная смена у конкретного сотрудника
    fun isShiftActiveFor(employeeName: String): Boolean {
        val savedName = prefs.getString("active_shift_employee", "") ?: ""
        val isRunning = prefs.getBoolean("active_shift_is_running", false)
        return isRunning && savedName == employeeName
    }

    // Получить время начала текущей смены
    fun getShiftStartTime(): String = prefs.getString("active_shift_start_time", "-") ?: "-"

    // Закрыть смену
    fun closeCurrentShift() {
        prefs.edit().apply {
            putBoolean("active_shift_is_running", false)
            remove("active_shift_employee")
            remove("active_shift_start_time")
            apply()
        }
    }
    // Получить имя сотрудника, у которого сейчас открыта смена (чтобы сделать автопереход)
    fun getActiveShiftEmployeeName(): String {
        val isRunning = prefs.getBoolean("active_shift_is_running", false)
        return if (isRunning) {
            prefs.getString("active_shift_employee", "") ?: ""
        } else {
            ""
        }
    }


// --- УПРАВЛЕНИЕ АКТИВНЫМ ОБХОДОМ ---

    // Запустить конкретный обход по его номеру (индексу)
    fun startRound(roundIndex: Int, startTime: String) {
        prefs.edit().apply {
            putInt("active_shift_current_round_index", roundIndex)
            putString("round_${roundIndex}_start_time", startTime)
            putString("round_${roundIndex}_scanned_points", "") // Очищаем отсканированные точки для этого обхода
            apply()
        }
    }

    // Получить индекс обхода, который выполняется прямо сейчас (-1 означает, что никакой обход не запущен)
    fun getActiveRoundIndex(): Int = prefs.getInt("active_shift_current_round_index", -1)

    // Получить время начала конкретного обхода
    fun getRoundStartTime(roundIndex: Int): String = prefs.getString("round_${roundIndex}_start_time", "-") ?: "-"


    // (Ваши старые методы loadEmployees и saveEmployees остаются здесь без изменений)
    fun loadEmployees(): List<Employee> {
        // Здесь ваша оригинальная логика загрузки сотрудников
        return emptyList()
    }
    // --- СОХРАНЕНИЕ НАСТРОЕК МАРШРУТА И РАСПИСАНИЯ ---
    fun saveRouteSettings(roundsCount: Int, times: List<String>, tolerance: String, checkpoints: List<String>) {
        prefs.edit().apply {
            putInt("route_rounds_count", roundsCount)
            putString("route_times", times.joinToString(","))
            putString("route_tolerance", tolerance)
            putString("route_checkpoints", checkpoints.joinToString(","))
            apply()
        }
    }

    fun loadRouteRoundsCount(): Int = prefs.getInt("route_rounds_count", 3)

    fun loadRouteTimes(): List<String> {
        val raw = prefs.getString("route_times", "") ?: ""
        if (raw.isEmpty()) return listOf("08:00", "14:00", "20:00") // Базовые значения
        return raw.split(",")
    }

    fun loadRouteTolerance(): String = prefs.getString("route_tolerance", "15") ?: "15"

    fun loadRouteCheckpoints(): List<String> {
        val raw = prefs.getString("route_checkpoints", "") ?: ""
        if (raw.isEmpty()) return listOf("Точка_Вход", "Точка_Склад_1", "Точка_Забор") // Базовые значения
        return raw.split(",")
    }


    fun saveEmployees(list: List<Employee>) {
        // Здесь ваша оригинальная логика сохранения сотрудников
    }

    // Сохранение логов сканирования в SharedPrefs (в виде простой строки для упрощения)
    fun saveScanResult(employeeName: String, qrContent: String) {
        val currentTime = dateFormat.format(Date())
        val currentLogs = prefs.getString("qr_logs", "") ?: ""

        // Очищаем контент от точек с запятой и переносов, чтобы не ломать структуру CSV таблицы
        val safeContent = qrContent.replace(";", " ").replace("\n", " ")
        val logLine = "$employeeName;$currentTime;$safeContent"

        val newLogs = if (currentLogs.isEmpty()) {
            logLine
        } else {
            "$currentLogs\n$logLine"
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
        val fileTimestamp = SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(Date())
        val fileName = "Отчет_${employeeName.replace(" ", "_")}_$fileTimestamp.csv"

        // Создаем файл во внутреннем хранилище (доступно для просмотра внутри приложения)
        val reportsDir = File(context.filesDir, "reports")
        if (!reportsDir.exists()) reportsDir.mkdirs()

        val file = File(reportsDir, fileName)

        try {
            // Открываем поток записи строго в кодировке UTF-8
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
    // Сохранение состояния переключателя (Вкл/Игнор) для конкретного обхода
    fun saveAlarmEnabledState(roundIndex: Int, isEnabled: Boolean) {
        sharedPreferences.edit().putBoolean("ROUND_ALARM_ENABLED_$roundIndex", isEnabled).apply()
    }

    // Загрузка состояния переключателя (по умолчанию true — будильник включен)
    fun loadAlarmEnabledState(roundIndex: Int): Boolean {
        return sharedPreferences.getBoolean("ROUND_ALARM_ENABLED_$roundIndex", true)
    }

    // Перезапись всех временных интервалов для обходов
    fun saveRouteTimes(times: List<String>) {
        // Преобразуем список в упорядоченную строку-массив или набор строк
        val timesSet = times.mapIndexed { index, time -> "$index:$time" }.toSet()
        sharedPreferences.edit().putStringSet("ROUND_TIMES_SET", timesSet).apply()
    }

    // Загрузка сохраненного расписания обходов с восстановлением их порядка
    fun loadRouteTimes(): List<String> {
        val timesSet = sharedPreferences.getStringSet("ROUND_TIMES_SET", emptySet()) ?: emptySet()
        if (timesSet.isEmpty()) return emptyList()

        // Восстанавливаем элементы по их сохраненному индексу, чтобы порядок не нарушался
        return timesSet
            .mapNotNull { item ->
                val parts = item.split(":", limit = 2)
                val index = parts.getOrNull(0)?.toIntOrNull()
                val time = parts.getOrNull(1)
                if (index != null && time != null) index to time else null
            }
            .sortedBy { it.first }
            .map { it.second }
    }
    // 2. 🔥 ДОБАВЛЯЕМ НОВУЮ ФУНКЦИЮ С ДРУГИМ ИМЕНЕМ (Специально для наших будильников)
    fun saveRouteAlarms(alarms: List<RouteAlarm>) {
        val stringSet = alarms.map { "${it.id}|${it.time}|${it.isEnabled}" }.toSet()
        sharedPrefs.edit().putStringSet("route_alarms_key", stringSet).apply()
    }

    fun loadRouteAlarms(): List<RouteAlarm> {
        val stringSet = sharedPrefs.getStringSet("route_alarms_key", null) ?: return emptyList()
        return stringSet.mapNotNull { savedString ->
            val parts = savedString.split("|")
            if (parts.size == 3) {
                RouteAlarm(
                    id = parts[0].toIntOrNull() ?: return@mapNotNull null,
                    time = parts[1],
                    isEnabled = parts[2].toBooleanStrictOrNull() ?: true
                )
            } else null
        }.sortedBy { it.id } // Сортируем по ID, чтобы порядок не нарушался
    }

}
