
package ISC;

import java.util.Scanner;

public class day51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan batas :");
        int batas = sc.nextInt();
        
        if(batas %2 == 0){
            System.out.println("Angka genap");
            
        }else{
           for (int i = 1; i <= batas; i++) {
            if(i%2== 0){    
                System.out.println(i);
            
            }
        } 
        }
        
    } 
}
