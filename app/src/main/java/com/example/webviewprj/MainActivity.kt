package com.example.webviewprj

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var wv=findViewById<WebView>(R.id.webview)
        webViewSetUp(wv);
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetUp(wv: WebView) {
        wv.webViewClient= WebViewClient()
        wv.apply {
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
            loadUrl("https://ritwick096.github.io/Tourify/")
        }
    }
}