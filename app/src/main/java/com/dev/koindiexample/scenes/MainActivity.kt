package com.dev.koindiexample.scenes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.navigation.Navigation
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.dev.koindiexample.R

/**
 * Main Activity with Nav controller.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        val host = Navigation.findNavController(this,R.id.nav_host_fragment)
        val appBarConfig = AppBarConfiguration(setOf(R.id.landingFragment))
        toolbar.setupWithNavController(host,appBarConfig)

    }
}
