package com.example.elbh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SixthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);
        WebView webview4=findViewById(R.id.webView4);

        webview4.getSettings().setJavaScriptEnabled(true);
        webview4.setWebViewClient(new WebViewClient());
        webview4.loadUrl("https://www.breastcancer.org/symptoms/diagnosis/staging");


    }
}