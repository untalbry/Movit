package com.binarybrains.movit.view.login.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.TextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
//import androidx.compose.runtime.MutableState
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.binarybrains.movit.R.drawable.movit_logo

// View

@Composable
fun LoginScreen(viewModel: LoginViewModel) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFb8b8b8)),
            //.background(Color(0xFF004E64)),
        contentAlignment = Alignment.Center
    ) {
        Login(viewModel)
    }
}

@Composable
fun Login(viewModel: LoginViewModel) {
    val email = viewModel.getLoginEmail()
    val password = viewModel.getLoginPassword()



    Column(modifier = Modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        HeaderImage()
        Spacer(modifier = Modifier.padding(16.dp))
        EmailField(email.value, {viewModel.onChangeLoginEmail(it)})
        //EmailField(email, {viewModel.onLoginChanged(it, password)})
        Spacer(modifier = Modifier.padding(8.dp))
        PasswordField(password.value, {viewModel.onChangeLoginPassword(it)})
        Spacer(modifier = Modifier.padding(8.dp))
        ForgotPassword(Modifier.align(Alignment.End))
        Spacer(modifier = Modifier.padding(16.dp))
        LoginButton()
        Spacer(modifier = Modifier.padding(16.dp))
        Row {
            Text("¿No tienes cuenta?", color = Color(0xFFFFFFFF), fontWeight = FontWeight.Bold)
            Text(text = "  Crea una cuenta", color = Color(0xFF004e64))
        }
        Text(text = viewModel.getLoginEmail().value)
    }
}

@Composable
fun HeaderImage() {
    Image(
        painter = painterResource(id = movit_logo),
        contentDescription = "Movit Logo",
        modifier = Modifier.size(150.dp)
    )
}

@Composable
fun EmailField(email: String, onTextChanged: (String) -> Unit) {
    Column(
        modifier =
        Modifier.padding(horizontal = 16.dp)
    ) {
        Text(text = "Correo", color = Color(0xFF02090b))
        TextField(
            value = email,
            onValueChange = {onTextChanged(it)},
            modifier = Modifier.fillMaxWidth(),
            placeholder = { Text(text = "ejemplo@ipn.mx", color = Color(0xFF536D74)) },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            singleLine = true,
            maxLines = 1,
            colors = TextFieldDefaults.colors(
                focusedTextColor = Color(0xFFFDFDFD),
                unfocusedTextColor = Color(0xFFFDFDFD),
                focusedContainerColor = Color(0xFFDEDDDD),
                unfocusedContainerColor = Color(0xFFDEDDDD),
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            )
        )
    }
}

@Composable
fun PasswordField(password: String, onPasswordChanged: (String) -> Unit) {
    Column(
        modifier =
        Modifier.padding(horizontal = 16.dp)
    ) {
        Text(text = "Contraseña", color = Color(0xFF02090b))
        TextField(
            value = password,
            onValueChange = {onPasswordChanged(it)},
            modifier =
            Modifier
                .fillMaxWidth(),
            placeholder = { Text(text = "*******", color = Color(0xFF536D74)) },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            singleLine = true,
            maxLines = 1,
            colors = TextFieldDefaults.colors(
                focusedTextColor = Color(0xFF636262),
                unfocusedTextColor = Color(0xFF636262),
                focusedContainerColor = Color(0xFFDEDDDD),
                unfocusedContainerColor = Color(0xFFDEDDDD),
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            )
        )
    }
}

@Composable
fun ForgotPassword(modifier: Modifier) {
    Text(
        text = "Olvidaste la contraseña?",
        modifier = modifier
            .clickable { }
            .padding(horizontal = 16.dp),
        fontSize = 13.sp,
        fontWeight = FontWeight.Bold,
        color = Color(0xFF082A33)
    )
}

@Composable
fun LoginButton() {
    Button(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp)
            .padding(horizontal = 16.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF004e64),
            disabledContainerColor = Color(0xFF004e64),
            contentColor = Color.White,
            disabledContentColor = Color.White
        )
    ) {
        Text(text = "Iniciar sesion")

    }
}
