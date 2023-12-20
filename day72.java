
package ISC;
public class day72 {
    public static void main(String[] args) {
        int[] array = { 2, 9, 4, 7, 11};
        System.out.println(nilaiTerkecil(array));
    }

    public static int nilaiTerkecil(int[] array) {
        int terkecil = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < terkecil) {
                terkecil = array[i];
            }
        }
        return terkecil;
    }
}

