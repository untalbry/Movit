package com.binarybrains.movit.view.login.ui

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel: ViewModel() {
    private var _email  =  mutableStateOf("")

    private var _password  =  mutableStateOf("")

    fun getLoginEmail() = _email

    fun getLoginPassword() = _password

    fun onChangeLoginEmail(email: String) {
        _email.value = email
    }

    fun onChangeLoginPassword(email: String) {
        _password.value = email
    }

}
