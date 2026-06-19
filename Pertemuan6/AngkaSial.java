/*
 * Nama File  : AngkaSial.java
 * Deskripsi  : Class untuk pengecekan angka sial
 * Pembuat    : Aprillia Abel Cleodora
 * Tanggal    : 14 April 2026
 */

public class AngkaSial {

    // METHOD LAIN 
    // cek apakah angka termasuk angka sial
    public static void cekAngka(int angka) throws AngkaSialException {

        if (angka == 13) {
            throw new AngkaSialException("Angka 13 adalah angka sial!");
        }

        System.out.println("Angka: " + angka);
    }
}