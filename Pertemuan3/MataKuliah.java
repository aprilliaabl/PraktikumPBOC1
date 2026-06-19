/*Nama File : MataKuliah.java
* Deskripsi : Berisi atribut dan method dalam class MataKuliah yang merepresentasikan 
              data mata kuliah yang dapat diambil oleh mahasiswa
* Pembuat   : Aprillia Abel Cleodora
* Tanggal   : 5 Maret 2026
*/

public class MataKuliah {

    /* Atribut */
    private String kode;
    private String nama;
    private int sks;

    /* Konstruktor */

    /* Konstruktor tanpa parameter */
    public MataKuliah() {

    }

    /* Konstruktor dengan parameter untuk menginisialisasi atribut mata kuliah */
    public MataKuliah(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    /* Selektor (Getter) */

    /* Method untuk mendapatkan kode mata kuliah */
    public String getKode() {
        return kode;
    }

    /* Method untuk mendapatkan nama mata kuliah */
    public String getNama() {
        return nama;
    }

    /* Method untuk mendapatkan jumlah SKS mata kuliah */
    public int getSks() {
        return sks;
    }

    /* Mutator (Setter) */

    /* Method untuk mengubah kode mata kuliah */
    public void setKode(String kode) {
        this.kode = kode;
    }

    /* Method untuk mengubah nama mata kuliah */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /* Method untuk mengubah jumlah SKS mata kuliah */
    public void setSks(int sks) {
        this.sks = sks;
    }

}