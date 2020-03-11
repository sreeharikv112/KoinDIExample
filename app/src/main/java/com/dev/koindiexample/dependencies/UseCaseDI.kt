package com.dev.koindiexample.dependencies

import com.dev.koindiexample.scenes.mainflow.usecase.LandingUseCase
import org.koin.dsl.module

/**
 * All use case dependency can be prepared here.
 * For demonstration created Landing Use case alone.
 */
val UseCaseDependency = module {

    factory {

        LandingUseCase()
    }

    //NOTE:
    // If repository is required to be passed over, while creating dependency itself Koin will support
}