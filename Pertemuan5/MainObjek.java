/*
 * File       : MainObjek.java
 * Deskripsi  : Main program pengujian
 * Pembuat    : Aprillia Abel Cleodora
 * Tanggal    : 23 Maret 2026
 */

public class MainObjek {
    public static void main(String[] args) {

        /* OBJEK */
        BangunDatar P1 = new Persegi(10);
        Persegi P2 = new Persegi(5);
        BangunDatar L1 = new Lingkaran(7);
        Lingkaran L2 = new Lingkaran(14);

        /* INFO */
        System.out.println("=== INFO OBJEK ===");
        P1.printInfo();
        P2.printInfo();
        L1.printInfo();
        L2.printInfo();

        /* SELEKTOR */
        System.out.println("\nSisi P2        : " + P2.getSisi());
        System.out.println("Jari L2        : " + L2.getJari());

        /* PERHITUNGAN */
        System.out.println("\nLuas P2        : " + P2.getLuas());
        System.out.println("Keliling P2    : " + P2.getKeliling());
        System.out.println("Diagonal P2    : " + P2.getDiagonal());

        System.out.println("\nLuas L2        : " + L2.getLuas());
        System.out.println("Keliling L2    : " + L2.getKeliling());

        /* PERBANDINGAN */
        System.out.println("\nLuas P1 == L1  : " + P1.isEqualLuas(L1));
        System.out.println("Keliling P1 == L1 : " + P1.isEqualKeliling(L1));

        /* RESIZE */
        System.out.println("\n=== RESIZE PERSEGI ===");
        P2.zoomIn();
        System.out.println("ZoomIn  : " + P2.getSisi());

        P2.zoomOut();
        System.out.println("ZoomOut : " + P2.getSisi());

        P2.zoom(50);
        System.out.println("Zoom 50%: " + P2.getSisi());

        System.out.println("\n=== RESIZE LINGKARAN ===");
        L2.zoomIn();
        System.out.println("ZoomIn  : " + L2.getJari());

        L2.zoomOut();
        System.out.println("ZoomOut : " + L2.getJari());

        L2.zoom(25);
        System.out.println("Zoom 25%: " + L2.getJari());

        /* COUNTER */
        System.out.println();
        BangunDatar.printCounterBangunDatar();
    }
}