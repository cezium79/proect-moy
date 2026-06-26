package com.example.ohrana

import android.app.Activity
import android.Manifest
import android.content.pm.PackageManager
import android.util.Size
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.camera.core.CameraSelector
import androidx.camera.core.ImageAnalysis
import androidx.camera.core.Preview
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.camera.view.PreviewView
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.content.ContextCompat
import androidx.lifecycle.LifecycleOwner
import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.Executors
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.camera.core.ExperimentalGetImage
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.camera.core.ImageProxy
import com.google.mlkit.vision.barcode.BarcodeScanner

@OptIn(ExperimentalMaterial3Api::class, ExperimentalGetImage::class)
@Composable
fun OhrannikCabinetScreen(
    employeeName: String,
    onLogout: () -> Unit,
    onNavigateToReports: () -> Unit
) {

    val context = LocalContext.current
    val lifecycleOwner: LifecycleOwner = LocalLifecycleOwner.current // <-- ИСПРАВЛЕННАЯ СТРОКА
    val manager = remember(context) { SharedPrefsManager(context) }

    // Формат даты для диалогов и логов (должен совпадать с QrHandler)
    val dateFormat = remember { SimpleDateFormat("dd.MM.yyyy HH:mm:ss", Locale.US) }
    val currentTime = remember { dateFormat.format(Date()) }

    var hasCameraPermission by remember {
        mutableStateOf(
            ContextCompat.checkSelfPermission(context, Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED
        )
    }
    var isScanRequested by remember { mutableStateOf(false) }

    // --- СОСТОЯНИЯ ДЛЯ ПОКАЗА ДИАЛОГОВЫХ ОКОН ---
    var showLocationDialog by remember { mutableStateOf<QrResult.Checkpoint?>(null) }
    var showQuestionDialog by remember { mutableStateOf<QrResult.Checkpoint?>(null) }
    var showInputDialog by remember { mutableStateOf<QrResult.Checkpoint?>(null) }
    var showErrorDialog by remember { mutableStateOf<String?>(null) }
    var inputTextValue by remember { mutableStateOf("") }

    val launcher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.RequestPermission(),
        onResult = { granted -> hasCameraPermission = granted }
    )

    LaunchedEffect(key1 = true) {
        if (!hasCameraPermission) {
            launcher.launch(Manifest.permission.CAMERA)
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(employeeName) },
                navigationIcon = {
                    IconButton(onClick = onLogout) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Выход")
                    }
                }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Смена открыта в: $currentTime",
                fontSize = 16.sp,
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            if (hasCameraPermission) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .padding(bottom = 16.dp)
                ) {
                    AndroidView(
                        factory = { ctx ->
                            val previewView = PreviewView(ctx)
                            val cameraProviderFuture = ProcessCameraProvider.getInstance(ctx)
                            cameraProviderFuture.addListener({
                                val cameraProvider = cameraProviderFuture.get()
                                val preview = Preview.Builder().build().also {
                                    it.setSurfaceProvider(previewView.surfaceProvider)
                                }
                                val imageAnalysis = ImageAnalysis.Builder()
                                    .setBackpressureStrategy(ImageAnalysis.STRATEGY_KEEP_ONLY_LATEST)
                                    .build()

                                val options = com.google.mlkit.vision.barcode.BarcodeScannerOptions.Builder()
                                    .setBarcodeFormats(com.google.mlkit.vision.barcode.common.Barcode.FORMAT_QR_CODE)
                                    .build()
                                val scanner = com.google.mlkit.vision.barcode.BarcodeScanning.getClient(options)

                                imageAnalysis.setAnalyzer(Executors.newSingleThreadExecutor()) { imageProxy ->
                                    analyzeQrCode(
                                        imageProxy = imageProxy,
                                        scanner = scanner,
                                        isScanRequested = isScanRequested,
                                        currentTime = currentTime, // Убедитесь, что эта переменная определена выше!
                                        manager = manager,
                                        showLocationDialog = { parsed ->
                                            (context as? Activity)?.runOnUiThread {
                                                // СРАЗУ ОТКЛЮЧАЕМ АНАЛИЗАТОР КАМЕРЫ, чтобы прекратить поток кадров
                                                imageAnalysis.clearAnalyzer()

                                                when (parsed.type) {
                                                    "Чек-лист" -> showQuestionDialog = parsed
                                                    "Показания" -> showInputDialog = parsed
                                                    else -> showLocationDialog = parsed
                                                }
                                                isScanRequested = false // Сбрасываем флаг для Compose
                                            }
                                        },
                                        showErrorDialog = { message ->
                                            (context as? Activity)?.runOnUiThread {
                                                // При ошибке тоже отключаем, чтобы не спамить диалогами ошибок
                                                imageAnalysis.clearAnalyzer()

                                                showErrorDialog = message
                                                isScanRequested = false
                                            }
                                        },
                                        QrHandler = QrHandler
                                    )
                                }
                                val cameraSelector = CameraSelector.DEFAULT_BACK_CAMERA

                                try {
                                    cameraProvider.unbindAll()
                                    cameraProvider.bindToLifecycle(lifecycleOwner, cameraSelector, preview, imageAnalysis)
                                } catch (e: Exception) {
                                    e.printStackTrace()
                                }
                            }, ContextCompat.getMainExecutor(ctx))
                            previewView
                        },
                        modifier = Modifier.fillMaxSize()
                    )
                    // Рамка прицела по центру экрана
                    Box(
                        modifier = Modifier
                            .size(280.dp, 280.dp)
                            .align(Alignment.Center)
                            .border(BorderStroke(3.dp, Color.Green), RoundedCornerShape(16.dp))
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.CenterHorizontally)
                        .padding(bottom = 48.dp),
                    contentAlignment = Alignment.Center
                ) {
                   Button(
                        onClick = { isScanRequested = true },
                         modifier = Modifier.width(200.dp).height(56.dp),
                        shape = RoundedCornerShape(28.dp)
                    ) {
                        Text(text = "Сканировать", fontWeight = FontWeight.Bold, fontSize = 16.sp)
                    }
                }
            }
        }
    }


    // ================= РЕНДЕРИНГ ДИАЛОГОВЫХ ОКОН =================

    // 1. Диалог для обычной метки локации (простой чекпоинт)
    showLocationDialog?.let { result ->
        AlertDialog(
            onDismissRequest = { showLocationDialog = null },
            title = { Text("Точка зафиксирована") },
            // Добавлен безопасный вызов ?.name
            text = { Text("Локация: ${result?.name}\nВремя: $currentTime") },
            confirmButton = {
                Button(onClick = { showLocationDialog = null }) { Text("ОК") }
            }
        )
    }

    // 2. Диалог с ВОПРОСОМ и кнопками вариантов ответов
    showQuestionDialog?.let { result ->
        AlertDialog(
            onDismissRequest = { showQuestionDialog = null },
            title = { Text("Проверка чек-листа") },
            text = {
                Column {
                    Text(
                        // Добавлен безопасный вызов ?.text
                        text = result?.text ?: "Вопрос",
                        modifier = Modifier.padding(bottom = 12.dp),
                        fontWeight = FontWeight.Medium
                    )
                    // Безопасный вызов ?.answers и оператор Элвиса на случай null
                    (result?.answers ?: emptyList()).forEach { answer ->
                        Button(
                            onClick = {
                                val entryWithAnswer = CheckpointEntry(
                                    id = result?.id ?: "", // Безопасный вызов ?.id
                                    type = "Чек-лист",
                                    titleOrLocation = result?.name ?: "", // Безопасный вызов ?.name
                                    userResult = answer,
                                    timestamp = currentTime,
                                    photoPath = null
                                )
                                QrHandler.saveUserResponse(entryWithAnswer)
                                showQuestionDialog = null
                            },
                            modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = MaterialTheme.colorScheme.secondaryContainer,
                                contentColor = MaterialTheme.colorScheme.onSecondaryContainer
                            )
                        ) { Text(answer) }
                    }
                }
            },
            confirmButton = {}
        )
    }

    // 3. Диалог для ВВОДA ДАННЫХ
    showInputDialog?.let { result ->
        AlertDialog(
            onDismissRequest = {
                inputTextValue = ""
                showInputDialog = null
            },
            title = { Text("Ввод данных") },
            text = {
                Column {
                    // Добавлен безопасный вызов ?.text
                    Text(text = result?.text ?: "Введите данные", modifier = Modifier.padding(bottom = 8.dp))
                    OutlinedTextField(
                        value = inputTextValue,
                        onValueChange = { inputTextValue = it },
                        // Добавлен безопасный вызов ?.placeholder
                        label = { Text(result?.placeholder ?: "Введите показания") },
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            },
            confirmButton = {
                Button(
                    onClick = {
                        if (inputTextValue.isNotBlank()) {
                            val entryWithInput = CheckpointEntry(
                                id = result?.id ?: "", // Безопасный вызов ?.id
                                type = "Показания",
                                titleOrLocation = result?.name ?: "", // Безопасный вызов ?.name
                                userResult = inputTextValue,
                                timestamp = currentTime,
                                photoPath = null
                            )
                            QrHandler.saveUserResponse(entryWithInput)
                            inputTextValue = ""
                            showInputDialog = null
                        }
                    }
                ) { Text("Сохранить") }
            },
            dismissButton = {
                TextButton(onClick = {
                    inputTextValue = ""
                    showInputDialog = null
                }) { Text("Отмена") }
            }
        )
    }



    // 4. Диалог ошибки парсинга/сканирования (без изменений)
    showErrorDialog?.let { message ->
        AlertDialog(
            onDismissRequest= { showErrorDialog= null },
            title= { Text("Ошибка сканирования") },
            text= { Text(message) },
            confirmButton= { Button(onClick= { showErrorDialog= null }) { Text("ОК") } }
        )
    }

    }

@androidx.annotation.OptIn(ExperimentalGetImage::class)
@OptIn(ExperimentalGetImage::class)
private fun analyzeQrCode(
    imageProxy: ImageProxy,
    scanner: BarcodeScanner,
    isScanRequested: Boolean,
    currentTime: String,
    manager: SharedPrefsManager,
    showLocationDialog: (QrResult.Checkpoint?) -> Unit,
    showErrorDialog: (String?) -> Unit,
    QrHandler: QrHandler
) {
    if (!isScanRequested) {
        imageProxy.close()
        return
    }
    if (isScanRequested) {
        val mediaImage = imageProxy.image
        if (mediaImage != null) {
            val rotation = imageProxy.imageInfo.rotationDegrees
            val image =
                com.google.mlkit.vision.common.InputImage.fromMediaImage(mediaImage, rotation)

            scanner.process(image)
                .addOnSuccessListener { barcodes ->
                    for (barcode in barcodes) {
                        val rawValue = barcode.rawValue
                        if (rawValue != null) {
                            // isScanRequested = false // Решите, где вам лучше сбрасывать флаг

                            val parsed = QrHandler.parseQrCode(rawValue)
                            when (parsed) {
                                is QrResult.Checkpoint -> {
                                    val entry = CheckpointEntry(
                                        id = parsed.id,
                                        type = "Метка локации",
                                        titleOrLocation = parsed.name,
                                        userResult = null,
                                        timestamp = currentTime
                                    )
                                    QrHandler.saveUserResponse(entry)
                                    showLocationDialog(parsed)
                                }

                                is QrResult.ShiftReportTrigger -> {
                                    val logs = manager.getScanLogs()
                                    if (logs.isNotEmpty()) {
                                        // ... ваша логика ...
                                    }
                                }

                                is QrResult.Error -> {
                                    showErrorDialog(parsed.message)
                                }
                            }
                            break
                        }
                    }
                }
                .addOnCompleteListener {
                    imageProxy.close()
                }
        } else {
            imageProxy.close()
        }
    } else {
        imageProxy.close()
    }
}
