package com.binarybrains.movit.register.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun RegisterDetailsScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFb8b8b8)),
            //.background(Color(0xFF004E64)),
        contentAlignment = Alignment.Center
    ) {
        Register()
    }
}

