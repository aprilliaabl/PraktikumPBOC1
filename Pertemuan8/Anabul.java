/*
 * Nama File : Anabul.java
 * Deskripsi : Superclass hewan Anabul
 * Pembuat   : Aprillia Abel Cleodora
 * Tanggal   : 30 April 2026
 */

public abstract class Anabul {

    /* ATRIBUT */
    protected String nama;

    /* KONSTRUKTOR */
    public Anabul(String nama) {
        this.nama = nama;
    }

    /* SELEKTOR */

    // Mengembalikan nama Anabul
    public String getNama() {
        return nama;
    }

    /* MUTATOR */

    // Mengubah nama Anabul
    public void setNama(String nama) {
        this.nama = nama;
    }

    /* METHOD LAIN */

    // abstrak suara
    public abstract void bersuara();

    // abstrak gerak
    public abstract void gerak();
}