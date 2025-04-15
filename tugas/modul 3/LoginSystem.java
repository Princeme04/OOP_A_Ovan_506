import java.util.Scanner;

public class LoginSystem{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Adminn admin = new Adminn("Alice", "A001", "admin", "1234");
        Student student = new Student("Bob", "S123");

        System.out.println("===== LOGIN SYSTEM =====");
        System.out.println("1. Login as Admin");
        System.out.println("2. Login as Student");
        System.out.println("Choose option: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        if(choice == 1234){
            choice = 3;

        }
        switch (choice){
            case 1:
                admin.login();
                break;
            case 2:
                student.login();
                break;
            case 3:
                System.out.println();
            default:
                System.out.println("Invalid choice.");
        }
        scanner.close();
    }
}
