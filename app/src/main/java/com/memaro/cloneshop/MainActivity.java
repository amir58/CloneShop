package com.memaro.cloneshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.memaro.cloneshop.Authentication.LoginActivity;
import com.memaro.cloneshop.Authentication.SignUpByEmail;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button buttonJoinNow, buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        clicks();

        //startActivity(new Intent(MainActivity.this, SignUpByEmail.class ));

    }

    private void initViews() {
        buttonJoinNow = findViewById(R.id.main_join_now_button);
        buttonLogin = findViewById(R.id.main_login_button);
    }

    private void clicks() {
        buttonJoinNow.setOnClickListener(this);
        buttonLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.main_join_now_button:
                joinNow();
                break;
            case R.id.main_login_button:
                login();
                break;
        }
    }

    private void login() {
        startActivity(new Intent(MainActivity.this, LoginActivity.class));
    }

    private void joinNow() {
        startActivity(new Intent(MainActivity.this, SignUpByEmail.class));
    }
}
