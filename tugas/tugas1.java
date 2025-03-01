import java.util.Scanner;

public class tugas1 {
    //for admin login
    public void loginAdmin(){
        Scanner loginMin = new Scanner(System.in);

        String userbenar = "admin506";
        String passbenar = "pass506";
        boolean berhasiltidak = false;//decide to run loop in case wrong user&pass

        while(!berhasiltidak) {
            System.out.print("Masukan username: ");
            String username = loginMin.nextLine();

            System.out.print("Masukan password: ");
            String password = loginMin.nextLine();

            if (userbenar.equals(username) && passbenar.equals(password)) {
                System.out.println("Login berhasil!!");
                berhasiltidak = true;
            } else {
                System.out.println("Username atau password salah!!");
                System.out.println("Mohon coba lagi");
            }
        }

        loginMin.close();
    }
    // for mahasiswa login
    public void loginMhs() {
        Scanner loginMhs = new Scanner(System.in);

        String userbenar = "OVAN KEYVA KUSUMADEWA";
        String passbenar = "202410370110506";
        boolean benartidak = false;

        while(!benartidak) {
            System.out.print("Masukan username: ");
            String username = loginMhs.nextLine();

            System.out.print("Masukan password: ");
            String password = loginMhs.nextLine();

            if (userbenar.equals(username) && passbenar.equals(password)) {
                System.out.println("Login berhasil!!");
                benartidak = true;
            } else {
                System.out.println("Username atau password salah!!");
                System.out.println("Mohon coba lagi");
            }
        }

        loginMhs.close();
    }
// main code
    public static void main(String[] args) {
        Scanner pilih = new Scanner(System.in);

        System.out.println("Pilih login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");

        int pilihan = pilih.nextInt();

        tugas1 myTugas1 = new tugas1();

        switch(pilihan) {
            case 1:
                myTugas1.loginAdmin();
                break;
            case 2:
                myTugas1.loginMhs();
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
        pilih.close();
        System.out.println("Process finished with exit code 0");
    }
}

