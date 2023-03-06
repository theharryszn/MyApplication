package com.muiz.myapplication

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.widget.doOnTextChanged

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn)
        var email = ""
        var password = ""
        val textInput = findViewById<EditText>(R.id.textInput)



        val textEl = findViewById<TextView>(R.id.appTitle)

        btn.setOnClickListener {
            finish()
//           textEl.text = resources.getString(R.string.app_name) +  " " + resources.getString(R.string.hello_world)
//            email = textInput.text.toString()
        }


        textInput.doOnTextChanged { text, start, before, count ->
            run {
                textEl.text = "Welcome, $text, $start, $before, $count"
            }
        }


    }
}