
package ISC;

import java.util.Scanner;

public class day95 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai a: ");
        double a = scanner.nextDouble();

        System.out.print("Masukkan nilai b: ");
        double b = scanner.nextDouble();

        System.out.print("Masukkan nilai c: ");
        double c = scanner.nextDouble();

        double hasilRumus = hitungRumus(a, b, c);

        if (hasilRumus >= 0) {
            System.out.println("Hasil rumus: " + hasilRumus);
        } else {
            System.out.println("Hasil rumus: " + (-hasilRumus));
        }
    }

    static double hitungRumus(double a, double b, double c) {
        return Math.pow(a, 3) + Math.pow(b, 2) - c;
    }
}

