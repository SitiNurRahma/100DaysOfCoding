
package ISC;

public class day70 {
    public static void main(String[] args) {
        int[] angka = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int tengah = angka.length / 2;

        // Bagian Atas
        int[] bagianAtas = new int[tengah];
        for (int i = 0; i < tengah; i++) {
            bagianAtas[i] = angka[i];
        }

        // Bagian Bawah
        int[] bagianBawah = new int[angka.length - tengah];
        for (int i = tengah; i < angka.length; i++) {
            bagianBawah[i - tengah] = angka[i];
        }

        // Cetak Bagian Atas
        System.out.print("Bagian Atas: ");
        for (int num : bagianAtas) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Cetak Bagian Bawah
        System.out.print("Bagian Bawah: ");
        for (int num : bagianBawah) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
