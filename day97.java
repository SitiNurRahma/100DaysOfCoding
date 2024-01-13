package ISC;

import java.util.Scanner;

public class day97 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan harga barang: ");
        double hargaBarang = scanner.nextDouble();

        System.out.print("Masukkan persentase diskon (dalam persen): ");
        double persentaseDiskon = scanner.nextDouble();

        double diskon = (persentaseDiskon / 100) * hargaBarang;
        
        double hargaSetelahDiskon = hargaBarang - diskon;

        System.out.println("Harga barang: Rp " + hargaBarang);
        System.out.println("Diskon: Rp " + diskon);
        System.out.println("Harga setelah diskon: Rp " + hargaSetelahDiskon);
    }
}


