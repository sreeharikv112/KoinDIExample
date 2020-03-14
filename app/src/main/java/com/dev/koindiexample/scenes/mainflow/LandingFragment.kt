package com.dev.koindiexample.scenes.mainflow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dev.koindiexample.R
import com.dev.koindiexample.core.BaseFragment
import com.dev.koindiexample.scenes.mainflow.landviewmodel.LandingViewModel
import com.dev.koindiexample.utils.AppUtility
import kotlinx.android.synthetic.main.fragment_landing.*
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.inject

/**
 * Sample fragment.
 * Will prepare corresponding View model with help of base VM.
 * Injects App utility class as well.
 */
class LandingFragment : BaseFragment() {

    //View model injection using Koin way
    private val viewModel by viewModel<LandingViewModel>()

    //Utility is available for usage in this class
    val mAppUtils: AppUtility by inject()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_landing, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnTwo.setOnClickListener {
            viewModel.someFunction()
        }
    }



}
