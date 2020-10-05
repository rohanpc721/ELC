package com.example.elbh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        WebView webview2=findViewById(R.id.webView2);

        webview2.getSettings().setJavaScriptEnabled(true);
        webview2.setWebViewClient(new WebViewClient());
        webview2.loadUrl("https://www.cancercenter.com/cancer-types/breast-cancer/symptoms");



    }
}