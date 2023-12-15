package com.example.activity_second;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class activity_second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        WebView mywebview = (WebView) findViewById(R.id.webview);
        mywebview.loadUrl("https://www.poltekssn.ac.id");
    }
}