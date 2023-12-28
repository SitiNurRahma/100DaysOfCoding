
package ISC;

import java.util.Scanner;

public class day79 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tahun kelahiran Anda: ");
        int tahun_lahir = scanner.nextInt();

        System.out.print("Bulan kelahiran Anda: ");
        int bulan_lahir = scanner.nextInt();

        System.out.print("Hari kelahiran Anda: ");
        int hari_lahir = scanner.nextInt();

        int tahun_sekarang = 2023;
        int bulan_sekarang = 12;
        int hari_sekarang = 26;

        int usia_tahun = tahun_sekarang - tahun_lahir;
        int usia_bulan = bulan_sekarang - bulan_lahir;
        int usia_hari = hari_sekarang - hari_lahir;

        if (usia_hari < 0) {
            usia_bulan--;
            usia_hari += 30;
        }

        if (usia_bulan < 0) {
            usia_tahun--;
            usia_bulan += 12;
        }

        System.out.println("Kamu telah hidup selama " + usia_tahun + " tahun, " + usia_bulan + " bulan, dan " + usia_hari + " hari.");
    }
}
