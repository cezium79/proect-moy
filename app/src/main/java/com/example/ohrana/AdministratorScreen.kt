package com.example.ohrana

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AdministratorScreen(
    onNavigateToEmployeeList: () -> Unit,
    onNavigateToArchive: () -> Unit, // Новый обработчик для перехода в архив
    onNavigateToSpisokOtchetov: () -> Unit,
    onNavigateToRoutes: () -> Unit,
    onBack: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Панель администратора") },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Назад")
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
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                onClick = onNavigateToEmployeeList,
                modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp).height(56.dp)
            ) {
                Text("Редактировать список сотрудников", fontSize = 16.sp)
            }
            Button(
                onClick = onNavigateToRoutes,
                colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.tertiary),
                modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp).height(56.dp)
            ) {
                Text("Редактирование маршрутов", fontSize = 16.sp)
            }

            // Новая кнопка "Архив"
            Button(
                onClick = onNavigateToArchive,
                colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.secondary),
                modifier = Modifier.fillMaxWidth().height(56.dp)
            ) {
                Text("Архив отчетов", fontSize = 16.sp)
            }
        }
    }
}
