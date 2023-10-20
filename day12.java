package ISC;

import java.util.Scanner;

public class day12 {
    public static void main(String[] args) {
        //Menghitung keliling persegi menggunakan Scanner
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan Panjang Persegi : ");
        int panjang = sc.nextInt();
        
        System.out.print("Masukkan Lebar Persegi : ");
        int lebar = sc.nextInt();
        
        int keliling = (2*panjang) + (2*lebar);
        
        System.out.println("Keliling Persegi Adalah: " + keliling);
    }
}
