package com.binarybrains.movit

import RegisterScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.binarybrains.movit.ui.theme.MovitTheme
import com.binarybrains.movit.view.register.ui.RegisterVIewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MovitTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                     //LoginScreen(LoginViewModel())
                    RegisterScreen(RegisterVIewModel())
                    // RegisterDetailsScreen()
                }
            }
        }
    }
}


