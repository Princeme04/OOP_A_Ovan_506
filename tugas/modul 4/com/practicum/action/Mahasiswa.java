package com.practicum.action;

import java.util.Scanner;
import com.practicum.users.User;

public class Mahasiswa extends User {
    public Mahasiswa(String name, String studentID){
        super(name, studentID);
    }
    @Override
    public void login(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String inputName = scanner.nextLine();
        System.out.print("Enter student ID: ");
        String inputID = scanner.nextLine();

        if(inputName.equalsIgnoreCase(getName()) && inputID.equals(getStudentID())){
            displayInfo();
        }else{
            System.out.println("Login failed! Invalid name or student ID.");
        }
    }
    @Override
    public void displayInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Student ID: " + getStudentID());
        System.out.println("Student " + getName() + " has successfuly logged in.");

    }
}
