package com.muiz.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.android.material.bottomnavigation.BottomNavigationView

class BottomNavigation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation)

        supportFragmentManager.beginTransaction().replace(R.id.navView, Fragment_one()).commit()

        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottomNav)

        bottomNavigation.setOnItemSelectedListener {

            when(it.itemId){
                R.id.home -> supportFragmentManager.beginTransaction().add(R.id.navView, Fragment_one()).commit()
                R.id.search -> supportFragmentManager.beginTransaction().add(R.id.navView, Fragment_Two.newInstance("Search")).commit()
            }
           return@setOnItemSelectedListener true
        }


    }
}