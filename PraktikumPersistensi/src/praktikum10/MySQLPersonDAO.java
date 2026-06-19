package praktikum10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * File       : MySQLPersonDAO.java
 * Deskripsi  : Implementasi DAO untuk MySQL
 * Nama       : Aprillia Abel Cleodora
 * NIM        : 24060124140176
 * Lab        : C1
 */

public class MySQLPersonDAO implements PersonDAO {

    @Override
    public void savePerson(Person p) throws Exception {

        String url = "jdbc:mysql://localhost:3306/pbo";
        String user = "root";
        String password = "semester4bisayes";
        
        Connection conn =
                DriverManager.getConnection(url, user, password);

        String sql =
                "INSERT INTO person(name) VALUES(?)";

        PreparedStatement ps =
                conn.prepareStatement(sql);

        ps.setString(1, p.getName());

        ps.executeUpdate();

        conn.close();

        System.out.println("Data berhasil disimpan");
    }
}