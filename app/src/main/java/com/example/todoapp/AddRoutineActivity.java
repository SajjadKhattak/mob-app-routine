package com.example.todoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddRoutineActivity extends AppCompatActivity {
    EditText taskTxt;
    String dayName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_routine);
        dayName = getIntent().getStringExtra("dayName");
        taskTxt = (EditText) findViewById(R.id.arRoutine);
    }

    public void add(View view) {
        Todos.addTodo(dayName, taskTxt.getText().toString());
        Toast.makeText(getApplicationContext(),"Routine Added",Toast.LENGTH_SHORT).show();
        this.finish();
    }
}