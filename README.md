# 🛡️ Приложение «Охрана» (Ohrana)

Android-приложение на базе **Kotlin** и **Jetpack Compose**, предназначенное для автоматизации работы службы безопасности и цифрового контроля обходов. Проект использует современную систему сборки **Gradle (Kotlin DSL)** с централизованным управлением зависимостями через Version Catalogs.

---

## 🚀 Основной функционал

Приложение разделено на логические блоки для управления сменами, маршрутами и отчетностью:

*   **🔐 Авторизация и роли:** Разграничение интерфейса для администраторов (`AdministratorScreen`) и сотрудников охраны (`OhrannikScreen`, `OhrannikCabinetScreen`).
*   **📍 Контроль обходов:** Мониторинг и управление рабочими сменами (`OhrannikShiftControl`) и маршрутами движения (`Marshruti`).
*   **📷 Сканер QR-кодов:** Интеграция модуля `QrHandler` для сканирования контрольных точек на объекте.
*   **📋 Отчетность:** Просмотр и формирование рапортов или журналов событий (`SpisokOtchetov`).
*   **💾 Локальное хранение:** Менеджер `SharedPrefsManager` для быстрого сохранения сессий и настроек пользователя.

---

## 📂 Структура проекта

Ниже представлен разбор ключевых директорий исходного кода приложения:

com.example.ohrana/
│
├── MainActivity.kt               # Главная точка входа в приложение
├── Marshruti.kt                  # Навигация между экранами проекта
│
├── ui/theme/                     # Стили, цвета и типографика (Compose)
│   ├── Color.kt
│   ├── Theme.kt
│   └── Type.kt
│
├── QrHandler.kt                  # Обработка данных из QR-кодов
├── SharedPrefsManager.kt         # Локальное хранилище настроек и сессий
│
├── screens/                      # Экраны пользовательского интерфейса
│   ├── PrivetScreen.kt           # Экран приветствия / авторизации
│   ├── AdministratorScreen.kt    # Панель администратора
│   ├── EmployeeListScreen.kt     # Список сотрудников для админа
│   ├── OhrannikScreen.kt         # Основной рабочий экран охранника
│   ├── OhrannikCabinetScreen.kt  # Личный кабинет охранника
│   └── SpisokOtchetov.kt         # Просмотр и отправка отчетов
│
├── control/                      # Логика контроля смен и расписания
│   ├── Employee.kt               # Модель данных сотрудника
│   └── OhrannikShiftControl.kt   # Логика управления сменами
│
└── alarm/                        # Модуль планировщика задач и тревог
├── AlarmModel.kt             # Модель данных напоминания/будильника
├── AlarmScheduler.kt         # Интерфейс и реализация планировщика
├── AlarmReceiver.kt          # Приемник системных событий AlarmManager
└── AlarmService.kt           # Фоновая служба для обработки будильников

```

---

## 🛠️ Стек технологий

*   **Язык программирования:** Kotlin
*   **Архитектура UI:** Jetpack Compose (Declarative UI)
*   **Система сборки:** Gradle (Kotlin DSL) + Gradle Wrapper
*   **Управление зависимостями:** Gradle Version Catalogs (`libs.versions.toml`)
*   **Тестирование:** JUnit (`ExampleUnitTest`) и Espresso/Compose UI Test (`ExampleInstrumentedTest`)

---

## 💻 Развертывание и сборка

### Требования
*   Android Studio (рекомендуется актуальная версия Hedgehog / Iguana или новее)
*   JDK 17+

### Сборка проекта
Для сборки проекта из терминала используйте Gradle Wrapper:

**Windows:**
```bash
./gradlew.bat assembleDebug
```

**Linux / macOS:**
```bash
./gradlew assembleDebug
```

---

## ⚙️ Полезная информация для разработчиков

*   **Кэширование сборки:** В проекте активно используется `Configuration Cache`. В случае возникновения проблем с плагинами, интерактивные отчеты сборщика генерируются в папку `build/reports/configuration-cache/`.
*   **Логи компилятора:** Внутренний кэш компилятора Kotlin и логи ошибок (при наличии) находятся в локальной директории `.kotlin/errors/`.
*   **Игнорирование файлов:** Сборка, локальные настройки (`local.properties`) и кэш IDE (`.idea/`, `.gradle/`, `build/`) автоматически исключены из отслеживания Git.


implementation - Implementation only dependencies for 'main' sources. (n)
+--- androidx.compose.runtime:runtime (n)
+--- androidx.compose.ui:ui (n)
+--- androidx.compose:compose-bom:2024.02.02 (n)
+--- androidx.activity:activity-compose:1.13.0 (n)
+--- androidx.compose.material3:material3 (n)
+--- androidx.compose.ui:ui (n)
+--- androidx.compose.ui:ui-graphics (n)
+--- androidx.compose.ui:ui-text:1.11.3 (n)
+--- androidx.compose.ui:ui-tooling-preview (n)
+--- androidx.core:core-ktx:1.15.0 (n)
+--- androidx.glance:glance:1.1.1 (n)
+--- androidx.lifecycle:lifecycle-runtime-ktx:2.8.7 (n)
+--- androidx.compose.material:material-icons-core (n)
+--- com.google.code.gson:gson:2.10.1 (n)
+--- androidx.camera:camera-core:1.4.0 (n)
+--- androidx.camera:camera-camera2:1.4.0 (n)
+--- androidx.camera:camera-lifecycle:1.4.0 (n)
+--- androidx.camera:camera-view:1.4.0 (n)
+--- androidx.camera:camera-mlkit-vision:1.4.0 (n)
+--- com.google.mlkit:barcode-scanning:17.3.0 (n)
+--- com.google.mlkit:text-recognition:16.0.1 (n)
\--- com.google.mlkit:barcode-scanning:17.2.0 (n)
