/*
 * Nama File : Data.java
 * Deskripsi : Class larik generik
 * Pembuat   : Aprillia Abel Cleodora
 * Tanggal   : 30 April 2026
 */

public class Data<T> {

    /* ATRIBUT */
    private T[] ruang;
    private int banyak;

    /* KONSTRUKTOR */
    public Data() {
        ruang = (T[]) new Object[100];
        banyak = 0;
    }

    /* SELEKTOR */

    // Mengembalikan isi data pada indeks tertentu
    public T getIsi(int indeks) {
        return ruang[indeks];
    }

    // Mengembalikan jumlah elemen
    public int getSize() {
        return banyak;
    }

    /* MUTATOR */

    // isi data pada indeks
    public void setIsi(int indeks, T isi) {
        ruang[indeks] = isi;
        banyak++;
    }
}