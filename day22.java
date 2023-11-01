
package ISC;

import java.util.Scanner;

public class day22 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pilih sebuah angka (1-3): ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih angka 1.");
                break;
            case 2:
                System.out.println("Anda memilih angka 2.");
                break;
            case 3:
                System.out.println("Anda memilih angka 3.");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}
