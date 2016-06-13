package com.example.nut.retrofittest;

import android.content.Context;

/**
 * Created by nut on 13/6/2559.
 */
public class Contexter {
    private Context context;
    private static Contexter ourInstance = new Contexter();

    public static Contexter getInstance() {
        return ourInstance;
    }

    private Contexter() {
    }

    public void setContext(Context context){
        this.context = context;
    }

    public Context getContext() {
        return context;
    }
}
