package com.example.elbh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        WebView webview1=findViewById(R.id.webView1);

        webview1.getSettings().setJavaScriptEnabled(true);
        webview1.setWebViewClient(new WebViewClient());
        webview1.loadUrl("https://www.cancer.org/cancer/breast-cancer/about/what-is-breast-cancer.html");







    }
}