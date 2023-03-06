package com.muiz.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val webView = findViewById<WebView>(R.id.webView)

        val webClient = WebViewClient()

        webView.webViewClient = webClient
        webView.settings.javaScriptEnabled = true

        webView.loadUrl("https://google.com")

    }
}