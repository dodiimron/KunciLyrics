package com.kuncilyrics;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Luar extends ListActivity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		String[] luar = new String[]{"Fall Out Boy - Ignorin","Ariana Grande - Love Me Harder","Beyonce - Partition"};
		this.setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,luar));
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
			if(pilihan.equals("Fall Out Boy - Ignorin")) {
				
			}
			if(pilihan.equals("Ariana Grande - Love Me Harder")) {
				
			}
			if(pilihan.equals("Beyonce - Partition")) {
			}
			startActivity(i);
		} catch (Exception e) {
			e.printStackTrace();
		}
}
	}
