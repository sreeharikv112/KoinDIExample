package com.dev.koindiexample.core

import androidx.fragment.app.Fragment
import org.koin.android.ext.android.inject

/**
 * Base Fragment class.
 * Prepares View Model Factory as well for sub classes/Fragments.
 */
abstract class BaseFragment : Fragment(){

    protected val baseViewModelFactory by inject<BaseViewModelFactory>()
}