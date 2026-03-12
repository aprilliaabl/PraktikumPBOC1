/*Nama File : Kendaraan.java
* Deskripsi : Berisi atribut dan method dalam class Kendaraan yang merepresentasikan
              kendaraan yang dimiliki oleh mahasiswa
* Pembuat   : Aprillia Abel Cleodora
* Tanggal   : 5 Maret 2026
*/

public class Kendaraan {

    /* Atribut */
    private String noPlat;
    private String jenis;

    /* Konstruktor */

    /* Konstruktor tanpa parameter */
    public Kendaraan() {

    }

    /* Konstruktor dengan parameter untuk menginisialisasi atribut kendaraan */
    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    /* Selektor (Getter) */

    /* Method untuk mendapatkan nomor plat kendaraan */
    public String getNoPlat() {
        return noPlat;
    }

    /* Method untuk mendapatkan jenis kendaraan */
    public String getJenis() {
        return jenis;
    }

    /* Mutator (Setter) */

    /* Method untuk mengubah nomor plat kendaraan */
    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    /* Method untuk mengubah jenis kendaraan */
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

}