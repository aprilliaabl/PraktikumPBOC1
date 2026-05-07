/* Nama      : Aprillia Abel Cleodora
   Nama File : Burung.java
   Deskripsi : Subclass Burung
   Tanggal   : 7 Mei 2026 */

public class Burung extends Anabul {

    public Burung(String nama, float berat) {
        super(nama, berat);
    }

    @Override
    public void suara() {
        System.out.println("Cuit cuit");
    }
}