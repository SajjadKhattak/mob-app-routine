package com.example.todoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RoutineActivity extends AppCompatActivity {

    static ListView TodoList;
    static String dayName;
    Intent AddTodoActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routine);
        TodoList = (ListView) findViewById(R.id.routineList);
        dayName = getIntent().getStringExtra("dayName");
        this.AddTodoActivity = new Intent(this, AddRoutineActivity.class);
        loadList();
    }


    @Override
    protected void onResume() {
        super.onResume();
        loadList();
    }

    public void loadList(){
        ArrayAdapter<String> adapter;
        if(dayName.equals("MONDAY")){
            adapter = new ArrayAdapter<String>(this, R.layout.activity_view_list, R.id.textView, Todos.monday);
            TodoList.setAdapter(adapter);
        }
        if(dayName.equals("TUESDAY")){
            adapter = new ArrayAdapter<String>(this,R.layout.activity_view_list, R.id.textView, Todos.tuesday);
            TodoList.setAdapter(adapter);
        }
        if(dayName.equals("WEDNESDAY")){
            adapter = new ArrayAdapter<String>(this,R.layout.activity_view_list, R.id.textView, Todos.wednesday);
            TodoList.setAdapter(adapter);
        }
        if(dayName.equals("THURSDAY")){
            adapter = new ArrayAdapter<String>(this,R.layout.activity_view_list, R.id.textView, Todos.thursday);
            TodoList.setAdapter(adapter);
        }
        if(dayName.equals("FRIDAY")){
            adapter = new ArrayAdapter<String>(this,R.layout.activity_view_list, R.id.textView, Todos.friday);
            TodoList.setAdapter(adapter);
        }
        if(dayName.equals("SATURDAY")){
            adapter = new ArrayAdapter<String>(this,R.layout.activity_view_list, R.id.textView, Todos.saturday);
            TodoList.setAdapter(adapter);
        }
        if(dayName.equals("SUNDAY")){
            adapter = new ArrayAdapter<String>(this,R.layout.activity_view_list, R.id.textView, Todos.sunday);
            TodoList.setAdapter(adapter);
        }
    }

    public void add(View view) {
        AddTodoActivity.putExtra("dayName", dayName);
        startActivity(AddTodoActivity);
        loadList();
    }
}