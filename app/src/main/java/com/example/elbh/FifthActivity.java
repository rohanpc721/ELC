package com.example.elbh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class FifthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        WebView webview3=findViewById(R.id.webView3);

        webview3.getSettings().setJavaScriptEnabled(true);
        webview3.setWebViewClient(new WebViewClient());
        webview3.loadUrl("https://www.cancer.org/cancer/breast-cancer/screening-tests-and-early-detection.html");


    }
}