import java.time.Year;
import java.util.Scanner;

public class codelab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        char jenisKelamin;
        while (true) {
            System.out.print("Masukkan jenis kelamin (P/L): ");
            jenisKelamin = scanner.next().toUpperCase().charAt(0);
            if (jenisKelamin == 'P' || jenisKelamin == 'L') {
                break;
            } else {
                System.out.println("Jenis kelamin tidak valid. Harap masukkan 'P' untuk Perempuan atau 'L' untuk Laki-laki.");
            }
        }

        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = scanner.nextInt();


        int currentYear = Year.now().getValue();


        int umur = currentYear - tahunLahir;


        System.out.println("\nData Diri:");
        System.out.println("Nama            : " + nama);
        System.out.println("Jenis Kelamin   : " + (jenisKelamin == 'L' ? "Laki-laki" : "Perempuan"));
        System.out.println("Umur            : " + umur + " tahun");

        scanner.close();
    }
}
