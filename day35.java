package ISC;

import java.util.Scanner;

public class day35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka = sc.nextInt();
        int jumlah = 0;
        for (int i = 1; i <= angka; i++) {
            
            if(i %3 == 0){
                jumlah +=i;
                System.out.println(i);
            }         
        }
        System.out.println(jumlah);
    }
}
