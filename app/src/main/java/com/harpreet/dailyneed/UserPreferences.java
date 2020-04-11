package com.harpreet.dailyneed;

import android.provider.ContactsContract;

public interface UserPreferences {
    String IS_USER_LOGIN = "isUserLogin";
    public void setUserLogin(boolean status);
    public boolean isUserLogin();
    public void clearUser();
    void removeNote(ContactsContract.CommonDataKinds.Note note);
}
