
package ISC;

import java.util.Scanner;

public class day9 {
    public static void main(String[] args) {
        //memasukkan angka 1 dan 2 menggunakan scanner
        Scanner sc = new Scanner (System.in);
         System.out.print("Masukkan angka pertama: ");
        int angka1 = sc.nextInt();
        
        System.out.print("Masukkan angka kedua: ");
        int angka2 = sc.nextInt();
        
        //menggunakan operator penugasan
        int hasil;
        
        //melakukan proses perkalian dari angka yang telah diinput
        hasil = angka1 * angka2;
        System.out.println("Hasil perkalian: " + hasil);
    }
}
