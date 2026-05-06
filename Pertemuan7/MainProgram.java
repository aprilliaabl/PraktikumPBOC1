/*
Nama File : MainProgram.java
Deskripsi : Implementasi seluruh class
Pembuat   : Aprillia Abel Cleodora
Tanggal   : 23 April 2026
*/

public class MainProgram {

    public static void main(String[] args) {

        // IMPLEMENTASI OVERLOADING 
        Mahasiswa m1 = new Mahasiswa();
        Mahasiswa m2 = new Mahasiswa(123, "Abel", "Informatika");
        Mahasiswa m3 = new Mahasiswa(m2);

        m1.setProgramStudi();
        m2.setProgramStudi("Sistem Informasi");
        m3.setProgramStudi(m2);

        m1.tampilData();
        m2.tampilData();
        m3.tampilData();

        // IMPLEMENTASI INHERITANCE
        Anabul k = new Kucing();
        Anabul a = new Anjing();
        Anabul b = new Burung();

        k.suara(); k.gerak();
        a.suara(); a.gerak();
        b.suara(); b.gerak();

        // IMPLEMENTASI SEMINAR 
        Seminar s = new Seminar();

        Dosen d1 = new Dosen("Pak Budi", "D001");
        Dosen d2 = new Dosen("Bu Ani", "D002");

        Mahasiswa2 mhs1 = new Mahasiswa2("A", "M001");
        Mahasiswa2 mhs2 = new Mahasiswa2("B", "M002");
        Mahasiswa2 mhs3 = new Mahasiswa2("C", "M003");
        Mahasiswa2 mhs4 = new Mahasiswa2("D", "M004");
        Mahasiswa2 mhs5 = new Mahasiswa2("E", "M005");

        mhs1.setWali(d1);
        mhs2.setWali(d1);
        mhs3.setWali(d2);
        mhs4.setWali(d2);
        mhs5.setWali(d1);

        s.registrasi(d1);
        s.registrasi(d2);
        s.registrasi(mhs1);
        s.registrasi(mhs2);
        s.registrasi(mhs3);
        s.registrasi(mhs4);
        s.registrasi(mhs5);

        System.out.println("Jumlah peserta: " + s.countPeserta());
        System.out.println("Jumlah mahasiswa: " + s.countMahasiswa());

        s.tampilPeserta();
    }
}