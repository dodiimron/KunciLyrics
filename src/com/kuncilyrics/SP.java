package com.kuncilyrics;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;

import com.kuncilyrics.Loading.LoadingTaskFinishedListener;

public class SP extends Activity implements LoadingTaskFinishedListener {
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_screen);
		
		ProgressBar pb = (ProgressBar) findViewById(R.id.progressBar1);
		new Loading(pb, this).execute("");
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
