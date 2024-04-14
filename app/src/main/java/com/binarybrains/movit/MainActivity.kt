package com.binarybrains.movit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.binarybrains.movit.view.login.ui.LoginScreen
import com.binarybrains.movit.ui.theme.MovitTheme
import com.binarybrains.movit.view.login.ui.LoginViewModel

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
                    //StartupScreen()
                     LoginScreen(LoginViewModel())
                    //RegisterScreen()
                    // RegisterDetailsScreen()
                }
            }
        }
    }
}


