
package ISC;

import java.util.Scanner;

public class day78 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan batas: ");
        int batas = scanner.nextInt();

        int[] arr = new int[batas];
        int jumlah = 0;

        for (int i = 0; i < batas; i++) {
            System.out.print("Masukkan angka: ");
            int isi = scanner.nextInt();
            arr[i] = isi;
            jumlah += isi;
        }

        double rataRata = (double) jumlah / (batas - 1);
        System.out.println("Rata-rata: " + rataRata);
    }
}

