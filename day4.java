
package ISC;

public class day4 {
    //Deklarasi variabel menggunakan tipe data non primitif
    public static void main(String[] args) {
        String nama = "Siti Nur Rahma";
        System.out.println("Nama : " +nama);
        
        Integer umur = 20;
        System.out.println("Umur : " + umur);
        
        Character jenisKelamin = 'P';
        System.out.println("Jenis Kelamin : " +jenisKelamin);
        
        //Konversi tipe data primitif ke String
        boolean mahasiswa = true;
        String mahasiswaString = Boolean.toString(mahasiswa);
        System.out.println("Saya adalah seorang mahasiswa : "+mahasiswa);
        
    }
}
