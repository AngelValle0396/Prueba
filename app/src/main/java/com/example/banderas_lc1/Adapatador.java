package com.example.banderas_lc1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Adapatador extends ArrayAdapter<Pais> {
    private View.OnClickListener listener;
    public Adapatador(Context context, Pais[] datos) {
        super(context, R.layout.cardview_pais, datos);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.cardview_pais, null);

        TextView name = (TextView)item.findViewById(R.id.txt_pais_name);
        name.setText(getItem(position).getName());

        ImageView imageView = (ImageView)item.findViewById(R.id.img_view);
        Glide.with(this.getContext())
                .load(getItem(position).getUrl())
                .into(imageView);
        return(item);
    }
}
