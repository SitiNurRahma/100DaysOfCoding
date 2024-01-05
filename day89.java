
package ISC;

import java.util.Scanner;

public class day89 {
    public static double hitungGaji(double jamKerja, double upahPerJam) {
        if (jamKerja <= 40) {
            return jamKerja * upahPerJam;
        } else {
            return 40 * upahPerJam + (jamKerja - 40) * (upahPerJam * 1.5);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah jam kerja Anda: ");
        double jamKerja = scanner.nextDouble();

        System.out.print("Masukkan upah per jam Anda: ");
        double upahPerJam = scanner.nextDouble();

        double gaji = hitungGaji(jamKerja, upahPerJam);
        System.out.println("Gaji Anda adalah: " + gaji);
    }
}
