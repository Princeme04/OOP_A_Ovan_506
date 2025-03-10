import java.util.Scanner;

public class codelab2m2 {
    public static void displayInfo (){
        Scanner norek = new Scanner(System.in);


        System.out.println("Masukkan No Rek: ");
        String pilihan = norek.nextLine();

        switch(pilihan){
            case "202410370110506":
                int saldo = 0;
                System.out.print("Nomor Rekening: "+ pilihan);
                System.out.print("Nomor Pemilik: Ovan");
                System.out.print("Saldo Rekening:"+ saldo);
        }



    }
    public static void main (String[] args){
        Scanner pilihan = new Scanner(System.in);

        System.out.println("Pilih opsi: ");
        System.out.println("1. Info");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.print("Masukkan pilihan: ");

        int pilih = pilihan.nextInt();

        switch(pilih){
            case 1:
                codelab2m2.displayInfo();
                break;
            case 2:
//                hai;
                break;
            default:
//        }


    }
}}
