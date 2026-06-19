/* Nama      : Aprillia Abel Cleodora
   Nama File : Piaraan.java
   Deskripsi : Koleksi Queue objek Anabul
   Tanggal   : 7 Mei 2026 */

import java.util.LinkedList;
import java.util.Queue;

public class Piaraan {

    private int nbelm;
    private Queue<Anabul> Lanabul;

    // Konstruktor
    public Piaraan() {
        Lanabul = new LinkedList<>();
        nbelm = 0;
    }

    // Getter jumlah elemen
    public int getNbelm() {
        return nbelm;
    }

    // Menambah anabul
    public void enqueueAnabul(Anabul anabul) {
        Lanabul.add(anabul);
        nbelm++;
    }

    // Mengecek member
    public boolean isMember(Anabul anabul) {
        return Lanabul.contains(anabul);
    }

    // Mengambil anabul pertama
    public Anabul getAnabul() {
        return Lanabul.peek();
    }

    // Menghapus anabul pertama
    public Anabul dequeueAnabul() {

        Anabul temp = Lanabul.poll();

        if (temp != null) {
            nbelm--;
        }

        return temp;
    }

    // Menampilkan semua anabul
    public void showAnabul() {

        for (Anabul a : Lanabul) {
            System.out.println(a.getNama());
        }
    }

    // Menghitung jumlah kucing
    public int countKucing() {

        int count = 0;

        for (Anabul a : Lanabul) {

            if (a instanceof Kucing) {
                count++;
            }
        }

        return count;
    }

    // Menghitung total bobot kucing
    public float bobotKucing() {

        float total = 0;

        for (Anabul a : Lanabul) {

            if (a instanceof Kucing) {
                total += a.getBerat();
            }
        }

        return total;
    }

    // Menampilkan nama dan jenis
    public void showJenisAnabul() {

        for (Anabul a : Lanabul) {

            System.out.println(
                a.getNama() + " - " +
                a.getClass().getSimpleName()
            );
        }
    }
}