package com.example.csgoskins;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class skinAPI {

    private static Retrofit retrofit;
    private static final String BASE_URL = "https://bymykel.github.io/CSGO-API/api/es-ES/";

    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

}
