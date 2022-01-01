package com.example.todoapp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Users {
    static List<User> userList = new ArrayList<User>();
    public static void register(String name,String username,String age, String password){
        User u = new User(name,username,age,password);
        userList.add(u);
    }
    public static User login(String username, String password){
        for (User u : userList) {
            if (u.username.equals(username) && u.password.equals(password)) {
                return u;
            }
        }
        return null;
    }
}

class User implements Serializable {
String name;
String username;
String age;
String password;
User(String name,String username,String age, String password){
    this.name = name;
    this.username = username;
    this.age = age;
    this.password = password;
}
}
