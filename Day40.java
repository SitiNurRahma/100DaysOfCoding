
package ISC;

import java.util.Scanner;

public class Day40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;

        while (true) {
            System.out.print("Masukkan angka: ");
            int angka = scanner.nextInt();

            total += angka;

            System.out.println("Total Penjumlahan : " + total);

            System.out.print("Ingin memasukkan angka lagi? (Y/N): ");
            String input = scanner.next();

            if (input.equals("N")) {
                break;
            }
        }
    }
}
