package ISC;
import java.util.ArrayList;
import java.util.Scanner;

public class day57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> listAngka = new ArrayList<>();

        System.out.print("Masukkan jumlah angka: ");
        int jumlahAngka = sc.nextInt();

        for (int i = 1; i <= jumlahAngka; i++) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            int angka = sc.nextInt();

            listAngka.add(angka);
        }

        System.out.println("Menentukan apakah angka genap atau ganjil:");

        for (int angka : listAngka) {
            if (angka % 2 == 0) {
                System.out.println(angka + " adalah angka genap");
            } else {
                System.out.println(angka + " adalah angka ganjil");
            }
        }
    }
}
