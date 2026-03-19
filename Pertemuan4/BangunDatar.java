/* 
 * File       : BangunDatar.java
 * Deskripsi  : Superclass untuk bangun datar
 * Pembuat    : Aprillia Abel Cleodora
 * Tanggal    : 12 Maret 2026
 */

public class BangunDatar {

    /* ATRIBUT 
    /* Menyimpan jumlah sisi bangun datar */
    private int jmlSisi;

    /* Mengambil warna */
    private String warna;

    /* Menyimpan jenis border bangun datar */
    private String border;

    /* Menghitung jumlah objek BangunDatar yang dibuat */
    private static int counterBangunDatar = 0;

    /* KONSTRUKTOR 
    // Konstruktor default
    /* Menambahkan counter setiap objek dibuat */
    public BangunDatar() {
        counterBangunDatar++;
    }

    // Konstruktor dengan parameter
    /* Menginisialisasi jmlSisi, warna, dan border */
    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    /* SELEKTOR 
    /* Mengambil jumlah sisi */
    public int getJmlSisi() {
        return jmlSisi;
    }

    /* Mengambil warna */
    public String getWarna() {
        return warna;
    }

    /* Mengambil border */
    public String getBorder() {
        return border;
    }

    /* MUTATOR 
    /* Mengubah jumlah sisi */
    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    /* Mengubah warna */
    public void setWarna(String warna) {
        this.warna = warna;
    }

    /* Mengubah border */
    public void setBorder(String border) {
        this.border = border;
    }

    /* METHOD LAIN 
    /* Menampilkan informasi bangun datar */
    public void printInfo() {
        System.out.println("Jumlah sisi : " + jmlSisi);
        System.out.println("Warna       : " + warna);
        System.out.println("Border      : " + border);
    }

    /* Menampilkan jumlah objek BangunDatar yang telah dibuat */
    public static void printCounterBangunDatar() {
        System.out.println("Jumlah objek BangunDatar : " + counterBangunDatar);
    }
}