package com.harpreet.dailyneed;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements LoginActivityView {
    private EditText edtUserName, edtPassword;
    private Button btnLogin;

    private LoginPresenter mPresenter = new LoginPresenter(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void showMainActivity() {

    }

    @Override
    public void showError(String errorMsg) {

    }
}
