package com.example.csgoskins;

import java.io.IOException;

public class skinsAPI {

    private final String BASE_URL = "https://bymykel.github.io/CSGO-API/api/es-ES/skins.json";

    private String doCall(String url){

        try{
            String JsonResponse = HttpUtils.get(url);
            return JsonResponse;
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return null;

    }

}
