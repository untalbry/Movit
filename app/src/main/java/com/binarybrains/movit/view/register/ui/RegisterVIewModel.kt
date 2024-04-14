package com.binarybrains.movit.view.register.ui

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class RegisterVIewModel: ViewModel() {

    private var _email  =  mutableStateOf("")
    private var _confirmEmail  =  mutableStateOf("")
    private var _password  =  mutableStateOf("")
    private var _confirmPassword  =  mutableStateOf("")

    fun getRegisterEmail() = _email
    fun getRegisterConfirmEmail() = _confirmEmail
    fun getRegisterPassword() = _password
    fun getRegisterConfirmPassword() = _confirmPassword

    fun onChangeRegisterEmail(email: String) {
        _email.value = email
    }

    fun onChangeRegisterConfirmEmail(confirmEmail: String) {
        _confirmEmail.value = confirmEmail
    }

    fun onChangeRegisterPassword(password: String) {
        _password.value = password
    }


    fun onChangeRegisterConfirmPassword(confirmPassword: String) {
        _confirmPassword.value = confirmPassword
    }
}

