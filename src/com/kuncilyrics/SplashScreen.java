package com.kuncilyrics;

import com.kuncilyrics.LoadingSplashScreen.LoadingTaskFinishedListener;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;

public class SplashScreen extends Activity implements LoadingTaskFinishedListener {
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_screen);
		
		ProgressBar pb = (ProgressBar) findViewById(R.id.progressBar1);
		new LoadingSplashScreen(pb, this).execute("");
	}
	
	public void onTaskFinished() {
		completeSplash();
	}
	
	private void completeSplash() {
		startApp();
		finish();
	}
	
	private void startApp() {
		Intent i = new Intent(this, MainActivity.class);
		startActivity(i);
		onStop();
	}
}
