package com.muiz.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.Button
import android.widget.PopupMenu
import android.widget.TextView
import android.widget.Toast

class MainActivity10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main10)

        supportActionBar?.show()
        supportActionBar?.title = "Hello World"
        supportActionBar?.subtitle = "A new activity"

        val textView = findViewById<TextView>(R.id.textView)

        registerForContextMenu(textView)

        val btn = findViewById<Button>(R.id.btn)


        btn.setOnClickListener { v ->
            run {
                val popupMenu = PopupMenu(applicationContext, v)
                popupMenu.inflate(R.menu.context_menu)
                popupMenu.show()
            }
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.context_menu, menu)

        return true
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.context_menu, menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.settings -> Toast.makeText(applicationContext, "Settings Clicked", Toast.LENGTH_SHORT).show()
            R.id.profile -> Toast.makeText(applicationContext, "Profile Clicked", Toast.LENGTH_SHORT).show()
        }

        return true
    }
}