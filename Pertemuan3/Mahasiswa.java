/*Nama File : Mahasiswa.java
* Deskripsi : Berisi atribut dan method dalam class Mahasiswa yang merepresentasikan
              data mahasiswa beserta relasinya dengan MataKuliah, Dosen, dan Kendaraan
* Pembuat   : Aprillia Abel Cleodora
* Tanggal   : 5 Maret 2026
*/

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;

    private MataKuliah[] listMatKul = new MataKuliah[50];
    private int jumlahMatKul = 0;

    private Dosen dosenWali;
    private Kendaraan kendaraan;

    public Mahasiswa() {
    }

    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public Dosen getDosenWali() {
        return dosenWali;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public void addMatKul(MataKuliah mk) {
        if (jumlahMatKul < 50) {
            listMatKul[jumlahMatKul] = mk;
            jumlahMatKul++;
        }
    }

    public int getJumlahMatKul() {
        return jumlahMatKul;
    }

    public int getJumlahSKS() {
        int total = 0;
        for (int i = 0; i < jumlahMatKul; i++) {
            total += listMatKul[i].getSks();
        }
        return total;
    }

    public void printMhs() {
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi : " + prodi);
    }

    public void printDetailMhs() {
        printMhs();

        System.out.println("\nDosen Wali : " + dosenWali.getNama());

        System.out.println("\nDaftar Mata Kuliah:");
        for (int i = 0; i < jumlahMatKul; i++) {
            System.out.println("- " + listMatKul[i].getNama() + 
                               " (" + listMatKul[i].getSks() + " SKS)");
        }

        if (kendaraan != null) {
            System.out.println("\nKendaraan : " + kendaraan.getJenis() +
                               " - " + kendaraan.getNoPlat());
        }
    }
}