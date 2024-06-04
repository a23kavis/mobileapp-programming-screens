package com.example.screens;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EditText editText = findViewById(R.id.toField);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String email = extras.getString("email");
            editText.setText(email);
        }
            // Do something with the name and number
        }
    }
