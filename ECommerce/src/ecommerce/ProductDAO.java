
package ecommerce;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductDAO {
    public void addProduct(Product product) {
        
        String sql = "INSERT INTO Products(productName, color, category, stock, weight, description) "
                   + "VALUES(?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = DatabaseHelper.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
           
            pstmt.setString(1, product.getProductName());    
            pstmt.setString(2, product.getProductColor());   
            pstmt.setString(3, product.getProductCategory());
            pstmt.setInt(4, product.getProductStock());      
            pstmt.setDouble(5, product.getProductWeight()); 
            pstmt.setString(6, product.getProductDescription()); 
            
            pstmt.executeUpdate();
            System.out.println(product.getProductName() + " başarıyla veritabanına eklendi!");
            
        } catch (SQLException e) {
            System.out.println("Ürün kaydedilirken hata oluştu: " + e.getMessage());
        }
    }
}
