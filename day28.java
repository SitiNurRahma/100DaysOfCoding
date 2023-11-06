package ISC;

public class day28 {
    public static void main(String[] args) {
        int hasil = hitungJumlah(5);
        System.out.println("Hasil perulangan: " + hasil);
    }

    public static int hitungJumlah(int i) {
        int jumlah = 0;
        for (int j = 1; j < 10; j++) {
            jumlah += i;
        }
        return jumlah;
    }
}
