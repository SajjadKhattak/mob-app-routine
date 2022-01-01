package com.example.todoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AllRoutineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_routine);
    }

    public void View(View view) {
        Intent RoutineIntent = new Intent(this, RoutineActivity.class);
        TextView v = (TextView) view;
        RoutineIntent.putExtra("dayName", v.getText().toString());
        startActivity(RoutineIntent);
    }
}