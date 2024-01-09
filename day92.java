
package ISC;

import java.util.Scanner;

public class day92 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai a: ");
        int a = scanner.nextInt();

        System.out.print("Masukkan nilai b: ");
        int b = scanner.nextInt();

        System.out.print("Masukkan nilai c: ");
        int c = scanner.nextInt();

        double[] result = hitungPersamaanKuadrat(a, b, c);

        if (!Double.isNaN(result[0])) {
            System.out.printf("Hasil Persamaan Kuadrat adalah %.2f dan %.2f%n", result[0], result[1]);
        } else {
            System.out.println("Persamaan Kuadrat tidak memiliki akar real");
        }
    }

    public static double[] hitungPersamaanKuadrat(int a, int b, int c) {
        double d = b * b - 4 * a * c;
        double[] roots = new double[2];

        if (d >= 0) {
            roots[0] = (-b + Math.sqrt(d)) / (2 * a);
            roots[1] = (-b - Math.sqrt(d)) / (2 * a);
        } else {
            roots[0] = roots[1] = Double.NaN;
        }

        return roots;
    }
}


