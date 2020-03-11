package com.dev.koindiexample.core

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import kotlinx.coroutines.CoroutineDispatcher
import java.lang.reflect.InvocationTargetException

/**
 * Base VM factory for individual VM's.
 */
abstract class BaseViewModelFactory(val context: Application,
                                    val mainDispatcher: CoroutineDispatcher,
                                    val ioDispatcher: CoroutineDispatcher
                             ): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (AndroidViewModel::class.java.isAssignableFrom(modelClass)) {
            return try {
                modelClass.getConstructor(
                    Application::class.java,
                    CoroutineDispatcher::class.java,
                    CoroutineDispatcher::class.java
                ).newInstance(context, mainDispatcher, ioDispatcher)
            } catch (e: NoSuchMethodException) {
                throw RuntimeException("Cannot create an instance of $modelClass", e)
            } catch (e: IllegalAccessException) {
                throw RuntimeException("Cannot create an instance of $modelClass", e)
            } catch (e: InstantiationException) {
                throw RuntimeException("Cannot create an instance of $modelClass", e)
            } catch (e: InvocationTargetException) {
                throw RuntimeException("Cannot create an instance of $modelClass", e)
            }
        } else {
            throw IllegalArgumentException("ViewModel Not configured")
        }
    }


}