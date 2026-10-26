
package ecommerce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseHelper {
   
   public static Connection connect() {
        Connection conn = null;
        try {
            Class.forName("org.sqlite.JDBC"); 
            String url = "jdbc:sqlite:ecommerce.db";
            conn = DriverManager.getConnection(url);
            
            
            String sqlTable = "CREATE TABLE IF NOT EXISTS users ("
                    + " username TEXT PRIMARY KEY,"
                    + " name TEXT,"
                    + " surname TEXT,"
                    + " dateOfBirth TEXT,"
                    + " password TEXT,"
                    + " email TEXT,"
                    + " homeAddress TEXT,"
                    + " workAddress TEXT"
                    + ");";
            
            try (Statement stmt = conn.createStatement()) {
                stmt.execute("DROP TABLE IF EXISTS users;");
                stmt.execute(sqlTable);
              stmt.execute("DROP TABLE IF EXISTS Products;");
            String sqlProductTable = "CREATE TABLE IF NOT EXISTS Products ("
                    + " id INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + " productName TEXT,"
                    + " color TEXT,"
                    + " category TEXT,"
                    + " stock INTEGER,"
                    + " weight REAL,"
                    + " description TEXT"
                    + ");";
            stmt.execute(sqlProductTable);
            }
            
        } catch (Exception e) {
            System.out.println("Baglanti veya Tablo hatasi: " + e.getMessage());
        }
        return conn;
    }
}
