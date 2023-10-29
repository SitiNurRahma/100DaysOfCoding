
package ISC;

import java.util.Scanner;

public class day20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan angka : ");
        int angka = sc.nextInt();
        
        System.out.print("Masukkan total : ");
        int total = sc.nextInt();
        
        while(angka >= 1){
            total -= angka;
            angka--;
            System.out.println("Hasil Pengurangan : " +total);
        }
    }
}
