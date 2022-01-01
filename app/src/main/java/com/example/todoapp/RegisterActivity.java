package com.example.todoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    Intent mainIntent;
    EditText username;
    EditText pass;
    EditText name;
    EditText age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        username = findViewById(R.id.rUserId);
        pass = findViewById(R.id.rPass);
        name = findViewById(R.id.rName);
        age = findViewById(R.id.rAge);
        mainIntent = new Intent(getBaseContext(), MainActivity.class);
    }

    public void login(View view) {
        startActivity(mainIntent);
    }

    public void register(View view) {
        Users.register(name.getText().toString(),username.getText().toString(),age.getText().toString(),pass.getText().toString());
        Toast.makeText(getApplicationContext(), "User Registered", Toast.LENGTH_SHORT).show();
    }
}