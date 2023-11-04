
package ISC;

import java.util.Scanner;

public class day25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan panjang array: ");
        int length = sc.nextInt();
        
        int[]dataarray = new int[length];
        
        System.out.print("Masukkan elemen array: ");
        for (int i = 0; i < length; i++) {
            System.out.print("Elemen ke-" +i+":");
            int elemen = sc.nextInt();
            dataarray[i] = elemen;
            
        }
        System.out.println("Elemen-elemen array:");
        for (int i = 0; i < length; i++) {
            System.out.println("Elemen ke- "+i+":"+ dataarray[i]);
            
        }
        
    }
}
