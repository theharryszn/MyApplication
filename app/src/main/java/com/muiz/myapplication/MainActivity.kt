package com.muiz.myapplication

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn)


        val text = findViewById<TextView>(R.id.appTitle)

        btn.setOnClickListener {
           text.text = resources.getString(R.string.app_name) +  " " + resources.getString(R.string.hello_world)
        }

    }
}