package com.muiz.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.muiz.myapplication.adapter.NewsAdapter
import com.muiz.myapplication.data.News

class RecyclerViewActivity : AppCompatActivity() {
    private lateinit var newsList : ArrayList<News>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        newsList = arrayListOf()
        newsList.addAll(News.defaultNews)

        val recyclerView = findViewById<RecyclerView>(R.id.newsList)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val newsAdapter = NewsAdapter(newsList)
        recyclerView.adapter = newsAdapter



        newsAdapter.notifyDataSetChanged()
    }
}