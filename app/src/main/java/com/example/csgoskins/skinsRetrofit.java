package com.example.csgoskins;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface skinsRetrofit {

    @GET("https://bymykel.github.io/CSGO-API/api/es-ES/skins.json")
    Call<List<Skin>> getSkins();

}
