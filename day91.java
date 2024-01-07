
package ISC;

import java.util.Scanner;

public class day91 {
    public static double hitungLuasSegitiga(double alas, double tinggi) {
        return (alas * tinggi) / 2;
    }

    public static double hitungLuasPersegi(double sisi) {
        return sisi * sisi;
    }

    public static double hitungLuasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan bentuk: ");
        String bentuk = scanner.nextLine();

        if (bentuk.equals("segitiga")) {
            System.out.print("Masukkan alas segitiga: ");
            double alas = scanner.nextDouble();
            System.out.print("Masukkan tinggi segitiga: ");
            double tinggi = scanner.nextDouble();
            double luas = hitungLuasSegitiga(alas, tinggi);
            System.out.println("Luas dari bentuk " + bentuk + " adalah " + luas);
        } else if (bentuk.equals("persegi")) {
            System.out.print("Masukkan sisi persegi: ");
            double sisi = scanner.nextDouble();
            double luas = hitungLuasPersegi(sisi);
            System.out.println("Luas dari bentuk " + bentuk + " adalah " + luas);
        } else if (bentuk.equals("persegi_panjang")) {
            System.out.print("Masukkan panjang persegi panjang: ");
            double panjang = scanner.nextDouble();
            System.out.print("Masukkan lebar persegi panjang: ");
            double lebar = scanner.nextDouble();
            double luas = hitungLuasPersegiPanjang(panjang, lebar);
            System.out.println("Luas dari bentuk " + bentuk + " adalah " + luas);
        } else {
            System.out.println("Bentuk yang Anda masukkan tidak valid.");
        }
    }
}

