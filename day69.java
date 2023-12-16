
package ISC;
public class day69 {
    public static void main(String[] args) {
        int[] array = {1, 7, 35,95, 5};
        int maksimum = array[0];

        for (int element : array) {
            if (element > maksimum) {
                maksimum = element;
            }
        }

        System.out.println(maksimum);
    }
}

