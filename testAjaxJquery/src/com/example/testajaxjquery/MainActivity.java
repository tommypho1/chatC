package com.example.testajaxjquery;

import org.apache.cordova.DroidGap;



import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity  extends DroidGap {

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/login.html");
        
        // attach websocket factory
      //  appView.addJavascriptInterface(new WebSocketFactory(appView), "WebSocketFactory");
    }
}
