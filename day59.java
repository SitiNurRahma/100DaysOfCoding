
package ISC;
import java.util.Scanner;

public class day59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("angka: ");
        int angka = scanner.nextInt();

        if (angka > 0) {
            System.out.println("positif");
        } else if (angka < 0) {
            System.out.println("negatif");
        } else {
            System.out.println("nol");
        }
    }
}

