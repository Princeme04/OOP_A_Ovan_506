public class authentication {

    private int nomor = 5;

    public void Plat (int nomor) {
         this.nomor = nomor;
    }

    public int otput () {
        return nomor;
    }
//    public void loginAdmin(){
//        Scanner loginMin = new Scanner(System.in);
//
//        String userbenar = "admin506";
//        String passbenar = "pass506";
//        boolean berhasiltidak = true;//decide to run loop in case wrong user&pass
//
//        while(berhasiltidak) {
//            System.out.print("Masukan username: ");
//            String username = loginMin.nextLine();
//
//            System.out.print("Masukan password: ");
//            String password = loginMin.nextLine();
//
//            if (userbenar.equals(username) && passbenar.equals(password)) {
//                System.out.println("Login berhasil!!");
//                berhasiltidak = false;
//            } else {
//                System.out.println("Username atau password salah!!");
//                System.out.println("Mohon coba lagi");
//            }
//        }
//
//        loginMin.close();
//    }
//}
//public void loginMhs() {
//    Scanner loginMhs = new Scanner(System.in);
//
//    String userbenar = "OVAN KEYVA KUSUMADEWA";
//    String passbenar = "202410370110506";
//    boolean benartidak = true;
//
//    while(benartidak) {
//        System.out.print("Masukan username: ");
//        String username = loginMhs.nextLine();
//
//        System.out.print("Masukan password: ");
//        String password = loginMhs.nextLine();
//
//        if (userbenar.equals(username) && passbenar.equals(password)) {
//            System.out.println("Login berhasil!!");
//            benartidak = false;
//        } else {
//            System.out.println("Username atau password salah!!");
//            System.out.println("Mohon coba lagi");
//        }
//    }
//
//    loginMhs.close();
}