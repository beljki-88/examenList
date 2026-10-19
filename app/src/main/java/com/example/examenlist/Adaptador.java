package com.example.examenlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adaptador extends BaseAdapter {
    Context contexto;
    String[] listaTextos1;
    String[] listaTextos2;
    int[] listaImagenes;
    LayoutInflater inflater;

    public Adaptador(Context contexto, String[] t1, String[] t2, int[] img) {
        this.contexto = contexto;
        this.listaTextos1 = t1;
        this.listaTextos2 = t2;
        this.listaImagenes = img;
        this.inflater = LayoutInflater.from(contexto);
    }

    @Override
    public int getCount() {
        return listaTextos1.length;
    }

    @Override
    public Object getItem(int position) { return null; }

    @Override
    public long getItemId(int position) { return 0; }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.basurota, parent, false);
        }

        TextView t1 = convertView.findViewById(R.id.text);
        TextView t2 = convertView.findViewById(R.id.text2);
        ImageView img = convertView.findViewById(R.id.imagensota);

        t1.setText(listaTextos1[position]);
        t2.setText(listaTextos2[position]);
        img.setImageResource(listaImagenes[position]);

        return convertView;
    }
}
