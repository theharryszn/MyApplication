package com.muiz.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        val countries = arrayListOf("Nigeria", "USA", "Japan", "Ghana", "UK", "Serbia", "Saudi Arabia", "India", "China", "Germany", "Canada", "Russia", "Ukraine", "Algeria", "Switzerland", "Brazil", "Turkey", "Portugal")
//        val countries = arrayListOf("Nigeria")
        val countriesList = findViewById<ListView>(R.id.countriesList)

        val adapter = ArrayAdapter(applicationContext, R.layout.list_item, countries)

        countriesList.adapter = adapter


        countriesList.setOnItemClickListener { adapterView, view, i, l -> run {
                countries.add("Empty")
            adapter.notifyDataSetChanged()
            Toast.makeText(applicationContext, countries[i], Toast.LENGTH_LONG).show()
            view.setBackgroundColor(applicationContext.resources.getColor(R.color.purple_200))
            (view as TextView).setTextColor(applicationContext.resources.getColor(R.color.black))
        }}
    }
}
