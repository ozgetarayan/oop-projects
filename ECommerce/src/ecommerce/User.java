
package ecommerce;
import java.util.ArrayList;

public class User {
    private String userName;
    private String name;
    private String surname;
    private String dateOfBirth;
    private String password;
    private String emailAddress;
    private String homeAddress;
    private String workAddress;
    private CreditCard creditCard;
    private ArrayList<Product> orderedProducts;
    private ArrayList<Product> favoriteProducts;
    
    
    public User(String userName, String name, String surname, String dateOfBirth, String password, String emailAddress, String homeAddress, String workAddress){
        this.userName = userName;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.password = password;
        this.emailAddress = emailAddress;
        this.homeAddress = homeAddress;
        this.workAddress = workAddress;
        this.creditCard = creditCard;
        this.orderedProducts = new ArrayList<>();
        this.favoriteProducts = new ArrayList<>();
    }
    
    public String getUserName(){
        return userName;
    }
    
     public String getName(){
        return name;
    }
     
      public String getSurname(){
        return surname;
    }
      
       public String getDateOfBirth(){
        return dateOfBirth;
    }
       
       public String getPassword(){
        return password;
    } 
       
        public String getEmailAddress(){
        return emailAddress;
    }
        
         public String getHomeAddress(){
        return homeAddress;
    }
         
         public String getWorkAddress(){
        return workAddress;
    }
         
         public CreditCard getCreditCard(){
        return creditCard;
    }

    public ArrayList<Product> getOrderedProducts() {
        return orderedProducts;
    }

    public ArrayList<Product> getFavoriteProducts() {
        return favoriteProducts;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public void setOrderedProducts(ArrayList<Product> orderedProducts) {
        this.orderedProducts = orderedProducts;
    }

    public void setFavoriteProducts(ArrayList<Product> favoriteProducts) {
        this.favoriteProducts = favoriteProducts;
    }
         
        
    public void addOrder(Product product){
        this.orderedProducts.add(product);
        System.out.println(userName + " user ordered " + product.getProductName());
    }
    
    public void addFavorite(Product product){
        this.favoriteProducts.add(product);
        System.out.println(userName+" user added "+ product.getProductName()+" to favorites");
    }
           
}
