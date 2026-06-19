/*
 * Nama File : Datum.java
 * Deskripsi : Class generik Datum
 * Pembuat   : Aprillia Abel Cleodora
 * Tanggal   : 30 April 2026
 */

public class Datum<T> {

    /* ATRIBUT */
    private T isi;

    /* SELEKTOR */

    // Mengembalikan isi datum
    public T getIsi() {
        return isi;
    }

    /* MUTATOR */

    // Mengubah isi datum
    public void setIsi(T isiBaru) {
        isi = isiBaru;
    }
}