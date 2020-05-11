package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends AppCompatActivity {
    WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        web = (WebView) findViewById(R.id.webView1);
        web.setWebViewClient(new myWebClient());
        web.getSettings().setJavaScriptEnabled(true);
        int pos = getIntent().getIntExtra("key",0);
        if(pos==0)
        {
            web.loadUrl("https://en.wikipedia.org/wiki/Android_version_history#Android_1.0_(API_1)");
        }
        if(pos==1)
        {
            web.loadUrl("https://en.wikipedia.org/wiki/Android_version_history");
        }
        if(pos==2)
        {
            web.loadUrl("https://en.wikipedia.org/wiki/Android_Cupcake");
        }
        if(pos==3)
        {
            web.loadUrl("https://en.wikipedia.org/wiki/Android_Donut");
        }
        if(pos==4)
        {
            web.loadUrl("https://en.wikipedia.org/wiki/Android_Eclair");
        }
        if(pos==5)
        {
            web.loadUrl("https://en.wikipedia.org/wiki/Android_Froyo");
        }
        if(pos==6)
        {
            web.loadUrl("https://en.wikipedia.org/wiki/Android_Gingerbread");
        }


    }
}
class myWebClient extends WebViewClient
{
    @Override
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        // TODO Auto-generated method stub
        super.onPageStarted(view, url, favicon);
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        // TODO Auto-generated method stub

        view.loadUrl(url);
        return true;

    }
    @Override
    public void onReceivedError(WebView view, int errorCode,
                                String description, String failingUrl) {
    }
    @Override
    public void onPageFinished(WebView view, String url) {
        // TODO Auto-generated method stub
        super.onPageFinished(view, url);

    }
}
