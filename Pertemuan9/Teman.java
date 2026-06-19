/* Nama      : Aprillia Abel Cleodora
   Nama File : Teman.java
   Deskripsi : Program koleksi nama teman menggunakan ArrayList
   Tanggal   : 7 Mei 2026 */

import java.util.ArrayList;

public class Teman {

    private int nbelm;
    private ArrayList<String> Lnama;

    // Konstruktor
    public Teman() {
        Lnama = new ArrayList<>();
        nbelm = 0;
    }

    // Getter jumlah elemen
    public int getNbelm() {
        return nbelm;
    }

    // Getter nama berdasarkan indeks
    public String getNama(int indeks) {
        return Lnama.get(indeks);
    }

    // Setter nama
    public void setNama(int indeks, String nama) {
        Lnama.set(indeks, nama);
    }

    // Menambah nama
    public void addNama(String nama) {
        Lnama.add(nama);
        nbelm++;
    }

    // Menghapus nama
    public void delNama(String nama) {
        if (Lnama.remove(nama)) {
            nbelm--;
        }
    }

    // Mengecek member
    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    // Mengganti nama
    public void gantiNama(String nama, String namaBaru) {
        int index = Lnama.indexOf(nama);

        if (index != -1) {
            Lnama.set(index, namaBaru);
        }
    }

    // Menghitung jumlah nama
    public int countNama(String nama) {
        int count = 0;

        for (String n : Lnama) {
            if (n.equals(nama)) {
                count++;
            }
        }

        return count;
    }

    // Menampilkan semua nama
    public void showTeman() {
        for (String nama : Lnama) {
            System.out.println(nama);
        }
    }
}