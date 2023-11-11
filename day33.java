package ISC;

import java.util.ArrayList;

public class day33 {
    public static void main(String[] args) {
        
        ArrayList<Integer> angka = new ArrayList<>();

        angka.add(5);
        angka.add(10);
        angka.add(15);
        angka.add(20);

        for (int i = 0; i < angka.size(); i++) {
            System.out.println("Elemen ke-" + i + ": " + angka.get(i));
        }
    }
}
