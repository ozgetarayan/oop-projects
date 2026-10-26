
package ecommerce;


public class ECommerce {

    
    public static void main(String[] args) {
        System.err.close();
        
        DatabaseHelper.connect();
                
        
        CreditCard visa = new CreditCard("123456", "u1", 123, "10.29" );
        Product dress = new Product("dress", "pink", "cloth", 10, 0.5, "mini");
        Product trousers = new Product("trousers", "blue", "cloth", 0, 0.7, "jean");
        
       User u1 = new User("ozge123", "Ozge", "Tarayan", "27.01.2006", "sifre123", "ozge@email.com","Antalya" , "Manisa" );
       u1.setCreditCard(visa);
       u1.addFavorite(trousers);
       
       UserDAO userDao = new UserDAO();
          userDao.addUser(u1);
          
          ProductDAO productDao = new ProductDAO();
          productDao.addProduct(dress);
          
       
       Order siparis = new Order(u1, dress, visa);
       siparis.processOrder();
        System.out.println("dress stock: "+ dress.getProductStock());
        
        Order siparis2 = new Order(u1, trousers, visa);
        siparis2.processOrder();
    }
    
}
