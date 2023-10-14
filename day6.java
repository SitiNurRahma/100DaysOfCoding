package ISC;

public class day6 {
     public static void main(String[] args) {
        int usia = 20;

        if (usia >= 0 && usia <= 12) {
            System.out.println("Kamu masih anak-anak");
        } else if (usia >= 13 && usia <= 19) {
            System.out.println("Kamu sudah remaja");
        } else if (usia >= 20 && usia <= 59) {
            System.out.println("Kamu sudahh dewasa");
        } else {
            System.out.println("Kamu sudah tuaaa");
        }
    }
 
}
