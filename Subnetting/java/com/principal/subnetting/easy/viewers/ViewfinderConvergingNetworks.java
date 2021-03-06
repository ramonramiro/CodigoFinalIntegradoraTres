package com.principal.subnetting.easy.viewers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.principal.subnetting.easy.R;

public class ViewfinderConvergingNetworks extends AppCompatActivity {

    final String url = "https://www.revistavirtualpro.com/ic_news/convergencia-de-networks-el-futuro-de-la-conectividad";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewfinder_converging_networks);

        WebView webConvergingNetworks = findViewById(R.id.web_viewfinder_converging);


        webConvergingNetworks.setWebViewClient(new MyWebViewClient());
        WebSettings settings = webConvergingNetworks.getSettings();
        settings.setJavaScriptEnabled(true);
        webConvergingNetworks.loadUrl(url);

    }

    private class MyWebViewClient extends WebViewClient
    {

        public boolean shouldOverrideUrlLogding(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
