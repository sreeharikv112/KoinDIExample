package com.dev.koindiexample.core

import androidx.fragment.app.Fragment
import com.dev.koindiexample.utils.AppUtility
import kotlinx.coroutines.Dispatchers
import org.koin.android.ext.android.inject

/**
 * Base Fragment class.
 * Prepares View Model Factory as well for sub classes/Fragments.
 */
abstract class BaseFragment : Fragment(){

    //Injecting utility class for further usage
    val mAppUtility : AppUtility by inject()

}