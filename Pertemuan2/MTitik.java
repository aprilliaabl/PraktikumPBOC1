/*Nama File : MTitik.java
* Deskripsi : Berisi atribut dan method dalam class Titik
* Pembuat   : Aprillia Abel Cleodora
* Tanggal   : 26 Februari 2026 (16:00) 
*/

public class MTitik {
    public static void main(String[] args) {

// Bagian 1 - Membuat Class dan Objek Titik
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);

        System.out.println("Bagian 1:");
        T1.printTitik();
        T1.geser(3,4);
        T1.printTitik();       

// Bagian 2 – Object Reference
        System.out.println("Bagian 2:");

        Titik T2 =T1;

        System.out.println("Sebelum diubah:");
        T1.printTitik();
        T2.printTitik();

        T1.setAbsis(10);
        T1.setOrdinat(10);

        System.out.println("Setelah T1 diubah:");
        T1.printTitik();
        T2.printTitik();

// Bagian 3 – Overloading Constructor
    System.out.println("Bagian 3:");
    
    Titik C = new Titik();
    Titik D = new Titik(5,7);
    
    C.printTitik();
    D.printTitik();

// Bagian 4 – Static Attribute & Method
    System.out.println("Bagian 4");
    System.out.println("Jumlah objek Titik yang dibuat: " + Titik.getCounterTitik());

// Bagian 5 – Keyword This
    System.out.println("Bagian 5");

    Titik A = new Titik();
    A.printTitik();

    Titik B = new Titik(5, 7);
    B.printTitik();

    B.setAbsis(10);
    B.setOrdinat(20);
    B.printTitik();

    System.out.println("\nJumlah objek Titik = " + Titik.getCounterTitik());

// Bagian 6 – Finalisasi Method
   System.out.println("Bagian 6");

   Titik E = new Titik(3,4);

   System.out.println("Titik A:");
   E.printTitik();

   System.out.println("Kuadran: " + E.getKuadran());
   System.out.println("Jarak ke pusat: " + E.getJarakPusat());

   Titik F = E.getRefleksiX();
   System.out.println("Refleksi terhadap sumbu X :");
   F.printTitik();

   System.out.println("Jumlah objek Titik = " + Titik.getCounterTitik());

    }
}