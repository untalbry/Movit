package com.binarybrains.movit.register.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.binarybrains.movit.view.register.ui.RegisterVIewModel


@Composable
fun RegisterScreen(viewModel: RegisterVIewModel) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFb8b8b8)),
            //.background(Color(0xFF004E64)),
        contentAlignment = Alignment.Center
    ) {
        Register(viewModel)
    }
}

@Composable

fun Register(viewModel: RegisterVIewModel){
    val email = viewModel.getRegisterEmail()
    val confirmEmail = viewModel.getRegisterConfirmEmail()
    val password = viewModel.getRegisterPassword()
    val confirmPassword = viewModel.getRegisterConfirmPassword()

    Column(modifier = Modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Crear cuenta", fontSize = 32.sp, color = Color(0xFF004e64))
        Spacer(modifier = Modifier.padding(16.dp))
        EmailField(email.value, {viewModel.onChangeRegisterEmail(it)})
        Spacer(modifier = Modifier.padding(8.dp))
        ConfirmEmailField(confirmEmail.value, {viewModel.onChangeRegisterConfirmEmail(it)})
        Spacer(modifier = Modifier.padding(8.dp))
        PasswordField(password.value, {viewModel.onChangeRegisterPassword(it)})
        Spacer(modifier = Modifier.padding(8.dp))
        ConfirmPasswordField(confirmPassword.value, {viewModel.onChangeRegisterConfirmPassword(it)})
        Spacer(modifier = Modifier.padding(16.dp))
        NextButton()
    }
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
fun ConfirmEmailField(confirmEmail: String, onTextChanged: (String) -> Unit){
    Column(
        modifier =
        Modifier.padding(horizontal = 16.dp)
    ) {
        Text(text = "Confirmar correo", color = Color(0xFF02090b))
        TextField(
            value = confirmEmail,
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
fun PasswordField(password: String, onTextChanged: (String) -> Unit) {

    Column(
        modifier =
        Modifier.padding(horizontal = 16.dp)
    ) {
        Text(text = "Contraseña", color = Color(0xFF02090b))
        TextField(
            value = password,
            onValueChange = {onTextChanged(it)},
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

fun ConfirmPasswordField(confirmPassword: String, onTextChanged: (String) -> Unit) {

    Column(
        modifier =
        Modifier.padding(horizontal = 16.dp)
    ) {
        Text(text = "Confirmar contraseña", color = Color(0xFF02090b))
        TextField(
            value = confirmPassword,
            onValueChange = {onTextChanged(it)},
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
