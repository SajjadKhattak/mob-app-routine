package com.example.todoapp;

public class Todos {
    public static String monday[] = new String[0];
    public static String tuesday[] = new String[0];
    public static String wednesday[] = new String[0];
    public static String thursday[] = new String[0];
    public static String friday[] = new String[0];
    public static String saturday[] = new String[0];
    public static String sunday[] = new String[0];

    public static void addTodo(String dayName, String toDo){
        if(dayName.equals("MONDAY")){
            int newlength = monday.length + 1;
            String mon[] = new String[newlength];
            for (int i=0; i<newlength;i++){
                if(i==newlength-1){
                    mon[i]= toDo;
                }
                else{
                    mon[i]=monday[i];
                }
            }
            monday =mon;
        }
        if(dayName.equals("TUESDAY")){
            int newlength = tuesday.length + 1;
            String tue[] = new String[newlength];
            for (int i=0; i<newlength;i++){
                if(i==newlength-1){
                    tue[i]= toDo;
                }
                else{
                    tue[i]=tuesday[i];
                }
            }
            tuesday =tue;
        }
        if(dayName.equals("WEDNESDAY")){
            int newlength = wednesday.length + 1;
            String wed[] = new String[newlength];
            for (int i=0; i<newlength;i++){
                if(i==newlength-1){
                    wed[i]= toDo;
                }
                else{
                    wed[i]=wednesday[i];
                }
            }
            wednesday =wed;
        }
        if(dayName.equals("THURSDAY")){
            int newlength = thursday.length + 1;
            String thu[] = new String[newlength];
            for (int i=0; i<newlength;i++){
                if(i==newlength-1){
                    thu[i]= toDo;
                }
                else{
                    thu[i]=thursday[i];
                }
            }
            thursday =thu;
        }
        if(dayName.equals("FRIDAY")){
            int newlength = friday.length + 1;
            String fri[] = new String[newlength];
            for (int i=0; i<newlength;i++){
                if(i==newlength-1){
                    fri[i]= toDo;
                }
                else{
                    fri[i]=friday[i];
                }
            }
            friday =fri;
        }
        if(dayName.equals("SATURDAY")){
            int newlength = saturday.length + 1;
            String sat[] = new String[newlength];
            for (int i=0; i<newlength;i++){
                if(i==newlength-1){
                    sat[i]= toDo;
                }
                else{
                    sat[i]=saturday[i];
                }
            }
            saturday =sat;
        }
        if(dayName.equals("SUNDAY")){
            int newlength = sunday.length + 1;
            String sun[] = new String[newlength];
            for (int i=0; i<newlength;i++){
                if(i==newlength-1){
                    sun[i]= toDo;
                }
                else{
                    sun[i]=sunday[i];
                }
            }
            sunday =sun;
        }
    }
}
