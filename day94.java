
package ISC;

import java.util.ArrayList;
import java.util.Scanner;

public class day94 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int bilangan = scanner.nextInt();
        
        ArrayList<Integer> faktor = pecahBilangan(bilangan);

        System.out.print("Faktor-faktor prima dari " + bilangan + " adalah: ");
        for (int f : faktor) {
            System.out.print(f + " ");
        }
    }

    static ArrayList<Integer> pecahBilangan(int n) {
        ArrayList<Integer> faktor = new ArrayList<>();

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (isPrime(i)) {
                while (n % i == 0) {
                    faktor.add(i);
                    n /= i;
                }
            }
        }

        if (n > 1) {
            if (isPrime(n)) {
                faktor.add(n);
            }
        }

        return faktor;
    }

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}

