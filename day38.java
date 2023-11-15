
package ISC;

import java.util.Scanner;

public class day38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan angka1 : ");
        int angka1 = sc.nextInt();
        
        System.out.print("Maukkan angka2 : ");
        int angka2 = sc.nextInt();
        
        int hasil = angka1 * angka2;
        
        if (hasil %2 == 0){
            hasil +=2;
        }else{
            hasil +=5;
        }
        System.out.println(hasil);
    }
}

