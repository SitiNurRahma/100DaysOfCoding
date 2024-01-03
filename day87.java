
package ISC;

import java.util.Scanner;

public class day87 {
    public static boolean cekPrima(int bilangan) {
        if (bilangan <= 1) {
            return false;
        }
        for (int i = 2; i < bilangan; i++) {
            if (bilangan % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int bilangan = scanner.nextInt();

        if (cekPrima(bilangan)) {
            System.out.printf("Bilangan %d adalah bilangan prima.%n", bilangan);
        } else {
            System.out.printf("Bilangan %d bukan bilangan prima.%n", bilangan);
        }
    }
}

