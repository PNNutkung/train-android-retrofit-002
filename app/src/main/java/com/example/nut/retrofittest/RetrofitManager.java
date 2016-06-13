package com.example.nut.retrofittest;

import retrofit2.Retrofit;

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

    private RetrofitManager() {
        retrofit = new Retrofit.Builder().build();
    }


}
