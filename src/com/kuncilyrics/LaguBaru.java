package com.kuncilyrics;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LaguBaru extends ListActivity{
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		String[] baru = new String[]{"One Direction - Steal My Girl","Magic! - Rude","Sam Smith - Stay With Me"};
		this.setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,baru));
	}
	
	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		Object o = this.getListAdapter().getItem(position);
		String pilihan = o.toString();
		tampilkanpilihan(pilihan);
	}

	private void tampilkanpilihan(String pilihan) {
		try {
			Intent i = null;
			if(pilihan.equals("One Direction - Steal My Girl")) {
				
			}
			if(pilihan.equals("Magic! - Rude")) {
				
			}
			if(pilihan.equals("Sam Smith - Stay With Me")) {
			
			}
			startActivity(i);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
