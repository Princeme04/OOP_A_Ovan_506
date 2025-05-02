package com.practicum.users;

import java.util.Scanner;

public class Admin extends User {
    private final String username;
    private final String password;

    public Admin(String name, String studentID, String username, String password){
        super(name, studentID);
        this.username = username;
        this.password = password;
    }
    @Override
    public void login(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();

        if(inputUsername.equals(username) && inputPassword.equals(password)){
            displayInfo();
        }else{
            System.out.println("Admin login failed. Invalid username or password");
        }
    }

    @Override
    public void displayInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Student ID: " + getStudentID());
        System.out.println("Admin " + getName() + " has successfully logged in.");
    }
}
