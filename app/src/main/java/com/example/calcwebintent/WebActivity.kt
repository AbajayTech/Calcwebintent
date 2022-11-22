package com.example.calcwebintent

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class WebActivity : AppCompatActivity() {
    lateinit var mywebview:WebView

    @SuppressLint("NewApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)

        mywebview=findViewById(R.id.webView)
        webview()
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webview(){
        mywebview.webViewClient=WebViewClient()

        mywebview.apply {
            loadUrl("https://www.amazon.com/?&tag=googleglobalp-20&ref=pd_sl_7nnedyywlk_e&adgrpid=82342659060&hvpone=&hvptwo=&hvadid=393493755082&hvpos=&hvnetw=g&hvrand=3072633954858711190&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9076846&hvtargid=kwd-10573980&hydadcr=2246_11061421&gclid=Cj0KCQiAveebBhD_ARIsAFaAvrEHcrM0aUkQxJa0zIsfKLlYNbgaCUTbO1_geXlPW-qJ1e4_g8WeJqkaAlkSEALw_wcB" )

            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true

        }
    }

    @SuppressLint("SuspiciousIndentation")
    override fun onBackPressed() {                                       //to enable going back on web page
        if (mywebview.canGoBack())mywebview.goBack()else
        super.onBackPressed()
    }
}