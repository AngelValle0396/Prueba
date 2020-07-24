package com.example.banderas_lc1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

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
        View item = inflater.inflate(R.layout.ly_itemsempleo, null);
        //View v = LayoutInflater.from(mcontext).inflate(R.layout.ly_itemsempleo,parent,false);
        return new ViewHolder(item);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorPais.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder {

    }
}

