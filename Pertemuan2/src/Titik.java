/*Nama File : Titik.java
* Deskripsi : Berisi atribut dan method dalam class Titik
* Pembuat   : Aprillia Abel Cleodora
* Tanggal   : 26 Februari 2026 (16:00) 
*/

public class Titik {

    /*************** ATRIBUT ***************/
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /*************** KONSTRUKTOR ***************/

    // Konstruktor utama (dengan parameter)
    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    // Konstruktor default (memanggil konstruktor utama)
    public Titik() {
        this(0, 0);   // memanggil konstruktor di atas
    }

    /*************** METHOD ***************/

    public static int getCounterTitik() {
        return counterTitik;
    }

    public double getAbsis() {
        return this.absis;
    }

    public double getOrdinat() {
        return this.ordinat;
    }

    public void setAbsis(double absis) {
        this.absis = absis;
    }

    public void setOrdinat(double ordinat) {
        this.ordinat = ordinat;
    }

    public void geser(double x, double y) {
        this.absis += x;
        this.ordinat += y;
    }

    // Mengembalikan kuadran titik
    public int getKuadran() {
        if (absis > 0 && ordinat > 0) return 1;
        else if (absis < 0 && ordinat > 0) return 2;
        else if (absis < 0 && ordinat < 0) return 3;
        else if (absis > 0 && ordinat < 0) return 4;
        else return 0;
    }

    // Menghitung jarak ke pusat (0,0)
    public double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    // Menghitung jarak ke titik lain
    public double getJarak(Titik T) {
        double dx = this.absis - T.absis;
        double dy = this.ordinat - T.ordinat;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public void refleksiX() {
        this.ordinat = -this.ordinat;
    }

    public void refleksiY() {
        this.absis = -this.absis;
    }

    public Titik getRefleksiX() {
        return new Titik(this.absis, -this.ordinat);
    }

    public Titik getRefleksiY() {
         return new Titik(-this.absis, this.ordinat);
        }

    public void printTitik() {
        System.out.println("Titik (" + this.absis + "," + this.ordinat + ")");
    }
}