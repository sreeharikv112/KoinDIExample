package com.dev.koindiexample.dependencies

import com.dev.koindiexample.utils.AppUtility
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

/**
 * Utility DI component prepared.
 */
val AppUtilDependency = module {

    factory { AppUtility(androidContext()) }

}