package ISC;

public class day29 {
    public static void main(String[] args) {
        int [] angka = {1,2,3,4,5};
        
        int indeks = 2;
        if (indeks >= 0 && indeks < angka.length) {
            System.out.println("Item pada indeks " + indeks + ":" + angka[indeks]);
        }else{
            System.out.println("Indeks tidak valid");
        }
    }
}
