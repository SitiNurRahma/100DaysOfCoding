
package ISC;
import java.util.Scanner;

public class day65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Apakah Anda suka bubur ayam? (Ya/Tidak): ");
        String suka_bubur_ayam = scanner.next();

        if (suka_bubur_ayam.equals("Ya")) {
            System.out.print("Apakah Anda suka bubur ayam yang diaduk? (Ya/Tidak): ");
            String suka_bubur_ayam_diaduk = scanner.next();

            if (suka_bubur_ayam_diaduk.equals("Tidak")) {
                System.out.println("Anda ternyata manusia beradab");
            } else {
                System.out.println("Beuh, kalau diaduk buburnya jadi mirip *? *?!");
            }
        } else {
            System.out.println("Cobain lagi deh kapan-kapan, sehat dan bergizi, siapa tahu jadi suka");
        }
    }
}

