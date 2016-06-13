package com.example.nut.retrofittest;

import android.app.Application;
import android.content.res.Configuration;

/**
 * Created by nut on 13/6/2559.
 */
public class TestApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Contexter.getInstance().setContext(getApplicationContext());

    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();

    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }
}
