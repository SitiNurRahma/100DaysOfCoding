package ISC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class day58 {
    public static void main(String[] args) {
        ArrayList<String> daftarNama = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("nama: ");
            String nama = scanner.nextLine();

            if (nama.equals("")) {
                break;
            }

            daftarNama.add(nama);
        }

        Collections.sort(daftarNama);

        System.out.println(daftarNama);
    }
}
