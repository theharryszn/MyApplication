package com.muiz.myapplication

import android.annotation.SuppressLint
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class MainActivity8 : AppCompatActivity() {
    private lateinit var pref: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main8)

        pref = applicationContext.getSharedPreferences("pref", 0)

        refresh()

        val nameTextInput = findViewById<TextInputEditText>(R.id.name)
        val passwordTextInput = findViewById<TextInputEditText>(R.id.password)
        val errorTextView = findViewById<TextView>(R.id.error)

        val saveBtn = findViewById<MaterialButton>(R.id.saveBtn)

        saveBtn.setOnClickListener {
            errorTextView.visibility = View.GONE
            val name = nameTextInput.text.toString()
            val password = passwordTextInput.text.toString()

            if(name.isEmpty() || password.isEmpty()) {
                errorTextView.visibility = View.VISIBLE
            }

            val prefEditor = pref.edit()

            prefEditor.putString("name", name)
            prefEditor.putString("password", password)

            prefEditor.apply()
            refresh()
            nameTextInput.setText("")
            passwordTextInput.setText("")
        }
    }

    @SuppressLint("SetTextI18n")
    private fun refresh() {
        val welcomeTextView = findViewById<TextView>(R.id.welcomeText)

        val savedName = pref.getString("name", null)

        if(savedName != null) {
            welcomeTextView.text  = "Welcome Back, $savedName"
        }
    }
}