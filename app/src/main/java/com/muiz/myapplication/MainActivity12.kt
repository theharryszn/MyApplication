package com.muiz.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import kotlinx.coroutines.runBlocking
import okhttp3.*
import org.json.JSONArray
import java.io.IOException

class MainActivity12 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main12)
        supportActionBar?.hide()

        val name = intent.getStringExtra("name")

        val nameView = findViewById<TextView>(R.id.name)
        val capitalView = findViewById<TextView>(R.id.capital)
        val flagView = findViewById<ImageView>(R.id.flag)
        val nativeNameView = findViewById<TextView>(R.id.nativeName)
        val regionView = findViewById<TextView>(R.id.region)
        val subRegionView = findViewById<TextView>(R.id.subRegion)
        val populationView = findViewById<TextView>(R.id.population)

        val okHttpClient = OkHttpClient()

        val request = Request.Builder()
            .url("https://restcountries.com/v3.1/name/$name")
            .build()

        okHttpClient.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                Log.e("error", e.message.toString())
            }

            override fun onResponse(call: Call, response: Response) {
                if(response.body != null) {
                    val jsonArray = JSONArray(response.body!!.string())

                    val countryObject = jsonArray.getJSONObject(0)

                    val name = countryObject.getJSONObject("name").getString("official")
                    var capital = ""
                    var description = ""

                    if(countryObject.has("capital")) {
                        capital = countryObject.getJSONArray("capital").getString(0)
                    }

                    val flagUrl = countryObject.getJSONObject("flags").getString("png")

                    if(countryObject.getJSONObject("flags").has("alt"))
                    {
                        description = countryObject.getJSONObject("flags").getString("alt")
                    }

                    runOnUiThread {
                        nameView.text = name
                        capitalView.text  = capital
                        Picasso.get().load(flagUrl).into(flagView)
                    }
                }
            }
        })
    }
}