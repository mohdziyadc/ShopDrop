package com.example.shopdrop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView.setupWithNavController(MainNavHost.findNavController())
        bottomNavigationView.setOnItemReselectedListener{ /* Left Blank to stop refreshing */ }

        MainNavHost.findNavController().addOnDestinationChangedListener{_, destination, _ ->

            when(destination.id){
                R.id.dashboardFragment, R.id.categoriesFragment, R.id.favoritesFragment,
                    R.id.profileFragment -> bottomNavigationView.visibility = View.VISIBLE

                R.id.editProfileFragment -> bottomNavigationView.visibility = View.GONE
            }

        }


    }
    private var doubleBackPressed = false
    override fun onBackPressed() {
        if(doubleBackPressed){
            super.onBackPressed()
            return
        }

        doubleBackPressed = true
        Handler(Looper.getMainLooper()).postDelayed(Runnable { doubleBackPressed = false }, 2000)
    }

}