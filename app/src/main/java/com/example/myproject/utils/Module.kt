package com.example.myproject.utils

import com.example.myproject.viewmodels.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.core.scope.get
import org.koin.dsl.module

val appModule = module {
    // MyViewModel ViewModel
    single { HomeViewModel() }
}