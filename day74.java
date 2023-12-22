
package ISC;

import java.util.ArrayList;
import java.util.Scanner;

public class day74 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = scanner.nextInt();

        int jumlah = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 1; i < angka; i++) {
            if (i % 3 == 0) {
                arr.add(i);
                System.out.println(arr);
                jumlah += i;
                System.out.println("-------");
            }
        }

        System.out.println("Total penjumlahan: " + jumlah);
    }
}
