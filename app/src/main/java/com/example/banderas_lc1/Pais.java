package com.example.banderas_lc1;
import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;

public class Pais {
    private String name;

    private String alpha2Code;

    private String url;

    public Pais()throws JSONException {
    alpha2Code="";
    }
    public static ArrayList<Pais> JsonObjectsBuild(JSONArray datos) throws JSONException{
        ArrayList<Pais> infos= new ArrayList<>();
        return infos;
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
}
