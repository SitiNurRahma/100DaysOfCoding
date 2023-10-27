package ISC;

public class day19 {
    public static void main(String[] args) {
        int angka = 9;
        int total = 10;
        while(angka >= 1 ){
            total -= angka;
            angka--;
            System.out.println("Hasil pengurangan : " +total);
        }
    }
}
