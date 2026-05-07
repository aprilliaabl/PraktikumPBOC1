/*
 * Nama File : Kucing.java
 * Deskripsi : Class Kucing turunan dari Anabul
 * Pembuat   : Aprillia Abel Cleodora
 * Tanggal   : 30 April 2026
 */

public class Kucing extends Anabul {

    /* ATRIBUT */
    private double bobot;

    /* KONSTRUKTOR */
    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    /* SELEKTOR */

    // Mengembalikan bobot kucing
    public double getBobot() {
        return bobot;
    }

    /* MUTATOR */

    // Mengubah bobot kucing
    public void setBobot(double bobot) {
        this.bobot = bobot;
    }

    /* METHOD LAIN */

    // Menampilkan suara kucing
    @Override
    public void bersuara() {
        System.out.println("Meong");
    }

    // Menampilkan gerakan kucing
    @Override
    public void gerak() {
        System.out.println("Melata");
    }
}