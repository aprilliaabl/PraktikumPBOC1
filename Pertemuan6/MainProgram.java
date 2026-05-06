/*
 * Nama File  : MainProgram.java
 * Deskripsi  : Implementasi semua class (Konstruktor, Selektor, Mutator, Method)
 * Pembuat    : Aprillia Abel Cleodora
 * Tanggal    : 14 April 2026
 */

public class MainProgram {

    // METHOD UTAMA 
    public static void main(String[] args) {

        // IMPLEMENTASI CLASS LINGKARAN

        // Implementasi KONSTRUKTOR
        Lingkaran lingkaran = new Lingkaran(7);

        // Implementasi SELEKTOR
        System.out.println("Jari-jari awal: " + lingkaran.getJariJari());

        // Implementasi MUTATOR
        lingkaran.setJariJari(10);

        // Implementasi METHOD LAIN
        double keliling = lingkaran.hitungKeliling();
        System.out.println("Keliling Lingkaran: " + keliling);

        // IMPLEMENTASI EXCEPTION ARRAY
        try {
            ExceptionOnArray.aksesArray();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error array: indeks tidak valid");
        }

        // IMPLEMENTASI ANGKA SIAL
        try {

            // Implementasi METHOD 
            AngkaSial.cekAngka(10);
            AngkaSial.cekAngka(13);
            AngkaSial.cekAngka(5);

        } catch (AngkaSialException e) {

            // Penanganan exception
            System.out.println("Terjadi exception: " + e.getMessage());
        }

        System.out.println("Program selesai dijalankan");
    }
}