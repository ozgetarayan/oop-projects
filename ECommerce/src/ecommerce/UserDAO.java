
package ecommerce;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class UserDAO {
    
    public void addUser(User user) {
        
        // 8 sütun için 8 tane soru işareti koyduk knk
        String sql = "INSERT INTO users(username, name, surname, dateOfBirth, password, email, homeAddress, workAddress) "
                   + "VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = DatabaseHelper.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            // Sırasıyla bütün bilgileri dolduruyoruz
            pstmt.setString(1, user.getUserName());
            pstmt.setString(2, user.getName());
            pstmt.setString(3, user.getSurname());
            pstmt.setString(4, user.getDateOfBirth()); // User sınıfındaki metot adlarına göre gerekirse düzeltirsin knk
            pstmt.setString(5, user.getPassword());
            pstmt.setString(6, user.getEmailAddress());
            pstmt.setString(7, user.getHomeAddress());
            pstmt.setString(8, user.getWorkAddress());
            
            pstmt.executeUpdate();
            System.out.println(user.getUserName() + " tüm bilgileriyle veritabanina basariyla kaydedildi!");
            
        } catch (SQLException e) {
            System.out.println("Veri kaydedilirken hata olustu: " + e.getMessage());
        }
    }
    
}
