
package ISC;

import java.util.ArrayList;
import java.util.Scanner;

public class day49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> Genap = new ArrayList();
        ArrayList<Integer> Ganjil = new ArrayList();
        
        for (int i = 0; i < 4; i++) {
            int nilai = sc.nextInt();
            if(nilai %2 == 0){
                Genap.add(nilai);
            }else{
                Ganjil.add(nilai);
            }
        }
        for (int i = 0; i <Genap.size() ; i++) {
            System.out.println("ArrayGenap : " + Genap.get(i));
            System.out.println("ArrayGanjil : "+ Ganjil.get(i));
        }
    }
}
