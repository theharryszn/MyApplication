package com.muiz.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.muiz.myapplication.adapter.CountriesAdapter
import com.muiz.myapplication.data.Country
import com.muiz.myapplication.data.Flag
import okhttp3.*
import org.json.JSONArray
import java.io.IOException

class MainActivity11 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main11)

        // hiding action bar
        supportActionBar?.hide()

        val countries = arrayListOf<Country>()

        // selecting rv
        val rvCountires = findViewById<RecyclerView>(R.id.countriesList)

        // layout manager
        rvCountires.layoutManager = LinearLayoutManager(this@MainActivity11)

        // setting adapter
        rvCountires.adapter = CountriesAdapter(countries)


        val client = OkHttpClient()

        val request = Request.Builder()
            .url("https://restcountries.com/v3.1/region/europe")
            .build()


        client.newCall(request).enqueue(object: Callback {
            override fun onFailure(call: Call, e: IOException) {
                Log.e("error", e.message.toString())
            }

            @SuppressLint("NotifyDataSetChanged")
            override fun onResponse(call: Call, response: Response) {
                if(response.body != null) {
                    val jsonArray = JSONArray(response.body!!.string())

                    for(i in 0 until jsonArray.length()) {
                        val jsonObject = jsonArray.getJSONObject(i)

                        val name = jsonObject.getJSONObject("name").getString("official")
                        var capital = ""
                        var description = ""

                        if(jsonObject.has("capital")) {
                            capital = jsonObject.getJSONArray("capital").getString(0)
                        }

                        val flagUrl = jsonObject.getJSONObject("flags").getString("png")

                        if(jsonObject.getJSONObject("flags").has("alt"))
                        {
                            description = jsonObject.getJSONObject("flags").getString("alt")
                        }

                        val newCountry = Country(
                            name = name,
                            capital = capital,
                            flag = Flag(
                                url= flagUrl,
                                description = description
                            )
                        )

                        countries.add(newCountry)

                        runOnUiThread {
                            rvCountires.adapter?.notifyDataSetChanged()
                        }
                    }
                }
            }

        })
    }
}