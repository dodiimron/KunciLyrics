package com.kuncilyrics;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Indo extends ListActivity {
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
				
		String[] indo = new String[]{"Cita Citata - Goyang Dumang","Noah - Seperti Kemarin","d'Masiv - Batu"};
		this.setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,indo));
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
			if(pilihan.equals("Cita Citata - Goyang Dumang")) {
				
			}
			if(pilihan.equals("Noah - Seperti Kemarin")) {
				
			}
			if(pilihan.equals("d'Masiv - Batu")) {
			
			}
			startActivity(i);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
