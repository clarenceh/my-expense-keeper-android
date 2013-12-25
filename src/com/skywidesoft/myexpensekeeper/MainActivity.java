package com.skywidesoft.myexpensekeeper;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.webkit.GeolocationPermissions;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends Activity {

	private static final String APP_URL = "https://myexpensekeeper.skywidesoft.com/#/";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
        WebView myWebView = (WebView) findViewById(R.id.expenseWebView);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setGeolocationEnabled(true);
        webSettings.setGeolocationDatabasePath("/data/data/my-expense-keeper");
        webSettings.setAppCacheEnabled(true);
        webSettings.setDatabaseEnabled(true);
        webSettings.setDomStorageEnabled(true);
        ExpenseWebViewClient wvc = new ExpenseWebViewClient();
        myWebView.setWebViewClient(wvc);
        myWebView.setWebChromeClient(new WebChromeClient(){
        	  public void onGeolocationPermissionsShowPrompt(String origin, GeolocationPermissions.Callback callback) {
        	    // callback.invoke(String origin, boolean allow, boolean remember);
        	    callback.invoke(origin, true, false);
        	  }
        	});
        myWebView.loadUrl(APP_URL);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
