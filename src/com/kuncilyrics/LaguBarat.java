package com.kuncilyrics;

import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class LaguBarat extends Activity implements TextWatcher, OnItemClickListener {
	
	private EditText carilagubarat;
	private ListView lvlagubarat;
	private DBLaguBarat dblbarat;
	private ArrayAdapter<DefinisiLagu> adapterlagubarat;
	private List<DefinisiLagu> listLaguBarat;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lagu_barat);
		lvlagubarat = (ListView) findViewById(R.id.LV_LaguBarat);
		lvlagubarat.setEmptyView(findViewById(R.id.EmptyLaguBarat));
		carilagubarat = (EditText) findViewById(R.id.CariLaguBarat);
		
		dblbarat = DBLaguBarat.getInstance(this);
		
		setDataLaguBarat();
		
		carilagubarat.addTextChangedListener(this);
		lvlagubarat.setOnItemClickListener(this);
	}
	
	private void setDataLaguBarat() {
		listLaguBarat = dblbarat.getAllLaguBarat();
		adapterlagubarat = new ArrayAdapter<DefinisiLagu>(this, android.R.layout.simple_expandable_list_item_1, listLaguBarat);
		lvlagubarat.setAdapter(adapterlagubarat);
	}
	
	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int position, long id) {
		// TODO Auto-generated method stub
		Bundle b = new Bundle();
		b.putString("judul", adapterlagubarat.getItem(position).getJudul());
		b.putString("cord", adapterlagubarat.getItem(position).getCord());
		
		Intent i = new Intent(this, CordLaguBaru.class);
		i.putExtras(b);
		startActivity(i);
	}
	
	@Override
	public void afterTextChanged(Editable s) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void beforeTextChanged(CharSequence s, int start, int count, int after) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onTextChanged(CharSequence s, int start, int before, int count) {
		// TODO Auto-generated method stub
		adapterlagubarat.getFilter().filter(s.toString());		
	}
}