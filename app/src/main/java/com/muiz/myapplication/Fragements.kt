package com.muiz.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Fragements : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragements)

        val btn = findViewById<Button>(R.id.btn)

        supportFragmentManager.beginTransaction().add(R.id.container,Fragment_one()).commit()

        btn.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.container, Fragment_Two.newInstance("James")).commit()
        }
    }
}