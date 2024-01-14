
package ISC;

import java.util.Scanner;

public class day98 {
    public static void aritmetika(int angka) {
        for (int i = 1; i <= angka; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(i + " Adalah kelipatan 2 dan 3");
            } else if (i % 2 == 0) {
                System.out.println(i + " Adalah kelipatan 2");
            } else if (i % 3 == 0) {
                System.out.println(i + " Adalah kelipatan 3");
            } else {
                System.out.println(i + " Bukan kelipatan 2 atau 3");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int inputAngka = scanner.nextInt();
        aritmetika(inputAngka);
    }
}
