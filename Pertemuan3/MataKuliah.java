/*Nama File : MataKuliah.java
* Deskripsi : Berisi atribut dan method dalam class MataKuliah yang merepresentasikan 
              data mata kuliah yang dapat diambil oleh mahasiswa
* Pembuat   : Aprillia Abel Cleodora
* Tanggal   : 5 Maret 2026
*/

public class MataKuliah {
    private String idMatKul;
    private String nama;
    private int sks;

    public MataKuliah() {
    }

    public MataKuliah(String idMatKul, String nama, int sks) {
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    public String getIdMatKul() {
        return idMatKul;
    }

    public void setIdMatKul(String idMatKul) {
        this.idMatKul = idMatKul;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }
}