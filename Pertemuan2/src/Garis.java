/*Nama File : Garis.java
* Deskripsi : Berisi atribut dan method dalam class Garis
* Pembuat   : Aprillia Abel Cleodora
* Tanggal   : 26 Februari 2026 () 
*/

public class Garis {

    /*************** ATRIBUT ***************/
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    /*************** KONSTRUKTOR ***************/
    public Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    public Titik getTitikAwal() {
        return titikAwal;
    }

    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    public static int getCounterGaris() {
        return counterGaris;
    }
    
}