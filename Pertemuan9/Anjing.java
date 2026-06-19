/* Nama      : Aprillia Abel Cleodora
   Nama File : Anjing.java
   Deskripsi : Subclass Anjing
   Tanggal   : 7 Mei 2026 */

public class Anjing extends Anabul {

    public Anjing(String nama, float berat) {
        super(nama, berat);
    }

    @Override
    public void suara() {
        System.out.println("Guk guk");
    }
}