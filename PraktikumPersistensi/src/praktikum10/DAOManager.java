package praktikum10;

/**
 * File       : DAOManager.java
 * Deskripsi  : Manager untuk DAO
 * Nama       : Aprillia Abel Cleodora
 * NIM        : 24060124140176
 * Lab        : C1
 */

public class DAOManager {

    private static PersonDAO personDAO =
            new MySQLPersonDAO();

    public static PersonDAO getPersonDAO() {
        return personDAO;
    }
}