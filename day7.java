package ISC;

import java.util.Scanner;

public class day7 {
    public static void main(String[] args) {
        
        //memasukkan nama dan umur menggunakan Scanner
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nama anda : ");
        String nama = sc.nextLine();
        System.out.println("Nama saya adalah : " +nama);
        
        System.out.print("Masukkan umur anda : ");
        int umur = sc.nextInt();
        System.out.println("Umur saya : " +umur);
    }
}
