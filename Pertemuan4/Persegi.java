/* 
 * File       : Persegi.java
 * Deskripsi  : Kelas Persegi turunan dari BangunDatar
 * Pembuat    : Aprillia Abel Cleodora
 * Tanggal    : 12 Maret 2026
 */

public class Persegi extends BangunDatar {

    /* ATRIBUT 
    /* Menyimpan panjang sisi persegi */
    private double sisi;

    /* KONSTRUKTOR 
    // Konstruktor default
    /* Menginisialisasi jumlah sisi = 4 */
    public Persegi() {
        setJmlSisi(4);
    }

    // Konstruktor dengan parameter
    /* Menginisialisasi sisi, warna, dan border */
    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    /* SELEKTOR
    /* Mengambil nilai sisi */
    public double getSisi() {
        return sisi;
    }

    /* MUTATOR 
    /* Mengubah nilai sisi */
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    /* METHOD LAIN 
    /* Menghitung luas persegi (sisi x sisi) */
    public double getLuas() {
        return sisi * sisi;
    }

    /* Menghitung keliling persegi (4 x sisi) */
    public double getKeliling() {
        return 4 * sisi;
    }

    /* Menghitung diagonal persegi (√2 x sisi) */
    public double getDiagonal() {
        return Math.sqrt(2) * sisi;
    }

    /* Menampilkan informasi persegi */
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi : " + sisi);
    }
}