package ISC;

import java.util.ArrayList;
import java.util.Scanner;

public class day36 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka = sc.nextInt();
        ArrayList<Integer> numbers = new ArrayList();
        
        for (int i = 1; i <= angka; i++) {
            
            if(i %3 == 0){
                System.out.println(i);
            numbers.add(i);
            }         
        }
        int totalPengurangan = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            totalPengurangan -= numbers.get(i);
        }
        System.out.println(totalPengurangan);
    } 
}
