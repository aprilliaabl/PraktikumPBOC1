/*
 * File       : Persegi.java
 * Deskripsi  : Class Persegi turunan dari BangunDatar
 * Pembuat    : Aprillia Abel Cleodora
 * Tanggal    : 23 Maret 2026
 */

public class Persegi extends BangunDatar implements IResize {

    /* ATRIBUT */
    private double sisi;

    /* KONSTRUKTOR */
    public Persegi() {
        this.sisi = 0;
        setJmlSisi(4);
    }

    public Persegi(double sisi) {
        this.sisi = sisi;
        setJmlSisi(4);
    }

    /* SELEKTOR */
    public double getSisi() {
        return sisi;
    }

    /* MUTATOR */
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    /* METHOD */
    @Override
    public double getLuas() {
        return sisi * sisi;
    }

    @Override
    public double getKeliling() {
        return 4 * sisi;
    }

    public double getDiagonal() {
        return Math.sqrt(2) * sisi;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi        : " + sisi);
        System.out.println("Luas        : " + getLuas());
        System.out.println("Keliling    : " + getKeliling());
    }

    /* IMPLEMENTASI INTERFACE */
    @Override
    public void zoomIn() {
        sisi *= 1.1;
    }

    @Override
    public void zoomOut() {
        sisi *= 0.9;
    }

    @Override
    public void zoom(int percent) {
        sisi *= (1 + percent / 100.0);
    }
}