/*Nama File : MMahasiswa.java
* Deskripsi : Berisi main class untuk membuat objek mahasiswa, Dosen, MataKuliah,
              dan kendaraan serta menguji relasi antar objek tersebut
* Pembuat   : Aprillia Abel Cleodora
* Tanggal   : 5 Maret 2026
*/

public class MMahasiswa {
    public static void main(String[] args) {

        /* Implementasi Konstruktor class Dosen */
        Dosen d1 = new Dosen("170405", "Nailong", "Ilmu Maem");

        /* Implementasi Konstruktor class MataKuliah */
        MataKuliah mk1 = new MataKuliah("IF101", "Manajemen Basis Data", 3);
        MataKuliah mk2 = new MataKuliah("IF102", "Struktur Data", 4);
        MataKuliah mk3 = new MataKuliah("IF103", "Basis Data", 3);

        /* Implementasi Konstruktor class Kendaraan */
        Kendaraan k1 = new Kendaraan("S1234AB", "Mobil");

        /* Implementasi Konstruktor class Mahasiswa */
        Mahasiswa m1 = new Mahasiswa("24060124140176", "Aprillia Abel Cleodora", "Ilmu Maem");

        /* Implementasi Mutator untuk mengatur relasi objek */
        m1.setDosenWali(d1);
        m1.setKendaraan(k1);

        /* Implementasi Method untuk menambahkan MataKuliah */
        m1.addMatKul(mk1);
        m1.addMatKul(mk2);
        m1.addMatKul(mk3);

        /* Implementasi Method untuk mendapatkan jumlah MataKuliah */
        System.out.println("Jumlah Mata Kuliah : " + m1.getJumlahMatKul());

        /* Implementasi Method untuk menghitung total SKS */
        System.out.println("Jumlah SKS : " + m1.getJumlahSKS());
        System.out.println();

        /* Implementasi Method untuk menampilkan detail Mahasiswa */
        m1.printDetailMhs();
    }
}