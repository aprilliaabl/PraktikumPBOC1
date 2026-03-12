/* Nama File : Dosen.java
 * Deskripsi : Class yang merepresentasikan data dosen wali mahasiswa
 * Pembuat   : Aprillia Abel Cleodora
 * Tanggal   : 12 Maret 2026
 */

public class Dosen {

    /* Atribut */
    private String nip;
    private String nama;
    private String prodi;

    /* Konstruktor */

    /* Konstruktor tanpa parameter */
    public Dosen() {

    }

    /* Konstruktor dengan parameter untuk menginisialisasi atribut dosen */
    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    /* Selektor (Getter) */

    /* Method untuk mendapatkan nilai NIP dosen */
    public String getNip() {
        return nip;
    }

    /* Method untuk mendapatkan nama dosen */
    public String getNama() {
        return nama;
    }

    /* Method untuk mendapatkan program studi dosen */
    public String getProdi() {
        return prodi;
    }

    /* Mutator (Setter) */

    /* Method untuk mengubah nilai NIP dosen */
    public void setNip(String nip) {
        this.nip = nip;
    }

    /* Method untuk mengubah nama dosen */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /* Method untuk mengubah program studi dosen */
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

}