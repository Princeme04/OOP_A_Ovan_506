import java.util.Scanner;

public class Admin {
    public static void loginAdmin() {
        Scanner loginMin = new Scanner(System.in);

        String userBenar = "admin506";
        String passBenar = "pass506";
        boolean berhasiltidak = true;

        while (berhasiltidak) {
            System.out.print("Masukan username: ");
            String username = loginMin.nextLine();

            System.out.print("Masukan password: ");
            String password = loginMin.nextLine();

            if (userBenar.equals(username) && passBenar.equals(password)) {
                System.out.println("Login berhasil!!");
                berhasiltidak = false;
            } else {
                System.out.println("Username atau password salah!!");
                System.out.println("Mohon coba lagi");
            }
        }

        loginMin.close();
    }
}