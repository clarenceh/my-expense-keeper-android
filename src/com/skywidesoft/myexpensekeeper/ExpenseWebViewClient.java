package com.skywidesoft.myexpensekeeper;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ExpenseWebViewClient extends WebViewClient {

	 public ExpenseWebViewClient() {  
		 super();  
	 }

	@Override
	public void onReceivedSslError(WebView view, SslErrorHandler handler,
			SslError error) {

		handler.proceed();
	}	
	
}
