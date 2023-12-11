
package ISC;
import java.util.ArrayList;
import java.util.Scanner;

public class day61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nilaiUjian = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan nilai ujian siswa: ");
            int nilai = scanner.nextInt();
            nilaiUjian.add(nilai);
        }

        int jumlahLulus = 0;
        for (int nilai : nilaiUjian) {
            if (nilai >= 70) {
                jumlahLulus++;
            }
        }

        int jumlahTidakLulus = 5 - jumlahLulus;
        System.out.println("Jumlah siswa yang lulus: " + jumlahLulus);
        System.out.println("Jumlah siswa yang tidak lulus: " + jumlahTidakLulus);
    }
}

