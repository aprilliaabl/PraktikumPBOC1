/*
Nama File : Mahasiswa.java
Deskripsi : Class Mahasiswa (Overloading)
Pembuat   : Aprillia Abel Cleodora
Tanggal   : 23 April 2026
*/

class Mahasiswa {

    // ATRIBUT 
    private int nim;
    private String nama;
    private String programStudi;

    // KONSTRUKTOR 
    public Mahasiswa() {
        nim = -999;
        nama = "n/a";
        programStudi = "n/a";
    }

    public Mahasiswa(int nim, String nama, String programStudi) {
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
    }

    public Mahasiswa(Mahasiswa m) {
        this.nim = m.nim;
        this.nama = m.nama;
        this.programStudi = m.programStudi;
    }

    // MUTATOR (OVERLOADING) 
    public void setProgramStudi() {
        programStudi = "Kosong";
    }

    public void setProgramStudi(String ps) {
        programStudi = ps;
    }

    public void setProgramStudi(Mahasiswa m) {
        programStudi = m.programStudi;
    }

    // METHOD 
    public void tampilData() {
        System.out.println(nim + " | " + nama + " | " + programStudi);
    }
}