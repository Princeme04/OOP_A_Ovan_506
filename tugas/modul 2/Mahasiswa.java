import java.util.Scanner;

public class Mahasiswa {
    public static void loginMhs() {
        Scanner loginMhs = new Scanner(System.in);

        String userbenar = "OVAN KEYVA KUSUMADEWA";
        String passbenar = "202410370110506";
        boolean benarTidak = true;

        while (benarTidak) {
            System.out.print("Masukan username: ");
            String username = loginMhs.nextLine();

            System.out.print("Masukan password: ");
            String password = loginMhs.nextLine();

            if (userbenar.equals(username) && passbenar.equals(password)) {
                System.out.println("Login berhasil!!");
                benarTidak = false;
            } else {
                System.out.println("Username atau password salah!!");
                System.out.println("Mohon coba lagi");
            }
        }

        loginMhs.close();
    }
}