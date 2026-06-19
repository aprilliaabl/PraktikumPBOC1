/*
 * File       : BangunDatar.java
 * Deskripsi  : Abstract class untuk bangun datar
 * Pembuat    : Aprillia Abel Cleodora
 * Tanggal    : 23 Maret 2026
 */

public abstract class BangunDatar {

    /* ATRIBUT */
    protected int jmlSisi;
    protected String warna;
    protected String border;
    private static int counterBangunDatar = 0;

    /* KONSTRUKTOR */
    public BangunDatar() {
        this.warna = "Default";
        this.border = "Default";
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    /* SELEKTOR */
    public int getJmlSisi() {
        return jmlSisi;
    }

    public String getWarna() {
        return warna;
    }

    public String getBorder() {
        return border;
    }

    /* MUTATOR */
    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    /* METHOD */
    public void printInfo() {
        System.out.println("Jumlah sisi : " + jmlSisi);
        System.out.println("Warna       : " + warna);
        System.out.println("Border      : " + border);
    }

    public static void printCounterBangunDatar() {
        System.out.println("Jumlah objek BangunDatar: " + counterBangunDatar);
    }

    public abstract double getLuas();
    public abstract double getKeliling();

    /* PERBANDINGAN */
    public boolean isEqualLuas(BangunDatar X) {
        return Math.abs(this.getLuas() - X.getLuas()) < 0.0001;
    }

    public boolean isEqualKeliling(BangunDatar X) {
        return Math.abs(this.getKeliling() - X.getKeliling()) < 0.0001;
    }
}