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
    public Garis() {
        this.titikAwal = new Titik(0,0);
        this.titikAkhir = new Titik(1,1);
        counterGaris++;
    }

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

    public void setTitikAwal(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }

    public void setTitikAkhir(Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    public double getPanjang() {
        return titikAwal.getJarak(titikAkhir);
    }

    public double getGradien() {
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();

        if (dx == 0) {
            throw new ArithmeticException("Gradien tidak terdefinisi (garis vertikal)");
        }

        return dy / dx;
    }

    public Titik getTitikTengah() {
        double xTengah = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double yTengah = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;

        return new Titik(xTengah, yTengah);
    }

    public boolean isSejajar(Garis G) {
        return this.getGradien() == G.getGradien();
    }

    public boolean isTegakLurus(Garis G) {
        return this.getGradien() * G.getGradien() == -1;
    }

    public void printGaris() {
        System.out.print("Titik Awal: ");
        titikAwal.printTitik();
        System.out.print("Titik Akhir: ");
        titikAkhir.printTitik();
    }

    public String getPersamaanGaris() {
        double m = getGradien();
        double c = titikAwal.getOrdinat() - (m * titikAwal.getAbsis());

        if (c >= 0) {
            return "y = " + m + "x + " + c;
        } else {
            return "y = " + m + "x - " + Math.abs(c);
        }
    }
}