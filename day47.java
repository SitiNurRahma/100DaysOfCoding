
package ISC;

import java.util.Scanner;

public class day47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang array : ");
        
        int panjang = sc.nextInt();
        int[] numbers = new int[panjang];
        
        for (int i = 0; i < panjang; i++) {
            System.out.print("Nilai : "); 
            int nilai = sc.nextInt();
            numbers[i] = nilai;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            
        }
    }
}

