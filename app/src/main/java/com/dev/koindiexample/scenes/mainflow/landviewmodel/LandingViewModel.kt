package com.dev.koindiexample.scenes.mainflow.landviewmodel

import android.app.Application
import android.util.Log
import com.dev.koindiexample.core.BaseViewModel
import com.dev.koindiexample.scenes.mainflow.usecase.LandingUseCase
import org.koin.core.inject

/**
 * View Model for Landing Fragment flow.
 */
class LandingViewModel(context:Application) : BaseViewModel(context) {

    val TAG = LandingViewModel::class.java.simpleName

    //Inject use case using Koin
    private val landingUseCase : LandingUseCase by inject()

    fun someFunction(){

        Log.d(TAG,"someFunction called in LandingViewModel")

        //Calling Use case method for delegation.
        landingUseCase.someFunction()
    }
}