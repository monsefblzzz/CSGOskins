package com.example.csgoskins;

import android.net.Uri;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

public class skinsAPI {

    private final String BASE_URL = "https://bymykel.github.io/CSGO-API/api/es-ES/skins.json";

    ArrayList<Skin> getSkinPorId(String id) {
        Uri builtUri = Uri.parse(BASE_URL)
                .buildUpon()
                .appendPath("name")
                .appendPath("rarity")
                .appendQueryParameter("id", id)
                .build();
        String url = builtUri.toString();

        return doCall(url);
    }

    private ArrayList<Skin> processJson(String jsonResponse) {
        ArrayList<Skin> skins = new ArrayList<>();
        try {
            JSONObject data = new JSONObject(jsonResponse);
            JSONArray jsonSkins = data.getJSONArray("results");
            for (int i = 0; i < 20; i++) {
                JSONObject jsonSkin = jsonSkins.getJSONObject(i);

                Skin skin = new Skin();
                Skin.setName(jsonSkin.getString("name"));
                Skin.setRarity(jsonSkin.getString("rarity"));


                skins.add(skin);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return skins;
    }

    private ArrayList<Skin> doCall(String url){

        try{
            String JsonResponse = HttpUtils.get(url);
            return processJson(JsonResponse);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return null;

    }

}
