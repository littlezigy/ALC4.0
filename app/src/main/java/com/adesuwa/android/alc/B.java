package com.adesuwa.android.alc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class B extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        WebView alchome = (WebView) findViewById(R.id.webview);
        alchome.loadUrl("https://andela.com/alc/");
    }
}
