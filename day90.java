
package ISC;

import java.util.Scanner;

import java.util.Scanner;

public class day90 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input tinggi segitiga: ");
        int tinggiSegitiga = scanner.nextInt();
        System.out.println();

        for (int i = 1; i <= tinggiSegitiga; i++) {
            // Mencetak spasi untuk membentuk pola segitiga
            for (int j = tinggiSegitiga - i; j > 0; j--) {
                System.out.print("  ");
            }

            // Mencetak angka pada setiap baris
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print(i + " ");
            }

            // Pindah ke baris baru setelah satu baris segitiga tercetak
            System.out.println();
        }
    }
}


