
package ISC;
public class day66 {
    public static void main(String[] args) {
        int komputer = 55000000;
        int pendapatan = 1500000;
        int bulan = 0;
        int tabungan = 0;

        while (true) {
            if (tabungan < komputer) {
                tabungan += pendapatan;
                bulan++;
            } else {
                break;
            }
        }

        System.out.println(bulan);
        System.out.println(tabungan);
    }
}
