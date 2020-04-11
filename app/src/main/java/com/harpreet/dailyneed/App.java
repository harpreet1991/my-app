package com.harpreet.dailyneed;

import android.app.Application;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        PreferencesProvider.init(this);
    }
}
