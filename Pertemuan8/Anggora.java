/*
 * Nama File : Anggora.java
 * Deskripsi : Class Anggora turunan dari Kucing
 * Pembuat   : Aprillia Abel Cleodora
 * Tanggal   : 30 April 2026
 */

public class Anggora extends Kucing {

    /* KONSTRUKTOR */
    public Anggora(String nama, double bobot) {
        super(nama, bobot);
    }

    /* METHOD LAIN */

    // Menampilkan suara Anggora
    @Override
    public void bersuara() {
        System.out.println("Meong Anggora");
    }
}