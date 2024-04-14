import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.binarybrains.movit.view.register.ui.RegisterVIewModel

@Composable
fun RegisterScreen(viewModel: RegisterVIewModel) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally
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

    val isEmailEmpty = remember { mutableStateOf(false) }
    val isConfirmEmailEmpty = remember { mutableStateOf(false) }
    val isPasswordEmpty = remember { mutableStateOf(false) }
    val isConfirmPasswordEmpty = remember { mutableStateOf(false) }

    Column(modifier = Modifier, horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally) {
        Text(text = "Crear cuenta", fontSize = 32.sp, color = Color(0xFF004e64))
        Spacer(modifier = Modifier.padding(16.dp))
        EmailField(email.value, {viewModel.onChangeRegisterEmail(it)}, isEmailEmpty)
        Spacer(modifier = Modifier.padding(8.dp))
        ConfirmEmailField(confirmEmail.value, {viewModel.onChangeRegisterConfirmEmail(it)}, isConfirmEmailEmpty)
        Spacer(modifier = Modifier.padding(8.dp))
        PasswordField(password.value, {viewModel.onChangeRegisterPassword(it)}, isPasswordEmpty)
        Spacer(modifier = Modifier.padding(8.dp))
        ConfirmPasswordField(confirmPassword.value, {viewModel.onChangeRegisterConfirmPassword(it)}, isConfirmPasswordEmpty)
        Spacer(modifier = Modifier.padding(16.dp))
        NextRegisterButton({
            validateFields(email.value, confirmEmail.value, password.value, confirmPassword.value,
                isEmailEmpty, isConfirmEmailEmpty, isPasswordEmpty, isConfirmPasswordEmpty)
        })
    }
}

@Composable
fun EmailField(email: String, onTextChanged: (String) -> Unit, isEmpty: androidx.compose.runtime.MutableState<Boolean>) {
    Column(
        modifier =
        Modifier.padding(horizontal = 16.dp)
    ) {
        Text(text = "Correo", color = Color(0xFF02090b))
        TextField(
            value = email,
            onValueChange = {
                onTextChanged(it)
                isEmpty.value = it.isEmpty()
            },
            modifier = Modifier
                .fillMaxWidth()
                .border(width = 1.dp, color = if (isEmpty.value) Color.Red else Color.Transparent),
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
fun ConfirmEmailField(confirmEmail: String, onTextChanged: (String) -> Unit, isEmpty: androidx.compose.runtime.MutableState<Boolean>){
    Column(
        modifier =
        Modifier.padding(horizontal = 16.dp)
    ) {
        Text(text = "Confirmar correo", color = Color(0xFF02090b))
        TextField(
            value = confirmEmail,
            onValueChange = {
                onTextChanged(it)
                isEmpty.value = it.isEmpty()
            },
            modifier = Modifier
                .fillMaxWidth()
                .border(width = 1.dp, color = if (isEmpty.value) Color.Red else Color.Transparent),
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
fun PasswordField(password: String, onTextChanged: (String) -> Unit, isEmpty: androidx.compose.runtime.MutableState<Boolean>) {

    Column(
        modifier =
        Modifier.padding(horizontal = 16.dp)
    ) {
        Text(text = "Contraseña", color = Color(0xFF02090b))
        TextField(
            value = password,
            onValueChange = {
                onTextChanged(it)
                isEmpty.value = it.isEmpty()
            },
            modifier =
            Modifier
                .fillMaxWidth()
                .border(width = 1.dp, color = if (isEmpty.value) Color.Red else Color.Transparent),
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
fun ConfirmPasswordField(confirmPassword: String, onTextChanged: (String) -> Unit, isEmpty: androidx.compose.runtime.MutableState<Boolean>) {

    Column(
        modifier =
        Modifier.padding(horizontal = 16.dp)
    ) {
        Text(text = "Confirmar contraseña", color = Color(0xFF02090b))
        TextField(
            value = confirmPassword,
            onValueChange = {
                onTextChanged(it)
                isEmpty.value = it.isEmpty()
            },
            modifier = Modifier
                .fillMaxWidth()
                .border(width = 1.dp, color = if (isEmpty.value) Color.Red else Color.Transparent),
            placeholder = { Text(text = "*******", color = Color(0xFF536D74)) },
            keyboardOptions = KeyboardOptions(keyboardType= KeyboardType.Password),
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
fun NextRegisterButton(onClick: () -> Unit) {
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

fun validateFields(
    email: String,
    confirmEmail: String,
    password: String,
    confirmPassword: String,
    isEmailEmpty: androidx.compose.runtime.MutableState<Boolean>,
    isConfirmEmailEmpty: androidx.compose.runtime.MutableState<Boolean>,
    isPasswordEmpty: androidx.compose.runtime.MutableState<Boolean>,
    isConfirmPasswordEmpty: androidx.compose.runtime.MutableState<Boolean>
) {
    isEmailEmpty.value = email.isEmpty()
    isConfirmEmailEmpty.value = confirmEmail.isEmpty()
    isPasswordEmpty.value = password.isEmpty()
    isConfirmPasswordEmpty.value = confirmPassword.isEmpty()
    if (isEmailEmpty.value || isConfirmEmailEmpty.value || isPasswordEmpty.value || isConfirmPasswordEmpty.value) {
        return
    }
}