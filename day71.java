
package ISC;
public class day71 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int jumlahGanjil = 0;

        for (int num : array) {
            if (num % 2 == 1) {
                jumlahGanjil++;
            }
        }

        System.out.println("Jumlah Angka Ganjil: " + jumlahGanjil);
    }
}
