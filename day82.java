
package ISC;

import java.util.Scanner;

public class day82 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int a = scanner.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int b = scanner.nextInt();

        int hasil = a + b;
        System.out.printf("Hasil penjumlahan %d + %d adalah %d.%n", a, b, hasil);

        String jenisBilangan = genapGanjil(hasil);
        System.out.printf("%d adalah bilangan %s.%n", hasil, jenisBilangan);
    }

    private static String genapGanjil(int nilai) {
        if (nilai % 2 == 0) {
            return "Genap";
        } else {
            return "Ganjil";
        }
    }
}

