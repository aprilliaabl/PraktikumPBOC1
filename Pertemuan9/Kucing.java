/* Nama      : Aprillia Abel Cleodora
   Nama File : Kucing.java
   Deskripsi : Subclass Kucing
   Tanggal   : 7 Mei 2026 */

public class Kucing extends Anabul {

    public Kucing(String nama, float berat) {
        super(nama, berat);
    }

    @Override
    public void suara() {
        System.out.println("Meong");
    }
}