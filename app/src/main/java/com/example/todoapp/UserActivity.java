package com.example.todoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class UserActivity extends AppCompatActivity {
    TextView name;
    TextView username;
    TextView age;
    Intent AllRoutineActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        this.AllRoutineActivity = new Intent(this, AllRoutineActivity.class);
        username = findViewById(R.id.uUserId);
        name = findViewById(R.id.uName);
        age = findViewById(R.id.uAge);
        User u = (User) getIntent().getSerializableExtra("user");
        username.setText(username.getText()+u.username);
        name.setText(name.getText()+u.name);
        age.setText(age.getText()+u.age);
    }

    public void view(View view) {
        startActivity(this.AllRoutineActivity);
    }
}