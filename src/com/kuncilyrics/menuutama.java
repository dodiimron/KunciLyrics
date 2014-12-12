package com.kuncilyrics;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class menuutama extends Activity {
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu_utama);
		
		Button baru = (Button) findViewById(R.id.lagubaru);
		baru.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				lagubaru();
			}
		});
		
		Button indo = (Button)findViewById(R.id.laguindo);
		indo.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				laguindo();
			}
		});
		
		Button luar = (Button) findViewById(R.id.laguluar);
		luar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				laguluar();
			}
		});
	}
	
	public boolean onCreateOptionMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void lagubaru() {
		Intent i = new Intent(this,LaguBaru.class);
		startActivity(i);
	}
	
	public void laguindo() {
		Intent i = new Intent(this,Indo.class);
		startActivity(i);
	}
	
	public void laguluar() {
		Intent i = new Intent(this,Luar.class);
		startActivity(i);
	}
}

