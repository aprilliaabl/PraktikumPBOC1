/*
 * Nama File : Main.java
 * Deskripsi : Main program implementasi seluruh class
 * Pembuat   : Aprillia Abel Cleodora
 * Tanggal   : 30 April 2026
 */

public class Main {
    public static void main(String[] args) {

        /* IMPLEMENTASI KONSTRUKTOR */

        Anggora a1 = new Anggora("Milo", 4.5);
        KembangTelon k1 = new KembangTelon("Luna", 3.0);

        /* IMPLEMENTASI SELEKTOR */

        System.out.println(a1.getNama());
        System.out.println(a1.getBobot());

        /* IMPLEMENTASI MUTATOR */

        a1.setBobot(5.0);
        System.out.println(a1.getBobot());

        /* IMPLEMENTASI METHOD LAIN */

        a1.bersuara();
        a1.gerak();

        k1.bersuara();
        k1.gerak();

        /* IMPLEMENTASI GENERIK DATUM */

        Datum<Anabul> d1 = new Datum<>();
        d1.setIsi(a1);

        System.out.println(d1.getIsi().getNama());

        /* IMPLEMENTASI TUKAR INTEGER */

        Integer x = 3;
        Integer y = 6;

        System.out.println("Sebelum tukar:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        OperatorGenerik.tukar(x, y);

        /* IMPLEMENTASI TUKAR STRING */

        String s1 = "Halo";
        String s2 = "Dunia";

        System.out.println("Sebelum tukar:");
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        OperatorGenerik.tukar(s1, s2);

        /* IMPLEMENTASI TUKAR ANABUL */

        Anabul hewan1 = a1;
        Anabul hewan2 = k1;

        System.out.println("Sebelum tukar:");
        System.out.println("hewan1 = " + hewan1.getNama());
        System.out.println("hewan2 = " + hewan2.getNama());

        OperatorGenerik.tukar(hewan1, hewan2);

        /* IMPLEMENTASI GENERIK BOBOT2 */

        double totalBobot = OperatorGenerik.bobot2(a1, k1);
        System.out.println("Total bobot = " + totalBobot);

        /* IMPLEMENTASI GENERIK DATA */

        Data<Anabul> data = new Data<>();

        data.setIsi(0, a1);
        data.setIsi(1, k1);

        System.out.println(data.getIsi(0).getNama());
        System.out.println(data.getIsi(1).getNama());

        System.out.println("Jumlah data = " + data.getSize());
    }
}