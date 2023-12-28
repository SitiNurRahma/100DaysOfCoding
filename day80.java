
package ISC;

import java.util.Arrays;
import java.util.Scanner;

public class day80 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ketik Sebuah Kalimat: ");
        String kalimat = scanner.nextLine();

        String[] kata = kalimat.split("\\s+");

        Arrays.sort(kata);

        System.out.println("Berikut Urutan Kata-Kata:");

        for (String urut : kata) {
            System.out.println(urut);
        }
    }
}
