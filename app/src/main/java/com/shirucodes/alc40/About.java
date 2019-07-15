package com.shirucodes.alc40;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class About extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        webView = findViewById(R.id.webView);

        webView.setWebViewClient(new WebViewClient()
        {
            public void onReceivedSslError(WebView webView, SslErrorHandler handler,SslError  error)
            {
                handler.proceed();
            }
        });
        webView.loadUrl("https://andela.com/alc");
    }

}



