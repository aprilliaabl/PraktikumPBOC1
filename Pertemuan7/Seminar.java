/*
Nama File : Seminar.java
*/

class Seminar {

    private CivitasAkademika[] peserta;
    private int banyakPeserta;

    // KONSTRUKTOR
    public Seminar() {
        peserta = new CivitasAkademika[100];
        banyakPeserta = 0;
    }

    // METHOD 
    public void registrasi(CivitasAkademika c) {
        peserta[banyakPeserta] = c;
        banyakPeserta++;
    }

    public int countPeserta() {
        return banyakPeserta;
    }

    public void tampilPeserta() {
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.println(peserta[i].getNomor() + " - " + peserta[i].getNama());
        }
    }

    public int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (peserta[i] instanceof Mahasiswa2) {
                count++;
            }
        }
        return count;
    }
}