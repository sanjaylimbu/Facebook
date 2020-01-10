package com.example.myapplication.Url;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Url {

    private static final String BASE_URL="http://10.0.2.2:5000/";
    //private static final String IMG_URL="http://10.0.2.2.4000/images/";

    public static String token="Bearer";


    public static Retrofit getInstance() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Url.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit;
    }
}
