package ISC;

import java.util.Scanner;

public class day44 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();

        while (angka != 0) {
            if (angka % 2 == 0) {
                System.out.println(angka + " adalah bilangan genap.");
            } else {
                System.out.println(angka + " adalah bilangan ganjil.");
            }

            System.out.print("Masukkan angka (masukkan 0 untuk keluar): ");
            angka = sc.nextInt();
        }

        System.out.println("Program selesai.");

    }
}
