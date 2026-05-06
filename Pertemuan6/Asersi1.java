/*
 * Nama File  : Asersi1.java
 * Deskripsi  : Contoh penggunaan asersi sederhana
 * Pembuat    : Aprillia Abel Cleodora
 * Tanggal    : 14 April 2026
 */

public class Asersi1 {

    // METHOD UTAMA
    public static void main(String[] args) {

        int x = 5;

        // Asersi untuk memastikan nilai x positif
        assert (x > 0) : "Nilai x harus positif";

        System.out.println("Nilai x = " + x);
    }
}