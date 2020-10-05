package com.example.elbh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class EighthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eighth);
        WebView webview6=findViewById(R.id.webView6);

        webview6.getSettings().setJavaScriptEnabled(true);
        webview6.setWebViewClient(new WebViewClient());
        webview6.loadUrl("https://www.youngsurvival.org/blog/survivor-stories/survivor/sabreen-diagnosed-at-30");

    }
}