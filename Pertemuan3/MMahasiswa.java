/*Nama File : MMahasiswa.java
* Deskripsi : Berisi main class untuk membuat objek mahasiswa, Dosen, MataKuliah,
              dan kendaraan serta menguji relasi antar objek tersebut
* Pembuat   : Aprillia Abel Cleodora
* Tanggal   : 5 Maret 2026
*/

public class MMahasiswa {
    public static void main(String[] args) {

        Dosen d1 = new Dosen("170405", "Nailong", "Ilmu Maem");

        MataKuliah mk1 = new MataKuliah("IF101", "Manajemen Basis Data", 3);
        MataKuliah mk2 = new MataKuliah("IF102", "Struktur Data", 4);
        MataKuliah mk3 = new MataKuliah("IF103", "Basis Data", 3);

        Kendaraan k1 = new Kendaraan("S1234AB", "Mobil");

        Mahasiswa m1 = new Mahasiswa("24060124140176", "Aprillia Abel Cleodora", "Ilmu Maem");

        m1.setDosenWali(d1);
        m1.setKendaraan(k1);

        m1.addMatKul(mk1);
        m1.addMatKul(mk2);
        m1.addMatKul(mk3);

        System.out.println("Jumlah Mata Kuliah : " + m1.getJumlahMatKul());
        System.out.println("Jumlah SKS : " + m1.getJumlahSKS());
        System.out.println();

        m1.printDetailMhs();
    }
}