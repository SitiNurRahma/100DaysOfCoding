package ISC;
import java.util.Scanner;

public class day55 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Batas Angka:");
        int batas_angka = sc.nextInt();

        if (batas_angka % 2 == 0) {
            System.out.println("Angka Genap : ");
            for (int i = 2; i <= batas_angka; i += 2) {
                System.out.println(i + "");

            }
        } else {
            System.out.println("Angka Ganjil :");
            for (int i = 1; i <= batas_angka; i += 2) {
                System.out.println(i + "");
            }
        }
        sc.close();
    }
}