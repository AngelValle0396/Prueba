package com.example.banderas_lc1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Pais {
    public Pais(String name, String alpha2Code, String url) {
        this.name = name;
        this.alpha2Code = alpha2Code;
        this.url = url;
    }

    private String name;

    private String alpha2Code;

    private String url;

    public Pais()throws JSONException {
    alpha2Code="";
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlpha2Code() {
        return alpha2Code;
    }

    public void setAlpha2Code(String alpha2Code) {
        this.alpha2Code = alpha2Code;
    }
    public Pais(JSONObject a) throws JSONException {
        name =  a.getString("name").toString() ;

        alpha2Code =  a.getString("alpha2Code").toString() ;

    }



    public static  ArrayList<Pais> JsonObjectsBuild(JSONArray datos) throws JSONException {
        ArrayList<Pais> usuarios = new ArrayList<>();

        for (int i = 0; i < datos.length() && i<20; i++) {
            usuarios.add(new Pais(datos.getJSONObject(i)));
        }
        return usuarios;
    }
}
