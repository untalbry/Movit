package com.binarybrains.movit.register.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.TextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// View

@Composable
fun RegisterDetailsScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFb8b8b8)),
            //.background(Color(0xFF004E64)),
        contentAlignment = Alignment.Center
    ) {
        RegisterDetails()
    }
}

@Composable
fun RegisterDetails() {
    Column(modifier = Modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Crear cuenta", fontSize = 32.sp, color = Color(0xFF004e64))
        Spacer(modifier = Modifier.padding(16.dp))
        NameField()
        Spacer(modifier = Modifier.padding(8.dp))
        FirstLastNameField()
        Spacer(modifier = Modifier.padding(8.dp))
        SecondLastNameField()
        Spacer(modifier = Modifier.padding(8.dp))
        NumberField()
        Spacer(modifier = Modifier.padding(8.dp))
        CurpField()
        Spacer(modifier = Modifier.padding(8.dp))
        NextButton({})
        Spacer(modifier = Modifier.padding(4.dp))
        BackButton()
    }
}

@Composable
fun NameField() {
    Column(
        modifier =
        Modifier.padding(horizontal = 16.dp)
    ) {
        Text(text = "Nombre", color = Color(0xFF02090b))
        TextField(
            value = "",
            onValueChange = {},
            modifier = Modifier.fillMaxWidth(),
            placeholder = { Text(text = "Pedro", color = Color(0xFF536D74)) },
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
fun FirstLastNameField() {
    Column(
        modifier =
        Modifier.padding(horizontal = 16.dp)
    ) {
        Text(text = "Primer apellido", color = Color(0xFF02090b))
        TextField(
            value = "",
            onValueChange = {},
            modifier =
            Modifier
                .fillMaxWidth(),
            placeholder = { Text(text = "Perez", color = Color(0xFF536D74)) },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
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
fun SecondLastNameField() {
    Column(
        modifier =
        Modifier.padding(horizontal = 16.dp)
    ) {
        Text(text = "Segundo Apellido", color = Color(0xFF02090b))
        TextField(
            value = "",
            onValueChange = {},
            modifier =
            Modifier
                .fillMaxWidth(),
            placeholder = { Text(text = "Montoya", color = Color(0xFF536D74)) },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
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
fun NumberField() {
    Column(
        modifier =
        Modifier.padding(horizontal = 16.dp)
    ) {
        Text(text = "Numero", color = Color(0xFF02090b))
        TextField(
            value = "",
            onValueChange = {},
            modifier = Modifier.fillMaxWidth(),
            placeholder = { Text(text = "5512345678", color = Color(0xFF536D74)) },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
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
fun CurpField() {
    Column(
        modifier =
        Modifier.padding(horizontal = 16.dp)
    ) {
        Text(text = "CURP", color = Color(0xFF02090b))
        TextField(
            value = "",
            onValueChange = {},
            modifier =
            Modifier
                .fillMaxWidth(),
            placeholder = { Text(text = "ASDF981119MOCNNN01", color = Color(0xFF536D74)) },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
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
fun NextButton(onClick: () -> Unit) {
    Button(
        onClick = onClick,
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
        Text(text = "Continuar")

    }
}

@Composable
fun BackButton() {
    Button(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp)
            .padding(horizontal = 16.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFFDEDDDD),
            disabledContainerColor = Color(0xFFDEDDDD),
            contentColor = Color.White,
            disabledContentColor = Color.White
        )
    ) {
        Text(text = "Regresar", color = Color(0xFF02090B))

    }
}
