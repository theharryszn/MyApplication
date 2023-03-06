package com.muiz.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val resultTextView = findViewById<TextView>(R.id.result)

        val email = intent.getStringExtra("email")
        val password = intent.getStringExtra("password")

        if(email == "onome@mail.com" && password == "onomepass"){
            resultTextView.text = "Welcome"
        }else {
            resultTextView.text = "User not found"
        }

    }
}