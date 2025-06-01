/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class koneksi {
    public static Connection koneksi;

    public static Connection getConnection() {
        try {
            if (koneksi == null) {
                Class.forName("com.mysql.jdbc.Driver");
                koneksi = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/masjid",
                    "root",
                    ""
                );
                System.out.println("Koneksi Berhasil!");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Koneksi Gagal: " + e.getMessage());
        }
        return koneksi;
    }

    public static Object GetConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
