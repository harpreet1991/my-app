package com.harpreet.dailyneed;

import android.content.Intent;
import android.text.TextUtils;

public interface LoginActivityView {
    void showMainActivity();
    void showError(String errorMsg);
}
public class LoginPresenter extends AbstractPresenter {
    private LoginActivityView mView;
    UserPreferences mDatabase = new UserPreference();

    public LoginPresenter(LoginActivityView mView) {
        this.mView = mView;
    }

    public void onCreate(Intent intent) {
        // Handle intent data here...
    }

    public void login(String username, String password) {
        if(TextUtils.isEmpty(username)){
            mView.showError("Please enter username");
        }else if(username.length() < 6){
            mView.showError("Username must contains 6 letters");
        }else if(TextUtils.isEmpty(password)){
            mView.showError("Please enter password");
        }else if(password.length() < 6){
            mView.showError("Password must contains 6 letters");
        }else {
            mDatabase.setUserLogin(true);
            mView.showMainActivity();
        }
    }
}