
package ecommerce;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductDAO {
    public void addProduct(Product product) {
        // DB Browser'daki sütun isimleriyle birebir aynı (6 tane soru işareti var)
        String sql = "INSERT INTO Products(productName, color, category, stock, weight, description) "
                   + "VALUES(?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = DatabaseHelper.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
           
            pstmt.setString(1, product.getProductName());    // 1. soru işareti -> productName
            pstmt.setString(2, product.getProductColor());   // 2. soru işareti -> color
            pstmt.setString(3, product.getProductCategory());// 3. soru işareti -> category
            pstmt.setInt(4, product.getProductStock());      // 4. soru işareti -> stock
            pstmt.setDouble(5, product.getProductWeight());  // 5. soru işareti -> weight
            pstmt.setString(6, product.getProductDescription()); // 6. soru işareti -> description
            
            
            pstmt.executeUpdate();
            System.out.println(product.getProductName() + " başarıyla veritabanına eklendi!");
            
        } catch (SQLException e) {
            System.out.println("Ürün kaydedilirken hata oluştu: " + e.getMessage());
        }
    }
}
