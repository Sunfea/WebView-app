package com.application.webviewapp
import android.os.Build
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

       val webview = findViewById<WebView>(R.id.webwiewid)
        webSetup(webview)
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webSetup(w:WebView) {
        w.webViewClient = WebViewClient()
        w.apply {
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
            loadUrl("https://github.com/Sunfea")
        }
    }
}