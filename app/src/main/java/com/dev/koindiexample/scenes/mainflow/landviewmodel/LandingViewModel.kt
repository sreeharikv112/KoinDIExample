package com.dev.koindiexample.scenes.mainflow.landviewmodel

import android.app.Application
import com.dev.koindiexample.core.BaseViewModel
import com.dev.koindiexample.scenes.mainflow.usecase.LandingUseCase
import org.koin.core.inject

/**
 * View Model for Landing Fragment flow.
 */
class LandingViewModel(context:Application) : BaseViewModel(context) {


    //Inject use case using Koin
    private val landingUseCase : LandingUseCase by inject()
}