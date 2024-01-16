package ISC;

import java.util.Scanner;

public class day100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan Angka : ");
        int angka = sc.nextInt();
        System.out.println(angka);
        
        if(angka <100){
            System.out.println("Maaf anda tidak lolos");
        }else{
            System.out.println("Selamat anda lolos");
        }
    }
}
