package com.dev.koindiexample.dependencies


import com.dev.koindiexample.network.apiservices.SampleService
import com.google.gson.GsonBuilder
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.dev.koindiexample.BuildConfig
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Network dependency module.
 * Provides Retrofit dependency with OkHttp logger.
 */
val NetworkDependency = module {

    single {
        Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .baseUrl(BuildConfig.BASE_URL).build()
    }
    factory{ get<Retrofit>().create(SampleService::class.java) }
}