package com.harpreet.dailyneed;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferencesProvider {
    private static  String Preference_Name="test";
    private static SharedPreferences sharedPreferences;

    public static SharedPreferences getSharedPreferences() {
        return sharedPreferences;
    }

    public static void init(Context context) {
       sharedPreferences=context.getSharedPreferences(Preference_Name,Context.MODE_PRIVATE);
    }
}
