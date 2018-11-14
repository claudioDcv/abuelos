package com.abuelos.duoc.abuelos.servicios;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Conector {
    final static String API_HOST = "https://medicamentos.free.beeceptor.com/";

    private Retrofit retrofit;
    public Conector() {
        retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(Conector.API_HOST)
                .build();
    }

    public Retrofit getRetrofit() {
        return retrofit;
    }
}
