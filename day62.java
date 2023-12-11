
package ISC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class day62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nilai = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("angka: ");
            int angka = scanner.nextInt();
            nilai.add(angka);
        }

        Collections.sort(nilai);

        System.out.println(nilai);
    }
}

