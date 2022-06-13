package com.android.dunderbaks

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView

//TODO: Make fragments for About Me and Contacts
//TODO: Hard code data for Home Fragment
//TODO: Link 4 Service buttons to their respective app/website
//TODO: Format Beer List
//TODO: If possible to dim background when Popup Window shows
//TODO: Add food images
//TODO: Possibly work on making regular theme not dark, leave dark theme dark
//TODO: Get high res logo svg from JB for the Splash screen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView = findViewById<BottomNavigationView>(R.id.nav_view)
        val appBarConfiguration = AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_tap_list, R.id.navigation_menu)
                .build()
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration)
        NavigationUI.setupWithNavController(navView, navController)
        supportActionBar!!.hide()
    }
}