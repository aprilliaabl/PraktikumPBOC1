/*
 * Nama File : KembangTelon.java
 * Deskripsi : Class KembangTelon turunan dari Kucing
 * Pembuat   : Aprillia Abel Cleodora
 * Tanggal   : 30 April 2026
 */

public class KembangTelon extends Kucing {

    /* KONSTRUKTOR */
    public KembangTelon(String nama, double bobot) {
        super(nama, bobot);
    }

    /* METHOD LAIN */

    // Menampilkan suara KembangTelon
    @Override
    public void bersuara() {
        System.out.println("Meong Kembang Telon");
    }
}