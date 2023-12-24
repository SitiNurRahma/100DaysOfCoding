
package ISC;

public class day77 {
    public static void main(String[] args) {
        int panjangArray = 10;
        int[] nilaiArray = new int[panjangArray];

        for (int i = 0; i < panjangArray; i++) {
            nilaiArray[i] = i * 2;
        }

        int nilaiIndeks5 = nilaiArray[4];
        int nilaiIndeks7 = nilaiArray[6];

        int totalNilai = nilaiIndeks5 + nilaiIndeks7;

        System.out.println("Array pada indeks 5: " + nilaiIndeks5);
        System.out.println("Array pada indeks 7: " + nilaiIndeks7);
        System.out.println("Jumlah nilai pada indeks 5 dan 7: " + totalNilai);
    }
}

