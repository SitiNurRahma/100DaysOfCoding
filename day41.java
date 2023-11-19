package ISC;

public class day41 {
    public static void main(String[] args) {
        
        System.out.println("Angka genap antara 1 sampai 100 yang dapat dibagi 5:");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
}
