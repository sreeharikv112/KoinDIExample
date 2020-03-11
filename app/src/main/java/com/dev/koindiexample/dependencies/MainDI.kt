package com.dev.koindiexample.dependencies

/**
 * Root DI component with list of multiple dependencies.
 */
val appComponent = listOf(
    NetworkDependency,
    AppUtilDependency,
    UseCaseDependency
)