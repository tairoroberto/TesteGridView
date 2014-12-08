package com.example.testegridview;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//Array com as imagens
		int[] lista = new int[]{R.drawable.android1,R.drawable.android2,R.drawable.android3,
								R.drawable.android1,R.drawable.android2,R.drawable.android3,
								R.drawable.android1,R.drawable.android2,R.drawable.android3,
								R.drawable.android1,R.drawable.android2,R.drawable.android3,
								R.drawable.android1,R.drawable.android2,R.drawable.android3};
						
					
				
		GridView gridView =(GridView)findViewById(R.id.gridView1);
		gridView.setAdapter(new GridApapter(this, lista));	
		
		gridView.setOnItemClickListener(new GridView.OnItemClickListener(){
			@Override
			public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
				//Imprime o elemento que foi clicado
				Toast.makeText(getApplicationContext(), "Imagem :"+ (position+1), Toast.LENGTH_SHORT).show();;
				
			}
			
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
