package com.muiz.myapplication

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.io.BufferedReader
import java.io.InputStreamReader

class MainActivity13 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main13)


        val content = findViewById<TextView>(R.id.content)
        val saveBtn = findViewById<Button>(R.id.saveBtn)
        val retrieveBtn = findViewById<Button>(R.id.retrieveBtn)
        val data = findViewById<EditText>(R.id.data)

        saveBtn.setOnClickListener {
            val text = data.text.toString()

            openFileOutput("random", Context.MODE_PRIVATE).use {
                it.write(text.toByteArray())
            }

            data.text.clear()
            Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show()
        }

        retrieveBtn.setOnClickListener {
            openFileInput("random").use {
                content.text = it.bufferedReader().readText()
                Toast.makeText(this, "Retrieved", Toast.LENGTH_SHORT).show()
            } }
    }
}