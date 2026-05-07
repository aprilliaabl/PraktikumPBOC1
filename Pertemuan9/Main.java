/* Nama      : Aprillia Abel Cleodora
   Nama File : Main.java
   Deskripsi : Aplikasi koleksi objek Anabul
   Tanggal   : 7 Mei 2026 */

public class Main {

    public static void main(String[] args) {

        // KOLEKSI TEMAN
        Teman t = new Teman();

        t.addNama("Rachel");
        t.addNama("Farel");
        t.addNama("Nolan");

        System.out.println("Daftar Teman:");
        t.showTeman();

        System.out.println("\nJumlah elemen : " + t.getNbelm());

        System.out.println("Jumlah nama Rachel : "
                + t.countNama("Rachel"));

        t.gantiNama("Farel", "Fazel");

        System.out.println("\nSetelah ganti nama:");
        t.showTeman();

        // KOLEKSI PIARAAN
        Piaraan p = new Piaraan();

        Kucing k1 = new Kucing("Oreo", 4.5f);
        Kucing k2 = new Kucing("Mylo", 3.0f);
        Anjing a1 = new Anjing("Nailong", 7.2f);
        Burung b1 = new Burung("Somat", 1.1f);

        p.enqueueAnabul(k1);
        p.enqueueAnabul(k2);
        p.enqueueAnabul(a1);
        p.enqueueAnabul(b1);

        System.out.println("\nDaftar Anabul:");
        p.showAnabul();

        System.out.println("\nJumlah elemen : "
                + p.getNbelm());

        System.out.println("Jumlah kucing : "
                + p.countKucing());

        System.out.println("Total bobot kucing : "
                + p.bobotKucing());

        System.out.println("\nNama dan jenis Anabul:");
        p.showJenisAnabul();

        System.out.println("\nAnabul pertama:");
        System.out.println(p.getAnabul().getNama());

        System.out.println("\nDequeue:");
        System.out.println(
                p.dequeueAnabul().getNama());

        System.out.println("\nIsi antrean sekarang:");
        p.showAnabul();
    }
}