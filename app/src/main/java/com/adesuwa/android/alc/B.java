package com.adesuwa.android.alc;

import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class B extends AppCompatActivity {

    /*Activity activity;
    private ProgressDialog progDailog;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        /*activity = this;

        progDailog = ProgressDialog.show(activity, "Loading...", "Please wait", true);
        progDailog.setCancelable(false);*/

        WebView alchome = (WebView) findViewById(R.id.webview);
        alchome.setWebViewClient(new WebViewClient() {
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed(); // Ignore SSL certificate errors
            }
        });
        alchome.getSettings().setUserAgentString("Android WebView");
        alchome.loadUrl("https://andela.com/alc");
    }
}
