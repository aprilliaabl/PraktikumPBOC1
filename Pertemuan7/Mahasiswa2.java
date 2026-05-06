/*
Nama File : Mahasiswa2.java
*/

class Mahasiswa2 extends CivitasAkademika {

    private String nim;
    private Dosen dosenWali;

    // KONSTRUKTOR 
    public Mahasiswa2(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    // SELEKTOR 
    public String getNomor() {
        return nim;
    }

    // MUTATOR 
    public void setWali(Dosen d) {
        dosenWali = d;
    }

    // METHOD 
    public void tampilDataMahasiswa() {
        System.out.println(nim + " | " + nama + " | Wali: " + dosenWali.getNama());
    }
}