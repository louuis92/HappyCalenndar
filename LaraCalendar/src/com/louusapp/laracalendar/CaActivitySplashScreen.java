package com.louusapp.laracalendar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;

public class CaActivitySplashScreen extends Activity {

	private static int SPLASH_SCREEN_SECONDS = 2000;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ca_layout_splashscreen);
		
		new Handler().postDelayed(new Runnable() {
			
			@Override
			public void run() {
				startActivity(new Intent(CaActivitySplashScreen.this, CaHomeCalendar.class));
				
				finish();
			}
		},SPLASH_SCREEN_SECONDS);
		
	}
	
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
	     if (keyCode == KeyEvent.KEYCODE_BACK) {
	    	 return true;
	     }
	     return super.onKeyDown(keyCode, event);    
	}

}
