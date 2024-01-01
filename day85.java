
package ISC;

import java.util.Scanner;

public class day85 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan batas angka: ");
        int batasAngka = scanner.nextInt();

        batas(batasAngka);
    }

    static void batas(int batasAngka) {
        if (batasAngka % 2 == 0) {
            System.out.println(batasAngka);
        } else {
            for (int i = 1; i <= batasAngka; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
    }
}

