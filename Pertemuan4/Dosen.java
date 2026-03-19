/* 
 * File       : Dosen.java
 * Deskripsi  : Kelas turunan dari Pegawai untuk merepresentasikan Dosen
 * Pembuat    : Aprillia Abel Cleodora
 * Tanggal    : 15 Maret 2026
 */

import java.time.LocalDate;

public class Dosen extends Pegawai{

    // ATRIBUT 
    protected String fakultas;

    // KONSTRUKTOR 
    /* Konstruktor untuk menginisialisasi data dosen */
    public Dosen(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, 
                 double gajiPokok, String fakultas){
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }

    // SELEKTOR 
    /* Mengambil fakultas */
    public String getFakultas(){
        return fakultas;
    }

    // MUTATOR 
    /* Mengubah fakultas */
    public void setFakultas(String fakultas){
        this.fakultas = fakultas;
    }

    // METHOD LAIN 
    /* Menampilkan informasi dasar dosen */
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Fakultas        : " + fakultas);
    }
}