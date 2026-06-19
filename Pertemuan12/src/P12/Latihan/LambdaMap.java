package P12;

import java.util.HashMap;
import java.util.Map;

/* Nama File : LambdaMap.java
 * Deskripsi : Implementasi lambda pada Map untuk menampilkan key (NIM) dan value (Nama Mahasiswa)
 * Pembuat   : Aprillia Abel Cleodora
*/

public class LambdaMap{
    public static void main(String[] args){
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060124120136", "arini");
        mahasiswaMap.put("24060124130041", "eve");
        mahasiswaMap.put("24060124120014", "lila");
        mahasiswaMap.put("24060124140176", "abel");

        mahasiswaMap.forEach((nim, nama) -> 
            System.out.println("NIM: " + nim + ", Nama: " + nama)
        );
    }
}