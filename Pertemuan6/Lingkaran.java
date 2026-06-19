/*
 * Nama File  : Lingkaran.java
 * Deskripsi  : Class Lingkaran untuk menghitung keliling
 * Pembuat    : Aprillia Abel Cleodora
 * Tanggal    : 14 April 2026
 */

public class Lingkaran {

    // ATRIBUT 
    private double jariJari;

    // KONSTRUKTOR
    // Konstruktor untuk inisialisasi jari-jari
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    // SELEKTOR 
    // ambil nilai jari-jari
    public double getJariJari() {
        return jariJari;
    }

    // MUTATOR
    // ubah nilai jari-jari
    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    // METHOD LAIN
    // hitung keliling lingkaran
    public double hitungKeliling() {

        assert (jariJari > 0) : "Jari-jari tidak boleh nol atau negatif";

        return 2 * Math.PI * jariJari;
    }
}