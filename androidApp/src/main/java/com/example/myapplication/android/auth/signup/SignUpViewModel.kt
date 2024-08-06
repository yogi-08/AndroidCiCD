package com.example.myapplication.android.auth.signup

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel


class SignUpViewModel : ViewModel() {
    var uiState by mutableStateOf(SignUpUiState())
        private set

    fun updateUserName(input: String) {
        uiState = uiState.copy(userName = input)
    }

    fun updateEmail(input: String) {
        uiState = uiState.copy(email = input)
    }

    fun updatePassword(input: String) {
        uiState = uiState.copy(password = input)
    }

}

data class SignUpUiState(
    var userName: String = "",
    var email: String = "",
    var password: String = "",
)


