package ISC;

import java.util.Scanner;

public class day8 {
    public static void main(String[] args) {
        
        //Menghitung luas persegi menggunakan scanner
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan Panjang Persegi : ");
        int panjang = sc.nextInt();
        
        System.out.print("Masukkan Lebar Persegi : ");
        int lebar = sc.nextInt();
        
        System.out.println("Luas Persegi Adalah : " + panjang*lebar);
    }
}
