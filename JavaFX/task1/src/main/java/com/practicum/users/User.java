package com.practicum.users;

public abstract class User {
    private String name;
    private String studentID;

    public User(String name, String studentID) {
        this.name = name;
        this.studentID = studentID;
    }

}
