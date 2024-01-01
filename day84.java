
package ISC;

import java.util.Scanner;

public class day84 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Angka 1: ");
        int a = scanner.nextInt();

        System.out.print("Angka 2: ");
        int b = scanner.nextInt();

        System.out.println("Penjumlahan: " + penjumlahan(a, b));
        System.out.println("Pengurangan: " + pengurangan(a, b));
        System.out.println("Perkalian: " + perkalian(a, b));
        System.out.println("Pembagian: " + pembagian(a, b));
        System.out.println("Sisa Bagi: " + sisa_bagi(a, b));
    }

    static int penjumlahan(int a, int b) {
        return a + b;
    }

    static int pengurangan(int a, int b) {
        return a - b;
    }

    static int perkalian(int a, int b) {
        return a * b;
    }

    static double pembagian(int a, int b) {
        return (double) a / b;
    }

    static int sisa_bagi(int a, int b) {
        return a % b;
    }
}

