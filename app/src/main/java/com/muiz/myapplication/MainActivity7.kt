package com.muiz.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.CheckBox
import android.widget.ProgressBar
import android.widget.RadioGroup
import android.widget.SeekBar
import kotlinx.coroutines.delay

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)

//        val checkbox = findViewById<CheckBox>(R.id.checkbox)
//
////        if(checkbox.isChecked) {
////            checkbox.isChecked = false
////        }
//
//        val radioGroup = findViewById<RadioGroup>(R.id.radGrp)
//
//        radioGroup.setOnCheckedChangeListener { _, i -> run {
//            if(i == R.id.red) {
//                Log.i("clicked", "Red was clicked")
//            }else {
//                Log.i("clicked", "Blue was clicked")
//            }
//        }}

        val progressBar = findViewById<ProgressBar>(R.id.progress)

        Thread {
            run {
                while (progressBar.progress < 100) {
                    Thread.sleep(500)
                    progressBar.progress += 1
                }
            }
        }.start()

        val seekBar = findViewById<SeekBar>(R.id.seekBar)

        seekBar.setOnSeekBarChangeListener(object :SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
//        Log.d("SEEK", p1.toString())
                return
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                return
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                Log.d("SEEK", p0?.progress.toString())
                return
            }
        })
    }

}