import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String ph = "y";
        Scanner input = new Scanner(System.in);

        while (ph.equals("y")) {
            String pilih = "y";
            System.out.println("========================================");
            System.out.println("    SELAMAT DATANG DI KEBAB MORGANS     ");
            System.out.println("========================================");
            System.out.println("1. Lihat Menu");
            System.out.println("2. Pilih Menu");
            System.out.println("3. Buat pesanan");
            System.out.println("========================================");
            System.out.print("Masukkan Pilihan : ");
            int plh = input.nextInt();
            System.out.println("\n");

            switch (plh) {
                case 1:
                    System.out.println("Menu Kebab : ");
                    System.out.println("1. Beef Cheese Mayo : 20.000");
                    System.out.println("2. Meat Love        : 20.000");
                    System.out.println("3. Beef Oregano     : 20.000");
                    System.out.println("4. Beef Barbeque    : 20.000");
                    break;
                case 2:
                    while (pilih.equals("y")) {
                        System.out.print("Masukkan nomor Menu Anda    : ");
                        int psn = input.nextInt();
                        System.out.print("Masukkan jumlah Pesanan     : ");
                        int jmlh = input.nextInt();
                        System.out.println("ingin memesan kembali? y/n :");
                        pilih = input.next();
                    }
                    break;
                case 3:
                    Customer cust = new Customer();
                    System.out.println("Connecting to resto...");
                    System.out.println("Pesananmu Sudah dikonfirmasi oleh restoran");
                    System.out.println("Harap Tunggu Sebentar, Pesananmu sedang disiapkan!! ");
                    System.out.println("============================================");

            }
            System.out.println("kembali ke menu awal y/n : ");
            ph = input.next();
        }
        Resto resto = new Resto("Kebab Morgans");
        Driver driver = new Driver("Budi");
        resto.connectTo(driver);

    }
}