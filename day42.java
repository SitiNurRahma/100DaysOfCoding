
package ISC;

import java.util.Scanner;

public class day42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai Awal : ");
        int nilaiAwal = sc.nextInt();
        
        System.out.print("Masukkan Batas Akhir : ");
        int batasAkhir = sc.nextInt();
        
        for (int i = batasAkhir; i <= nilaiAwal; i++) {
            
            if(i %2 == 0){
                System.out.println(i + " Adalah bilangan genap");
            }else{
                System.out.println(i + " Adalah bilangan ganjil");
            }
            
        }
    }
}
