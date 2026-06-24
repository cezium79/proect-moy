plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.compose)
    }

android {
    namespace = "com.example.ohrana"
    compileSdk {
        version = release(36)
    }

    defaultConfig {
        applicationId = "com.example.ohrana"
        minSdk = 24
        targetSdk = 36
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            optimization {
                enable = false
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    buildFeatures {
        compose = true
    }
    testOptions {
        unitTests.isIncludeAndroidResources = false
    }

}

dependencies {
    implementation("androidx.compose.runtime:runtime")
    implementation("androidx.compose.ui:ui")
    implementation(platform("androidx.compose:compose-bom:2024.02.02"))
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.compose.material3)
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.text)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.glance)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(platform("androidx.compose:compose-bom:2024.02.02"))
    androidTestImplementation(libs.androidx.compose.ui.test.junit4)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)
    debugImplementation(libs.androidx.compose.ui.test.manifest)
    debugImplementation(libs.androidx.compose.ui.tooling)
    // Добавьте эту строку для базовых иконок:
    implementation("androidx.compose.material:material-icons-core")
    // Добавьте эту строку для работы с текстом/JSON:
    implementation("com.google.code.gson:gson:2.10.1")
    // 1. Основные библиотеки CameraX
    val cameraxVersion = "1.4.0" // Используйте актуальную стабильную версию
    implementation("androidx.camera:camera-core:$cameraxVersion")
    implementation("androidx.camera:camera-camera2:$cameraxVersion")
    implementation("androidx.camera:camera-lifecycle:$cameraxVersion")
    implementation("androidx.camera:camera-view:$cameraxVersion")

    // 2. Интеграция CameraX и ML Kit (содержит MlKitAnalyzer)
    implementation("androidx.camera:camera-mlkit-vision:$cameraxVersion")

    // 3. Функции ML Kit (выберите нужные, например, сканер штрихкодов и распознавание текста)
    implementation("com.google.mlkit:barcode-scanning:17.3.0")
    implementation("com.google.mlkit:text-recognition:16.0.1")
    implementation("com.google.mlkit:barcode-scanning:17.2.0")

}
