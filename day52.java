package ISC;

import java.util.Scanner;

public class day52 {
    public static void main(String[] args) {
        int batasAngka = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        batasAngka = sc.nextInt();

        int total = 0;
        int i = 1;

        while (i <= batasAngka) {
            if (i % 2 == 0) {
                total += i;
                System.out.println("Genap " + i);
            } else {
                System.out.println("Ganjil " + i);
            }
            i++;
        }

        System.out.println("Total bilangan genap: " + total);
        System.out.println("Rata - Rata: " + (double) total / batasAngka);
    }
}