/*Nama File : MGaris.java
* Deskripsi : Berisi atribut dan method dalam class Garis
* Pembuat   : Aprillia Abel Cleodora
* Tanggal   : 26 Februari 2026 () 
*/

public class MGaris {
    public static void main(String[] args) {

        Titik T1 = new Titik(0,0);
        Titik T2 = new Titik(3,4);

        Garis G1 = new Garis(T1, T2);

        System.out.println("Jumlah objek Garis: " + Garis.getCounterGaris());
    }
}