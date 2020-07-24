package com.example.banderas_lc1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.nio.channels.Pipe;
import java.util.ArrayList;

public class AdaptadorPais extends RecyclerView.Adapter<AdaptadorPais.ViewHolder> {
    private Context mcontext;
    private ArrayList<Pais> mpaises;

    public AdaptadorPais (Context context, ArrayList<Pais> lista){
        mcontext= context;
        mpaises= lista;
    }

    @NonNull
    @Override
    public AdaptadorPais.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mcontext);
        View item = inflater.inflate(R.layout.cardview_pais,parent , false);
        //View v = LayoutInflater.from(mcontext).inflate(R.layout.ly_itemsempleo,parent,false);
        return new ViewHolder(item);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorPais.ViewHolder holder, int position) {
        Pais actual= mpaises.get(position);

        String name =actual.getName();
        String imagenurl= actual.getUrl();

        holder.mname.setText(name);
        Glide.with(mcontext)
                .load(imagenurl)
                .into(holder.mImagev);
    }

    @Override
    public int getItemCount() {
        return mpaises.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImagev;
        public TextView mname;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mImagev= itemView.findViewById(R.id.img_view);
            mname= itemView.findViewById(R.id.txt_pais_name);
        }
    }

}

