package com.binarybrains.movit.startup.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
// import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
// import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.binarybrains.movit.R.drawable.movit_logo

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun StartupScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF004E64)),
        contentAlignment = Alignment.Center
    ) {
        Startup()
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Startup() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        StartImage()
        Text(
            text = "Movit",
            color = Color.White,
            textAlign = TextAlign.Center,
            fontSize = 48.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun StartImage() {
    Image(
        painter = painterResource(id = movit_logo),
        contentDescription = "Movit Logo",
        contentScale = ContentScale.Fit,
        modifier = Modifier.size(200.dp)
        //modifier = modifier
    )
}
