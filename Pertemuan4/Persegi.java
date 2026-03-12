/* 
 * File       : Persegi.java
 * Deskripsi  : Kelas Persegi turunan dari BangunDatar
 * Pembuat    : Aprillia Abel Cleodora
 * Tanggal    : 12 Maret 2026
 */

public class Persegi extends BangunDatar {

    /* ======================= ATRIBUT ======================= */

    private double sisi;

    /* ===================== KONSTRUKTOR ===================== */

    public Persegi() {
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    /* ======================= SELEKTOR ====================== */

    public double getSisi() {
        return sisi;
    }

    /* ======================= MUTATOR ======================= */

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    /* ====================== METHOD LAIN ==================== */

    public double getLuas() {
        return sisi * sisi;
    }

    public double getKeliling() {
        return 4 * sisi;
    }

    public double getDiagonal() {
        return Math.sqrt(2) * sisi;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi : " + sisi);
    }
}