package ISC;

import java.util.Scanner;

public class day39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai Awal : ");
        int nilaiAwal = sc.nextInt();
        
        System.out.print("Masukkan Nilai Akhir : ");
        int nilaiAkhir = sc.nextInt();
        
        int totalGenap = 0;
        int totalGanjil = 0;
        
        for (int i = nilaiAwal; i <= nilaiAkhir; i++) {
            System.out.println(i);
            if(i %2 == 0){
                totalGenap += i;
            }else{
                totalGanjil += i;
            }
            
        }System.out.println("Total penjumlahan genap : " +totalGenap );
        System.out.println("Total penjumlahan ganjil : " +totalGanjil );
    }
}
