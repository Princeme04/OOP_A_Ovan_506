package com.practicum.users;



public abstract class User {
    private final String name;
    private final String studentID;

    public User(String name, String studentID){
        this.name = name;
        this.studentID = studentID;
    }


    public String getName() {
        return name;
    }

    public String getStudentID(){
        return studentID;
    }

    public void login(){
        System.out.println("Overriden");

    }
    public boolean loggedIn = false;

    public boolean isLoggedIn(){
        return loggedIn;
    }

    public void displayInfo(){

    }
    public abstract void displayAppMenu();
}
