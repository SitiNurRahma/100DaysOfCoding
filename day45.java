
package ISC;

public class day45 {
    public static void main(String[] args) {
        System.out.println("Angka genap antara 1 sampai 100 yang dapat dibagi 5 : ");
        
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }

        System.out.println();
    }
}
