/*Nama File : Mahasiswa.java
* Deskripsi : Berisi atribut dan method dalam class Mahasiswa yang merepresentasikan
              data mahasiswa beserta relasinya dengan MataKuliah, Dosen, dan Kendaraan
* Pembuat   : Aprillia Abel Cleodora
* Tanggal   : 5 Maret 2026
*/

public class Mahasiswa {

    /* Atribut */
    private String nim;
    private String nama;
    private String prodi;
    private MataKuliah[] listMatKul = new MataKuliah[50];
    private int jumlahMatKul = 0;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /* Konstruktor */

    /* Konstruktor tanpa parameter */
    public Mahasiswa() {

    }

    /* Konstruktor dengan parameter untuk menginisialisasi data mahasiswa */
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    /* Selektor (Getter) */

    /* Method untuk mendapatkan NIM mahasiswa */
    public String getNim() {
        return nim;
    }

    /* Method untuk mendapatkan nama mahasiswa */
    public String getNama() {
        return nama;
    }

    /* Method untuk mendapatkan program studi mahasiswa */
    public String getProdi() {
        return prodi;
    }

    /* Method untuk mendapatkan dosen wali mahasiswa */
    public Dosen getDosenWali() {
        return dosenWali;
    }

    /* Method untuk mendapatkan kendaraan mahasiswa */
    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    /* Mutator (Setter) */

    /* Method untuk mengubah NIM mahasiswa */
    public void setNim(String nim) {
        this.nim = nim;
    }

    /* Method untuk mengubah nama mahasiswa */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /* Method untuk mengubah program studi mahasiswa */
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    /* Method untuk mengatur dosen wali mahasiswa */
    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    /* Method untuk mengatur kendaraan mahasiswa */
    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    /* Method Lain */

    /* Method untuk menambahkan mata kuliah ke dalam daftar mata kuliah mahasiswa */
    public void addMatKul(MataKuliah mk) {
        if (jumlahMatKul < 50) {
            listMatKul[jumlahMatKul] = mk;
            jumlahMatKul++;
        }
    }

    /* Method untuk mendapatkan jumlah mata kuliah yang diambil mahasiswa */
    public int getJumlahMatKul() {
        return jumlahMatKul;
    }

    /* Method untuk menghitung total SKS mata kuliah yang diambil mahasiswa */
    public int getJumlahSKS() {
        int total = 0;
        for (int i = 0; i < jumlahMatKul; i++) {
            total += listMatKul[i].getSks();
        }
        return total;
    }

    /* Method untuk menampilkan data dasar mahasiswa */
    public void printMhs() {
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi : " + prodi);
    }

    /* Method untuk menampilkan detail mahasiswa beserta relasi objek lainnya */
    public void printDetailMhs() {
        printMhs();

        System.out.println("Dosen Wali : " + dosenWali.getNama());

        System.out.println("Daftar Mata Kuliah :");
        for (int i = 0; i < jumlahMatKul; i++) {
            System.out.println("- " + listMatKul[i].getNama() + " (" + listMatKul[i].getSks() + " SKS)");
        }

        if (kendaraan != null) {
            System.out.println("Kendaraan : " + kendaraan.getJenis() + " - " + kendaraan.getNoPlat());
        }
    }
}