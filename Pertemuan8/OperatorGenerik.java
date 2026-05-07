/*
 * Nama File : OperatorGenerik.java
 * Deskripsi : Class operator generik
 * Pembuat   : Aprillia Abel Cleodora
 * Tanggal   : 30 April 2026
 */

public class OperatorGenerik {

    /* METHOD LAIN */

    // tukar dua data
    public static <T> void tukar(T a, T b) {
        T temp = a;
        a = b;
        b = temp;

        System.out.println("Setelah tukar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    // hitung jumlah bobot dua kucing
    public static <T extends Kucing> double bobot2(T k1, T k2) {
        return k1.getBobot() + k2.getBobot();
    }
}