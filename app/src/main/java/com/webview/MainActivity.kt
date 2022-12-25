package com.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.view.Window

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.requestFeature(Window.FEATURE_NO_TITLE)

        var url: String = "https://www.example.com" // Display this URL
        val webView = WebView(this)
        val webSettings = webView.settings
        webSettings.javaScriptEnabled = true
        webView.loadUrl(url)
        webView.webViewClient = WebViewClient()
        this.setContentView(webView)
    }
}