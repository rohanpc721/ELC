package com.example.elbh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class NinthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninth);
        WebView webview7=findViewById(R.id.webView7);

        webview7.getSettings().setJavaScriptEnabled(true);
        webview7.setWebViewClient(new WebViewClient());
        webview7.loadUrl("https://docs.google.com/forms/d/1uXKvOUUH5qAOP4u3hVHE6H0xNUqquXS05al0L8pqjsY/viewform?ts=5f762ef5&edit_requested=true");

    }
}