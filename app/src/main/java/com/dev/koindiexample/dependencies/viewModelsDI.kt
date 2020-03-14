package com.dev.koindiexample.dependencies

import com.dev.koindiexample.scenes.mainflow.landviewmodel.LandingViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelDependency = module {

    viewModel { LandingViewModel(androidApplication()) }
}