package ISC;

import java.util.Scanner;

public class day7 {
    public static void main(String[] args) {
        
        //memasukkan nama dan umur menggunakan Scanner
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Anda : ");
        String nama = sc.nextLine();
        System.out.println("Nama Saya Adalah : " +nama);
        
        System.out.print("Masukkan Umur Anda : ");
        int umur = sc.nextInt();
        System.out.println("Umur Saya : " +umur);
    }
}
