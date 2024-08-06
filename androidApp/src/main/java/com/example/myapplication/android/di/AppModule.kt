package com.example.myapplication.android.di

import com.example.myapplication.android.auth.login.LoginViewModel
import com.example.myapplication.android.auth.signup.SignUpViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { LoginViewModel() }
    viewModel { SignUpViewModel() }


}