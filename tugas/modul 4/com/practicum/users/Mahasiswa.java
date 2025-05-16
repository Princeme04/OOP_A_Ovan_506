package com.practicum.users;
import java.util.Scanner;
import java.util.logging.Logger;

import com.practicum.action.MahasiswaAction;

public class Mahasiswa extends User implements MahasiswaAction {
    public Mahasiswa(String name, String studentID) {
        super(name, studentID);
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void login() {

        System.out.print("Enter name: ");
        String inputName = scanner.nextLine();
        System.out.print("Enter student ID: ");
        String inputID = scanner.nextLine();

        if (inputName.equalsIgnoreCase(getName()) && inputID.equals(getStudentID())) {
            loggedIn = true;
            displayInfo();
        } else {
            System.out.println("Login failed! Invalid name or student ID.");
            loggedIn = false;
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Student ID: " + getStudentID());
        System.out.println("Student " + getName() + " has successfuly logged in.");
    }

    @Override
    public void displayAppMenu() {
        int choices;
        do {
            System.out.println("Choose one of the following options:");
            System.out.println("1. Report Lost and Found Items");
            System.out.println("2. View Report List");
            System.out.println("0. Logout");

            System.out.print("Enter your choice: ");
            choices = scanner.nextInt();

            switch (choices) {
                case 1:
                    reportItem();
                    break;
                case 2:
                    viewReportedItems();
                    break;
                case 0:
                    System.out.println("Bye Bye");
                    break;
                default:
            }
        } while (choices != 0);
    }
    @Override
    public void reportItem() {
        scanner.nextLine();
        System.out.println("Reported Items :");

        System.out.print("Item Name: ");
        String inputName = scanner.nextLine();

        System.out.print("Item Description: ");
        String inputDescription = scanner.nextLine();

        System.out.print("Item last location/found: ");
        String inputLastLocation = scanner.nextLine();
    }
    @Override
    public void viewReportedItems() {
        System.out.println(">> View Reported Items Feature Not Available <<");
}
}
