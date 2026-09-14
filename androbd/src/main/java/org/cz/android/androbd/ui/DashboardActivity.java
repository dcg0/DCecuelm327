package org.cz.android.androbd.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import org.cz.android.androbd.R;

public class DashboardActivity extends AppCompatActivity {

    private WebView webView;
    private final BroadcastReceiver obdReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            String pid = intent.getStringExtra("pid_name");
            String value = intent.getStringExtra("pid_value");

            if (pid != null && value != null) {
                runOnUiThread(() -> {
                    String js = "if(window.updateOBDData) { window.updateOBDData('" + pid + "', '" + value + "'); }";
                    webView.evaluateJavascript(js, null);
                });
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_webview);

        webView = findViewById(R.id.dashboardWebView);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);

        webView.loadUrl("file:///android_asset/index.html");
    }

    @Override
    protected void onResume() {
        super.onResume();
        IntentFilter filter = new IntentFilter("com.cz.android.androbd.OBD_DATA");
        LocalBroadcastManager.getInstance(this).registerReceiver(obdReceiver, filter);
    }

    @Override
    protected void onPause() {
        super.onPause();
        LocalBroadcastManager.getInstance(this).unregisterReceiver(obdReceiver);
    }
}
