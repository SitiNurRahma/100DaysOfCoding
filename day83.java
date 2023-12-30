
package ISC;

import java.util.Scanner;

public class day83 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int a = scanner.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int b = scanner.nextInt();

        int penjumlahan = a + b;

        System.out.println("Hasil penjumlahan: " + penjumlahan);

        if (isGenap(penjumlahan)) {
            System.out.println("Bilangan genap");
        } else {
            System.out.println("Bilangan ganjil");
        }

        if (isPrima(penjumlahan)) {
            System.out.println("Bilangan prima");
        } else {
            System.out.println("Bukan bilangan prima");
        }
    }

    private static boolean isGenap(int x) {
        return x % 2 == 0;
    }

    private static boolean isPrima(int x) {
        if (x <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }

        return true;
    }
}

