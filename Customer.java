import java.util.Scanner;

public class Customer extends Main {
    protected String nama;
    protected String alamat;
    protected String nomor;

    Scanner in = new Scanner(System.in);

    public Customer() {
        System.out.print("Masukkan Nama Anda   : ");
        nama = in.nextLine();
        System.out.print("");
        System.out.print("Masukkan Alamat Anda : ");
        alamat = in.nextLine();
        System.out.print("");
        System.out.print("Masukkan No telepon  : ");
        nomor = in.next();

        System.out.println("Nama Customer  : " + nama);
        System.out.println("Alamat Cutomer : " + alamat);
        System.out.println("Nomor telepon  : " + nomor);
    }


}
