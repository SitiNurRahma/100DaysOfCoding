
package ISC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class day63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("panjang: ");
        int panjang = scanner.nextInt();
        ArrayList<String> teks = new ArrayList<>();

        for (int i = 0; i < panjang; i++) {
            System.out.print("nama: ");
            String nama = scanner.next();
            teks.add(nama);
        }

        Collections.sort(teks, Collections.reverseOrder());

        System.out.println(teks);
    }
}
