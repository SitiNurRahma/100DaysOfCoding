package ISC;

import java.util.Scanner;

public class day31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan Angka1 : ");
        int angka1 = sc.nextInt();
        
        System.out.print("Masukkan Angka2 : ");
        int angka2 = sc.nextInt();
        
        int hasil = angka1 * angka2;
        if (hasil >5){
            hasil -=3;
        }else{
            hasil +=3;
        }
        System.out.println(hasil);
    }
}
