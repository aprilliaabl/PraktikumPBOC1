/* Nama      : Aprillia Abel Cleodora
   Nama File : Anabul.java
   Deskripsi : Superclass Anabul
   Tanggal   : 7 Mei 2026 */

public abstract class Anabul {

    protected String nama;
    protected float berat;

    // Konstruktor
    public Anabul(String nama, float berat) {
        this.nama = nama;
        this.berat = berat;
    }

    // Getter nama
    public String getNama() {
        return nama;
    }

    // Setter nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter berat
    public float getBerat() {
        return berat;
    }

    // Method abstrak
    public abstract void suara();

    @Override
    public String toString() {
        return nama;
    }
}