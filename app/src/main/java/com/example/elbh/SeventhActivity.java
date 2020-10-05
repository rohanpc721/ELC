package com.example.elbh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SeventhActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);
        WebView webview5=findViewById(R.id.webView5);

        webview5.getSettings().setJavaScriptEnabled(true);
        webview5.setWebViewClient(new WebViewClient());
        webview5.loadUrl("https://www.sharecancersupport.org/2016/12/7045/");


    }
}