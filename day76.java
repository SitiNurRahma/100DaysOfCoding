package ISC;

public class day76 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        // Menghitung rata-rata
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        double average = (double) sum / array.length;

        System.out.println("Rata-rata dari array adalah: " + average);
    }
}
