
package ISC;

import java.util.Scanner;

public class day88 {
    public static String cekHari(int tanggal) {
        if (tanggal % 7 == 0) {
            return "Minggu";
        } else if (tanggal % 7 == 1) {
            return "Senin";
        } else if (tanggal % 7 == 2) {
            return "Selasa";
        } else if (tanggal % 7 == 3) {
            return "Rabu";
        } else if (tanggal % 7 == 4) {
            return "Kamis";
        } else if (tanggal % 7 == 5) {
            return "Jumat";
        } else {
            return "Sabtu";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan tanggal: ");
        int tanggal = scanner.nextInt();

        String hari = cekHari(tanggal);
        System.out.println("Tanggal " + tanggal + " adalah " + hari);
    }
}

