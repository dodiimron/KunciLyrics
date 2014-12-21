package com.kuncilyrics;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MenuTabs extends TabActivity {
	
	private static final String LAGUBARU = "Lagu Baru";
	private static final String LAGUINDO = "Lagu Indo";
	private static final String LAGUBARAT = "Lagu Barat";
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu_tab);
		
		TabHost tabHost = getTabHost();
						
		TabSpec lbaruspec = tabHost.newTabSpec(LAGUBARU);
		lbaruspec.setIndicator(LAGUBARU);
		Intent lbaruIntent = new Intent(this,LaguBaru.class);
		lbaruspec.setContent(lbaruIntent);
		
		TabSpec lindospec = tabHost.newTabSpec(LAGUINDO);
		lindospec.setIndicator(LAGUINDO);
		Intent lindoIntent = new Intent(this,LaguIndo.class);
		lindospec.setContent(lindoIntent);
		
		TabSpec lbaratspec = tabHost.newTabSpec(LAGUBARAT);
		lbaratspec.setIndicator(LAGUBARAT);
		Intent lbaratIntent = new Intent(this,LaguBarat.class);
		lbaratspec.setContent(lbaratIntent);
		
		tabHost.addTab(lbaruspec);
		tabHost.addTab(lindospec);
		tabHost.addTab(lbaratspec);
				
		tabHost.setCurrentTab(0);
	}
}