package com.example.openpdf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class WebViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdf_view)
        val webView: WebView = findViewById(R.id.webView)
        webView.webViewClient = WebViewClient()
        webView.settings.setSupportZoom(true)
        webView.settings.javaScriptEnabled = true
        var url = getPDF()
        webView.loadUrl("https://docs.google.com/gview?embedded=true&url=$url")
    }
    fun getPDF():String{
        return "https://www.attainmentcompany.com/dcat/samples/DRF-Passages-Sample.pdf"
    }

    }
