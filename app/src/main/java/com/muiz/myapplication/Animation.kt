package com.muiz.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.google.android.material.button.MaterialButton

class Animation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation)

        val scaleUpView = findViewById<MaterialButton>(R.id.scaleUp)

        val scaleUpAnimation = AnimationUtils.loadAnimation(applicationContext, R.anim.scale_up)

        scaleUpView.setOnClickListener {
            scaleUpView.startAnimation(scaleUpAnimation)
        }
    }
}