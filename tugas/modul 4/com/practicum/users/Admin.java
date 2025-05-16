package com.practicum.users;
import java.util.Scanner;
import com.practicum.action.AdminAction;

public class Admin extends User implements AdminAction {
    private final String username;
    private final String password;

    public Admin(String name, String studentID, String username, String password){
        super(name, studentID);
        this.username = username;
        this.password = password;
    }
    Scanner scanner = new Scanner(System.in);

    @Override
    public void login(){

        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();

        if(inputUsername.equals(username) && inputPassword.equals(password)){
            loggedIn = true;
            displayInfo();
        }else{
            System.out.println("Admin login failed. Invalid username or password");
            loggedIn = false;
        }
    }

    @Override
    public void displayInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Student ID: " + getStudentID());
        System.out.println("Admin " + getName() + " has successfully logged in.");
    }
    @Override
    public void displayAppMenu() {
        int inputChoice;
        do {
            System.out.println("Admin Menu :");
            System.out.println("1. Manage Item Reports");
            System.out.println("2. Manage Student Data");
            System.out.println("0. Logout");

            System.out.print("Enter your choice: ");
            inputChoice = scanner.nextInt();

            switch (inputChoice) {
                case 1:
                    manageItems();
                    break;
                case 2:
                    manageUsers();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (inputChoice!=0);
    }

    @Override
    public void manageItems() {
        System.out.println(">> Manage Items Feature Not Available <<");
    }

    @Override
    public void manageUsers() {
        System.out.println(">> Manage Users Feature Not Available <<");
    }
}
