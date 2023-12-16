
package ISC;
import java.util.Scanner;

public class day68 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("nama: ");
            String nama = scanner.nextLine();

            if (nama.equals("")) {
                System.out.println("kosong");
            } else if (nama.equals("selesai")) {
                break;
            } else {
                System.out.println("nama saya: " + nama);
            }
        }

        scanner.close();
    }
}
