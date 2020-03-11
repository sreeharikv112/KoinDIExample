package com.dev.koindiexample.mainapp

import android.app.Application
import com.dev.koindiexample.dependencies.appComponent
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

/**
 * Application class.
 * Dependency Injection configured with multiple sub components.
 */

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        configureKoin()
    }

    private fun configureKoin() {
        startKoin{
            androidContext(this@MainApplication)
            modules(provideDependency())
        }
    }

    open fun provideDependency() = appComponent
}