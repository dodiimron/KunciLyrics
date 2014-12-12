package com.kuncilyrics;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button keluar = (Button) findViewById(R.id.keluar);
		keluar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				keluar();
			}
		});   
	}
	
	public void lanjutkan(View theButton) {
		Intent i = new Intent(this, menuutama.class);
		startActivity(i);
	}
	
	public void keluar() {
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setMessage("Apakah Anda ingin Keluar ?").setCancelable(false).setPositiveButton("Ya",new DialogInterface.OnClickListener() {
						
			@Override
			public void onClick(DialogInterface dialog, int id) {
				// TODO Auto-generated method stub
				MainActivity.this.finish();
			}
		}).setNegativeButton("Tidak",new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int id) {
				// TODO Auto-generated method stub
				dialog.cancel();
			}
		}).show();
	}
}