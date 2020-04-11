package com.harpreet.dailyneed;

import android.content.SharedPreferences;
import android.provider.ContactsContract;

public class UserPreference implements UserPreferences {
    protected SharedPreferences mPreferences;

    public UserPreference() {
        this.mPreferences = PreferencesProvider.getSharedPreferences();
    }

    @Override
    public void setUserLogin(boolean status) {
        mPreferences.edit().putBoolean(IS_USER_LOGIN, status).apply();
    }

    @Override
    public boolean isUserLogin() {
        return mPreferences.getBoolean(IS_USER_LOGIN, false);
    }

    @Override
    public void clearUser() {
        mPreferences.edit()
                .putBoolean(IS_USER_LOGIN, false)
                .apply();

    }

    @Override
    public void removeNote(ContactsContract.CommonDataKinds.Note note) {

    }


}
