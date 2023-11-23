
package ISC;

import java.util.Scanner;

public class day46 {
    public static void main(String[] args) {
        int batasAngka = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        batasAngka = sc.nextInt();

        int total = 0;
        for (int i = 1; i <= batasAngka; i++) {
            if (i % 2 == 0) {
                total += i;
                System.out.println("Genap " + i);
            } else {
                System.out.println("Ganjil " + i);
            }

        }
        System.out.println("total bilangan genap: " + total);
        System.out.println("Rata - Rata: " + total/batasAngka);
    }
}
