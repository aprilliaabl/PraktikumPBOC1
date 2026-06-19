package P12;
import java.util.ArrayList;

/* Nama File : LambdaList.java
 * Deskripsi : Implementasi lambda pada List, digunakan sebagai parameter pada method.
 * Pembuat   : Aprillia Abel Cleodora
*/
public class LambdaList{
    public static void main(String[] args){
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("arini");
        mahasiswaList.add("eve");
        mahasiswaList.add("lila");
        mahasiswaList.add("abel");

        //lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}