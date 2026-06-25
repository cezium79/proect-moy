package com.example.ohrana

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AlarmReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        val alarmId = intent.getIntExtra("ALARM_ID", -1)
        val alarmTime = intent.getSerializableExtra("ALARM_TIME") ?: "00:00"

        // ТУТ БУДЕТ ВАША ЛОГИКА (Например, запуск экрана тревоги или отправка Push-уведомления)
        // Сейчас для теста выведем Toast и запустим стандартную вибрацию/рингтон, если нужно
        Toast.makeText(
            context,
            "⏰ СРАБОТАЛ БУДИЛЬНИК! Время обхода №$alarmId ($alarmTime)",
            Toast.LENGTH_LONG
        ).show()

        // Пример: Можно открыть OhrannikScreen при срабатывании
        /*
        val launchIntent = context.packageManager.getLaunchIntentForPackage(context.packageName)?.apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        }
        context.startActivity(launchIntent)
        */
    }
}


