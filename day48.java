
package ISC;

import java.util.ArrayList;
import java.util.Scanner;

public class day48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers =  new ArrayList();
        
        System.out.print("Masukkan panjang : ");
        int panjang = sc.nextInt();
        
        for (int i = 0; i < panjang; i++) {
            int nilai = sc.nextInt();
            if(nilai %2 != 0){
                numbers.add(nilai);
                
            }
        }System.out.println("Ganjil : " +numbers);
    }
}
