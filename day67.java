
package ISC;

import java.util.Scanner;

public class day67 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Penghasilan: ");
        int gaji = scanner.nextInt();
        int batas = 5240000;
        double zakat = 0;

        if (gaji >= batas) {
            double besaran = (2.5 / 100) * gaji;
            zakat = besaran;
        }

        double bersih = gaji - zakat;

        System.out.println("Zakat: " + zakat);
        System.out.println("Bersih: " + bersih);
    }
}
