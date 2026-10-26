
package ecommerce;


public class Order {
    
    private User user;
    private Product product;
    private CreditCard creditCard;
    
     public Order(User user, Product product, CreditCard creditCard) {
        this.user = user;
        this.product = product;
        this.creditCard = creditCard;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

   

    public void setUser(User user) {
        this.user = user;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }
    
    public void processOrder(){
        if(this.product.reduceStock(1)){
            this.user.addOrder(this.product);
            System.out.println("Order successful ");
        }
        else{
            System.out.println("Order failed. out of stock for: " + this.product.getProductName());
        }
    }
    
   
    
}
