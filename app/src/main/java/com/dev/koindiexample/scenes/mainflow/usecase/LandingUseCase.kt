package com.dev.koindiexample.scenes.mainflow.usecase

import android.util.Log
import com.dev.koindiexample.core.BaseUseCase
import com.dev.koindiexample.utils.AppUtility
import org.koin.core.inject

/**
 * Use case class for Landing Flow
 */
class LandingUseCase  : BaseUseCase{

    val TAG = LandingUseCase::class.java.simpleName

    //Utility is available for usage in this class
    val mAppUtils: AppUtility by inject()

    fun someFunction(){
        Log.d(TAG,"someFunction in LandingUseCase ")
    }
}