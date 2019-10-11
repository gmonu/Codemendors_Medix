package com.amitshekhar.tflite;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Moreinfo_Activity extends AppCompatActivity {
    WebView myweb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moreinfo_);
        myweb=(WebView)findViewById(R.id.webview);
        WebSettings webSettings = myweb.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myweb.loadUrl("https://charugoyal3.github.io/Medix/");
        myweb.setWebViewClient(new WebViewClient());


    }



    @Override
    public void onBackPressed()
    {
        if(myweb.canGoBack())
        {
            myweb.goBack();
        }
        else
        {
            super.onBackPressed();
        }
    }
}
