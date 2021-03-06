package com.example.nut.retrofittest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by nut on 13/6/2559.
 */
public class RetrofitManager {
    private Retrofit retrofit;
    private static RetrofitManager ourInstance;

    public static RetrofitManager getInstance() {
        if(ourInstance == null){
            ourInstance = new RetrofitManager();
        }
        return ourInstance;
    }

    public Retrofit getRetrofit() {
        return retrofit;
    }

    private RetrofitManager() {
        retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }


}
