package com.example.learnyoruba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.example.learnyoruba.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var drawerLayout: DrawerLayout
/*
    private lateinit var binding: ActivityMainBinding
*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        drawerLayout = binding.drawerLayout
        val navController = this.findNavController(R.id.myNavhostFragment)
        NavigationUI.setupActionBarWithNavController(this, navController, drawerLayout)
        /*NavigationUI.setupActionBarWithNavController(binding.navView, navController)*/
        appBarConfiguration = AppBarConfiguration(navController.graph, drawerLayout)

    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.myNavhostFragment)
        return NavigationUI.navigateUp(navController, appBarConfiguration)
    }
}