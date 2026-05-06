/*
 * File       : Lingkaran.java
 * Deskripsi  : Class Lingkaran turunan dari BangunDatar
 * Pembuat    : Aprillia Abel Cleodora
 * Tanggal    : 23 Maret 2026
 */

public class Lingkaran extends BangunDatar implements IResize {

    /* ATRIBUT */
    private double jari;

    /* KONSTRUKTOR */
    public Lingkaran() {
        this.jari = 0;
        setJmlSisi(0);
    }

    public Lingkaran(double jari) {
        this.jari = jari;
        setJmlSisi(0);
    }

    /* SELEKTOR */
    public double getJari() {
        return jari;
    }

    /* MUTATOR */
    public void setJari(double jari) {
        this.jari = jari;
    }

    /* METHOD */
    @Override
    public double getLuas() {
        return Math.PI * jari * jari;
    }

    @Override
    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari   : " + jari);
        System.out.println("Luas        : " + getLuas());
        System.out.println("Keliling    : " + getKeliling());
    }

    /* IMPLEMENTASI INTERFACE */
    @Override
    public void zoomIn() {
        jari *= 1.1;
    }

    @Override
    public void zoomOut() {
        jari *= 0.9;
    }

    @Override
    public void zoom(int percent) {
        jari *= (1 + percent / 100.0);
    }
}