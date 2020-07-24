package com.example.banderas_lc1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.banderas_lc1.WebService.Asynchtask;
import com.example.banderas_lc1.WebService.WebService;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class MainActivity extends AppCompatActivity implements Asynchtask {
    private RecyclerView recyclerView;
    private Pais pais;
    private ArrayList<Pais> lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView= findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));



        Map<String, String> datos = new HashMap<String, String>();
        WebService ws= new WebService("https://restcountries.eu/rest/v2/all",
                datos,  this, this);
        ws.execute("GET");
    }

    @Override
    public void processFinish(String result) throws JSONException {
        ArrayList<Pais> lstEmpleos;

        try {
            JSONArray jsonlista= new JSONArray(result);
            lstEmpleos = Pais.JsonObjectsBuild(jsonlista);
            AdaptadorPais adaptador = new AdaptadorPais(this, lstEmpleos);

            recyclerView.setAdapter(adaptador);

        }catch (JSONException e)
        {
            Toast.makeText(this.getApplicationContext(),e.getMessage(),Toast.LENGTH_LONG);
        }
    }
}