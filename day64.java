package ISC;

import java.util.Arrays;

import java.util.Scanner;

public class day64 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan panjang array
        System.out.print("Masukkan panjang array: ");
        int length = scanner.nextInt();

        // Membuat array dengan panjang yang dimasukkan pengguna
        int[] numbers = new int[length];

        // Meminta pengguna untuk memasukkan elemen array
        System.out.println("Masukkan elemen array:");

        for (int i = 0; i < length; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Menampilkan array sebelum diurutkan
        System.out.println("Array sebelum diurutkan: " + Arrays.toString(numbers));

        // Menggunakan kelas Arrays untuk mengurutkan array
        Arrays.sort(numbers);

        // Menampilkan array setelah diurutkan
        System.out.println("Array setelah diurutkan: " + Arrays.toString(numbers));

        scanner.close();
    }
    
}
