package ISC;
import java.util.Scanner;

public class day56 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan batas Angka :");
        int Batas = input.nextInt();

        System.out.println("Angka kelipatan 5 :");
        int jumlah = 0;

        for (int i = 1; i <= Batas; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
                jumlah++;
            }
        }
        System.out.println("jumlah kelipatan 5 adalah : " + jumlah);
    }
}