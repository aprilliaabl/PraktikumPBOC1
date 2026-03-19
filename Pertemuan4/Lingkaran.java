/* 
 * File       : Lingkaran.java
 * Deskripsi  : Kelas Lingkaran merupakan turunan dari BangunDatar
 * Pembuat    : Aprillia Abel Cleodora
 * Tanggal    : 12 Maret 2026
 */

public class Lingkaran extends BangunDatar {

    /* ATRIBUT 
    /* Menyimpan nilai jari-jari lingkaran */
    private double jari;

    /* KONSTRUKTOR 
    // Konstruktor default
    /* Menginisialisasi jumlah sisi = 0 (lingkaran tidak memiliki sisi) */
    public Lingkaran() {
        setJmlSisi(0);
    }

    /* SELEKTOR 
    /* Mengambil nilai jari-jari */
    public double getJari() {
        return jari;
    }

    /* MUTATOR 
    /* Mengubah nilai jari-jari */
    public void setJari(double jari) {
        this.jari = jari;
    }

    /* METHOD LAIN
    /* Menghitung luas lingkaran (π x r x r) */
    public double getLuas() {
        return Math.PI * jari * jari;
    }

    /* Menghitung keliling lingkaran (2 x π x r) */
    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    /* OVERRIDE METHOD 
    /* Menampilkan informasi lingkaran */
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari : " + jari);
    }
}