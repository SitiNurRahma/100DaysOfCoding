package ISC;

import java.util.Scanner;

public class day53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan batas : ");
        int batas = sc.nextInt();

        if (batas == 1 || batas == 2) {
            System.out.println("kosong");
        } else {
            int i = 1;
            while (i < batas) {
                if (i % 3 == 0) {
                    System.out.println(i);
                }
                i++;
            }
        }
    }
}