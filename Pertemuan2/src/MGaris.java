/*Nama File : MGaris.java
* Deskripsi : Berisi atribut dan method dalam class Garis
* Pembuat   : Aprillia Abel Cleodora
* Tanggal   : 26 Februari 2026 () 
*/

public class MGaris {
    public static void main(String[] args) {

        // Bagian 1 – Membuat Objek Garis
        System.out.println("Bagian 1:");

        Titik A = new Titik(-2, 0);
        Titik B = new Titik(0, 4);

        Garis G1 = new Garis(A, B);

        G1.printGaris();
        System.out.println("Panjang: " + G1.getPanjang());
        System.out.println("Gradien: " + G1.getGradien());

        Titik tengah = G1.getTitikTengah();
        System.out.print("Titik Tengah: ");
        tengah.printTitik();

        System.out.println("Persamaan: " + G1.getPersamaanGaris());


        // Bagian 2 – Konstruktor Default
        System.out.println("Bagian 2:");

        Garis G2 = new Garis();

        G2.printGaris();
        System.out.println("Panjang: " + G2.getPanjang());
        System.out.println("Gradien: " + G2.getGradien());


        // Bagian 3 – Static Attribute
        System.out.println("Bagian 3:");

        System.out.println("Jumlah objek Garis: " 
                            + Garis.getCounterGaris());

        // Bagian 4 – Getter dan Setter
        System.out.println("Bagian 4:");

        Garis G3 = new Garis();
        G3.setTitikAwal(new Titik(1, 2));
        G3.setTitikAkhir(new Titik(3, 6));

        G3.printGaris();
        System.out.println("Persamaan: " + G3.getPersamaanGaris());

        // Bagian 5 – Cek Sejajar
        System.out.println("Bagian 5:");

        Titik C = new Titik(1, 1);
        Titik D = new Titik(3, 5); 

        Garis G4 = new Garis(C, D);

        System.out.println("Apakah G1 sejajar G4? " 
                            + G1.isSejajar(G4));


        // Bagian 6 – Cek Tegak Lurus
        System.out.println("Bagian 6:");

        Titik E = new Titik(0, 0);
        Titik F = new Titik(2, -1); 

        Garis G5 = new Garis(E, F);

        System.out.println("Apakah G1 tegak lurus G5? " 
                            + G1.isTegakLurus(G5));


        // Bagian 7 – Menampilkan Jumlah Akhir Objek
        System.out.println("Bagian 7:");

        System.out.println("Total objek Garis yang dibuat: " 
                            + Garis.getCounterGaris());
    }
}