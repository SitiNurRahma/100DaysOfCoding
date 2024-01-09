
package ISC;

import java.util.Scanner;

public class day93 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai a: ");
        int a = scanner.nextInt();

        System.out.print("Masukkan nilai b: ");
        int b = scanner.nextInt();

        System.out.print("Masukkan nilai c: ");
        int c = scanner.nextInt();

        if (a > b && a > c) {
            System.out.println("Nilai A yang terbesar");
        } else if (b > a && b > c) {
            System.out.println("Nilai B yang terbesar");
        } else {
            System.out.println("Nilai C yang terbesar");
        }
    }
}

