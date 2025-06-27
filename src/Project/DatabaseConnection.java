/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Project;

/**
 *
 * @author raden
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
 private static Connection conn;

    public static Connection getConnection() throws SQLException {
        if (conn == null || conn.isClosed()) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/db_araf_caffe", // nama db barumu
                    "root", "" // username & password MySQL
                );
            } catch (ClassNotFoundException e) {
                throw new SQLException("Driver JDBC tidak ditemukan.");
            }
        }
        return conn;
    }
}
