package com.example.ohrana

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
import androidx.compose.ui.viewinterop.AndroidView
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import androidx.lifecycle.compose.LocalLifecycleOwner
import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.Executors

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OhrannikCabinetScreen(
    employeeName: String,
    onLogout: () -> Unit,
    onNavigateToReports: () -> Unit
) {
    val context = LocalContext.current
    val manager = remember(context) { SharedPrefsManager(context) }

    val lifecycleOwner = LocalLifecycleOwner.current

    val shiftStartTime = remember {
        SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(Date())
    }

    var hasCameraPermission by remember {
        mutableStateOf(
            ContextCompat.checkSelfPermission(context, Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED
        )
    }

    // Главный триггер захвата кадра при нажатии кнопки "Сканировать"
    var isScanRequested by remember { mutableStateOf(false) }

    // --- СОСТОЯНИЯ ДЛЯ ПОКАЗА ДИАЛОГОВЫХ ОКОН ---
    var showLocationDialog by remember { mutableStateOf<QrResult.LocationCheckpoint?>(null) }
    var showQuestionDialog by remember { mutableStateOf<QrResult.QuestionFormat?>(null) }
    var showInputDialog by remember { mutableStateOf<QrResult.InputFormat?>(null) }
    var showErrorDialog by remember { mutableStateOf<String?>(null) }
    var inputTextValue by remember { mutableStateOf("") } // Текст внутри поля ввода показаний

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
                text = "Смена открыта в: $shiftStartTime",
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
                    // Контейнер для вывода картинки с камеры смартфона
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
                                    if (isScanRequested) {
                                        @Suppress("UnsafeOptInUsageError")
                                        val mediaImage = imageProxy.image
                                        if (mediaImage != null) {
                                            val rotation = imageProxy.imageInfo.rotationDegrees
                                            val image = com.google.mlkit.vision.common.InputImage.fromMediaImage(mediaImage, rotation)

                                            // Получаем физические размеры кадра матрицы камеры
                                            val imgWidth = imageProxy.width
                                            val imgHeight = imageProxy.height

                                            scanner.process(image)
                                                .addOnSuccessListener { barcodes ->
                                                    for (barcode in barcodes) {
                                                        val rawValue = barcode.rawValue
                                                        val bounds = barcode.boundingBox

                                                        if (rawValue != null && bounds != null) {

                                                            // 1. Вычисляем координаты центра QR-кода на матрице
                                                            val qrCenterX = bounds.centerX().toFloat()
                                                            val qrCenterY = bounds.centerY().toFloat()

                                                            // 2. Определяем границы рамки прицела (центральные 30% от кадра)
                                                            // Если камера повернута вертикально (90 или 270 град), меняем оси местами для корректности
                                                            val isRotated = rotation == 90 || rotation == 270
                                                            val frameWidth = if (isRotated) imgHeight else imgWidth
                                                            val frameHeight = if (isRotated) imgWidth else imgHeight

                                                            // Рассчитываем допустимый квадрат по центру кадра
                                                            val minX = frameWidth * 0.35f
                                                            val maxX = frameWidth * 0.65f
                                                            val minY = frameHeight * 0.35f
                                                            val maxY = frameHeight * 0.65f

                                                            // 3. Проверка: попадает ли центр QR-кода в рассчитанную центральную область
                                                            if (qrCenterX in minX..maxX && qrCenterY in minY..maxY) {

                                                                // ТОЛЬКО ЕСЛИ КОД ВНУТРИ ПРИЦЕЛА — выполняем ваш оригинальный код:
                                                                isScanRequested = false

                                                                // Отправляем строку на разбор парсеру QrHandler
                                                                val parsed = QrHandler.parseQrCode(rawValue)
                                                                when (parsed) {
                                                                    is QrResult.LocationCheckpoint -> {
                                                                        showLocationDialog = parsed
                                                                    }
                                                                    is QrResult.QuestionFormat -> {
                                                                        showQuestionDialog = parsed
                                                                    }
                                                                    is QrResult.InputFormat -> {
                                                                        inputTextValue = "" // Чистим поле ввода
                                                                        showInputDialog = parsed
                                                                    }
                                                                    is QrResult.ShiftReportTrigger -> {
                                                                        val manager = SharedPrefsManager(context)
                                                                        // Проверяем, делал ли охранник хоть что-то за смену
                                                                        if (manager.getScanLogs().isNotEmpty()) { /* логика */ }
                                                                    }
                                                                    is QrResult.Error -> {
                                                                        showErrorDialog = parsed.message
                                                                    }
                                                                }
                                                                break // Прерываем цикл, так как нужный код найден и обработан
                                                            }
                                                        }
                                                    }
                                                }
                                                .addOnCompleteListener {
                                                    // Обязательно закрываем imageProxy, чтобы камера не «застывала»
                                                    imageProxy.close()
                                                }
                                        } else {
                                            imageProxy.close()
                                        }
                                    } else {
                                        imageProxy.close()
                                    }
                                }


                                val cameraSelector = CameraSelector.DEFAULT_BACK_CAMERA
                                try {
                                    cameraProvider.unbindAll()
                                    cameraProvider.bindToLifecycle(lifecycleOwner, cameraSelector, preview, imageAnalysis)
                                } catch (e: Exception) { e.printStackTrace() }
                            }, ContextCompat.getMainExecutor(ctx))
                            previewView
                        },
                        modifier = Modifier.fillMaxSize()
                    )

                    // Рамка зеленого прицела по центру экрана
                    Box(
                        modifier = Modifier
                            .size(280.dp, 280.dp)
                            .align(Alignment.Center)
                            .border(BorderStroke(3.dp, Color.Green), RoundedCornerShape(16.dp))
                    )

                    // Кнопка под рамкой
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.BottomCenter)
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
    }
    // ================= РЕНДЕРИНГ ДИАЛОГОВЫХ ОКОН =================

    // 1. Диалог для обычной метки локации
    showLocationDialog?.let { result ->
        AlertDialog(
            onDismissRequest = { showLocationDialog = null },
            title = { Text("Точка зафиксирована") },
            text = { Text("Локация: ${result.name}\nВремя: ${result.timestamp}") },
            confirmButton = {
                Button(onClick = {
                    val logText = "Метка локации: ${result.name} (Отметка пройдена)"
                    manager.saveScanResult(employeeName = employeeName, qrContent = logText)
                    showLocationDialog = null
                }) { Text("ОК") }
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
                        text = result.text,
                        modifier = Modifier.padding(bottom = 12.dp),
                        fontWeight = FontWeight.Medium
                    )
                    result.answers.forEach { answer ->
                        Button(
                            onClick = {
                                val logText = "Чек-лист: ${result.text} -> Ответ: $answer"
                                manager.saveScanResult(employeeName = employeeName, qrContent = logText)
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
            confirmButton = {} // Кнопки подтверждения не нужны, клик по варианту сам закроет окно
        )
    }

    // 3. Диалог для ВВОДА ДАННЫХ (Показания счетчиков и т.д.)
    showInputDialog?.let { result ->
        AlertDialog(
            onDismissRequest = { showInputDialog = null },
            title = { Text("Ввод данных") },
            text = {
                Column {
                    Text(text = result.title, modifier = Modifier.padding(bottom = 8.dp))
                    OutlinedTextField(
                        value = inputTextValue,
                        onValueChange = { inputTextValue = it },
                        label = { Text("Введите показания") },
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            },
            confirmButton = {
                Button(
                    onClick = {
                        if (inputTextValue.isNotBlank()) {
                            // Было:
                            QrHandler.saveUserResponse(type = "Ввод данных", title = result.title, response = inputTextValue)
// НАДО СДЕЛАТЬ:
                            val logText = "Показания: ${result.title} -> Введено: $inputTextValue"
                            manager.saveScanResult(employeeName = employeeName, qrContent = logText)

                            showInputDialog = null
                        }
                    }
                ) { Text("Сохранить") }
            },
            dismissButton = {
                TextButton(onClick = { showInputDialog = null }) { Text("Отмена") }
            }
        )
    }

    // 4. Диалог ошибки парсинга/сканирования
    showErrorDialog?.let { message ->
        AlertDialog(
            onDismissRequest = { showErrorDialog = null },
            title = { Text("Ошибка сканирования") },
            text = { Text(message) },
            confirmButton = { Button(onClick = { showErrorDialog = null }) { Text("ОК") } }
        )
    }
}

// Вспомогательная заглушка, чтобы не ломать вызовы в других частях проекта
@Composable
fun CameraScannerScreen(
    onScanRecognized: (String) -> Unit,
    modifier: Modifier = Modifier,
    onPreviewViewCreated: (PreviewView) -> Unit
) {
    Box(modifier = modifier.fillMaxSize())
}
