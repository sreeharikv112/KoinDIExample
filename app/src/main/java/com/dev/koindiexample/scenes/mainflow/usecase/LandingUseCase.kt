package com.dev.koindiexample.scenes.mainflow.usecase

import com.dev.koindiexample.core.BaseUseCase
import com.dev.koindiexample.utils.AppUtility
import org.koin.core.inject

/**
 * Use case class for Landing Flow
 */
class LandingUseCase  : BaseUseCase{

    //Utility is available for usage in this class
    val mAppUtils: AppUtility by inject()
}