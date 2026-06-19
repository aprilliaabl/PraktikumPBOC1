/*
Nama File : Dosen.java
*/

class Dosen extends CivitasAkademika {

    private String nip;

    public Dosen(String nama, String nip) {
        this.nama = nama;
        this.nip = nip;
    }

    public String getNomor() {
        return nip;
    }
}