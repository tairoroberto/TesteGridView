package com.example.testegridview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class GridApapter extends BaseAdapter{

	Context context;
	private int[] lista;
	public GridApapter(Context context,int[] lista ) {
		// TODO Auto-generated constructor stub
		this.context = context;
		this.lista = lista;		
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return lista.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return lista[position];
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// Cria o imageView par inserir no gridView
		
		ImageView image = new ImageView(context);
		image.setImageResource(lista[position]);
		image.setAdjustViewBounds(true);
		return image;
	}

}
