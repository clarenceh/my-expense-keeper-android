package com.skywidesoft.myexpensekeeper;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends Activity {

	private static final String APP_URL = "http://clarenceho-my-expense-keeper.jit.su/#/";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
        WebView myWebView = (WebView) findViewById(R.id.expenseWebView);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.loadUrl(APP_URL);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
