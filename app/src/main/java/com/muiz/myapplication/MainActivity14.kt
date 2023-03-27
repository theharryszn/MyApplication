package com.muiz.myapplication

import android.app.UiModeManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.widget.ThemeUtils

class MainActivity14 : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main14)

        setTheme(R.style.Theme_MyApplication)
    }
}