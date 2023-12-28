
package ISC;

import java.util.Arrays;
import java.util.Scanner;

public class day81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Batas: ");
        int batas = scanner.nextInt();

        int[] angka = masukkanAngka(batas);

        System.out.println(Arrays.toString(angka));
    }

    static int[] masukkanAngka(int batas) {
        int[] angka = new int[batas];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < batas; i++) {
            System.out.print("Nilai: ");
            int nilai = scanner.nextInt();
            angka[i] = nilai;
        }

        Arrays.sort(angka);

        return angka;
    }
}

