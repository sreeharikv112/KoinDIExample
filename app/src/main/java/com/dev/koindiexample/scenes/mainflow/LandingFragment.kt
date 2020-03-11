package com.dev.koindiexample.scenes.mainflow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.navGraphViewModels
import com.dev.koindiexample.R
import com.dev.koindiexample.core.BaseFragment
import com.dev.koindiexample.scenes.mainflow.landviewmodel.LandingViewModel
import com.dev.koindiexample.utils.AppUtility
import org.koin.android.ext.android.inject

/**
 * Sample fragment.
 * Will prepare corresponding View model with help of VM factory.
 * Injects App utility class as well.
 */
class LandingFragment : BaseFragment() {

    //Setup View Model for Landing flow
    private val viewModel : LandingViewModel by navGraphViewModels(R.id.navigation_graph){
        baseViewModelFactory
    }

    //Injecting utility class for further usage
    val mAppUtility : AppUtility by inject()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_landing, container, false)
    }



}
