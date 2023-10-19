package ISC;

import java.util.Scanner;

public class day10 {
    public static void main(String[] args) {
        //melakukan perbandingan menngunakan scanner
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan angka pertama : ");
        int angka1 = sc.nextInt();
        
        System.out.print("Masukkan angka kedua : ");
        int angka2 = sc.nextInt();
        
        if(angka1 == angka2){
            System.out.println("Angka pertama dan angka kedua bernilai sama");
        }else if(angka1 < angka2){
            System.out.println("Angka pertama lebih kecil dari angka kedua");
        }else{
            System.out.println("Angka kedua lebih kecil dari angka pertama");
        }
        sc.close();
    }
}
