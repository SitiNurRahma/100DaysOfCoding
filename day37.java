
package ISC;

public class day37 {
    public static void main(String[] args) {
        int harga = 55000000;
        int gajiPerbulan = 1500000;
        int tabungan = 0;
        int bulan = 0;
        
        while (tabungan < harga){
            bulan++;
            tabungan += gajiPerbulan;
        }
        System.out.println(bulan);
        System.out.println(tabungan);
            
        
    }
}
