package praktikum10;

/**
 * File       : MainDAO.java
 * Deskripsi  : Main program untuk menjalankan DAO
 * Nama       : Aprillia Abel Cleodora
 * NIM        : 24060124140176
 * Lab        : C1
 */

public class MainDAO {

    public static void main(String[] args) {

        try {

            Person p = new Person();

            p.setName("Aprillia");

            DAOManager.getPersonDAO().savePerson(p);

        } catch (Exception e) {

            System.out.println(e);

        }
    }
}