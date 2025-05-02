package com.practicum.main;

import java.util.Scanner;
import com.practicum.users.*;


public class Main {
    public static void main(String[] args) {
        Scanner choice = new Scanner(System.in);

        System.out.println("Select option: ");
        System.out.println("1. Admin Login");
        System.out.println("2. Student Login");
        System.out.print("Enter choice: ");
        int choices = choice.nextInt();

        Admin admin = new Admin("Ovan Keyva Kusumadewa", "202410370110506", "admin506", "pass506");
        Mahasiswa mahasiswa = new Mahasiswa("Ovan Keyva Kusumadewa", "202410370110506");

        switch(choices){
            case 1:
                admin.login();
                break;
            case 2:
                mahasiswa.login();
                break;
            case 3:
                System.out.println("""
                                     ／＞　 フ
                                    | 　_　_|\s
                                  ／` ミ＿xノ\s
                                 /　　　　 |
                                /　 ヽ　　 ﾉ
                                │　　|　|　|
                             ／￣|　　 |　|　|
                            (￣ヽ＿_ヽ_)__)
                             ＼二)\
                        """);
                break;
            default:
                System.out.println("No option!");
        }
    choice.close();

}
}