package pertemuan10.koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/db_cullinarygo";
    private static final String DB_USER = "root";
    private static final String DB_PASS = ""; //

    public static Connection koneksi() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // 
            return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        } catch (ClassNotFoundException e) {
            throw new SQLException("JDBC Driver tidak ditemukan: " + e.getMessage());
        }
    }
}