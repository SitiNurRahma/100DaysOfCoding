
package ISC;

import java.util.Scanner;

public class day99 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Angka: ");
        int nilai = scanner.nextInt();
        aritmatika(nilai);
    }

    static void aritmatika(int angka) {
        for (int i = 1; i <= angka; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " adalah bilangan genap.");
            } else {
                if (i % 3 == 0) {
                    System.out.println(i + " adalah kelipatan 3.");
                } else if (i % 5 == 0) {
                    System.out.println(i + " adalah kelipatan 5.");
                } else {
                    System.out.println(i + " bukan bilangan genap, bukan kelipatan 3, dan bukan kelipatan 5.");
                }
            }
        }
    }
}

