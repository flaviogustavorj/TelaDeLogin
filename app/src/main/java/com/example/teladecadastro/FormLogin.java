package com.example.teladecadastro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class FormLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);

        getSupportActionBar().hide();
    }
}