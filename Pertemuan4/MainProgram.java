/* 
 * File       : MainProgram.java
 * Deskripsi  : Program utama untuk mengimplementasikan class BangunDatar,
 *              Persegi, dan lingkaran
 * Pembuat    : Aprillia Abel Cleodora
 * Tanggal    : 12 Maret 2026
 */

public class MainProgram {

    public static void main(String[] args) {

        /* IMPLEMENTASI KONSTRUKTOR */

        // Membuat objek Persegi menggunakan konstruktor tanpa parameter
        Persegi p1 = new Persegi();

        // Membuat objek Persegi menggunakan konstruktor dengan parameter
        Persegi p2 = new Persegi(5, "Merah", "Hitam");

        // Membuat objek Lingkaran menggunakan konstruktor
        Lingkaran l1 = new Lingkaran();

        /* IMPLEMENTASI MUTATOR */

        // Mengubah nilai sisi pada objek p1
        p1.setSisi(4);

        // Mengubah warna dan border menggunakan mutator dari BangunDatar
        p1.setWarna("Merah Muda");
        p1.setBorder("Hitam");

        // Mengubah nilai jari-jari lingkaran
        l1.setJari(7);

        // Mengubah warna dan border lingkaran
        l1.setWarna("Kuning");
        l1.setBorder("Hitam");

        /* IMPLEMENTASI SELEKTOR */

        // Mengambil nilai sisi persegi
        System.out.println("Sisi Persegi p1 : " + p1.getSisi());

        // Mengambil nilai jari-jari lingkaran
        System.out.println("Jari Lingkaran l1 : " + l1.getJari());

        /* IMPLEMENTASI METHOD LAIN */

        // Menghitung luas dan keliling persegi
        System.out.println("Luas Persegi p1 : " + p1.getLuas());
        System.out.println("Keliling Persegi p1 : " + p1.getKeliling());
        System.out.println("Diagonal Persegi p1 : " + p1.getDiagonal());

        // Menghitung luas dan keliling lingkaran
        System.out.println("Luas Lingkaran l1 : " + l1.getLuas());
        System.out.println("Keliling Lingkaran l1 : " + l1.getKeliling());

        /*  IMPLEMENTASI PRINTINFO */

        // Menampilkan informasi objek Persegi
        System.out.println("Info Persegi p1");
        p1.printInfo();

        // Menampilkan informasi objek Persegi dengan konstruktor parameter
        System.out.println("Info Persegi p2");
        p2.printInfo();

        // Menampilkan informasi objek Lingkaran
        System.out.println("Info Lingkaran l1");
        l1.printInfo();

        // Menampilkan jumlah objek BangunDatar
        BangunDatar.printCounterBangunDatar();

    }
}