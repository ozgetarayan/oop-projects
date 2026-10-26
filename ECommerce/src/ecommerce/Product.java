
package ecommerce;


public class Product {
    private String productName;
    private String productColor;
    private String productCategory;
    private int productStock;
    private double productWeight;
    private String productDescription;


public Product(String productName, String productColor, String productCategory, int productStock, double productWeight, String productDescription){
   
 this.productName = productName;
 this.productColor  = productColor;
 this.productCategory = productCategory;
 this.productStock = productStock;
 this.productWeight = productWeight;
 this.productDescription = productDescription;
   
}

 public String getProductName(){
    return productName;
}
 
 
 public String getProductColor(){
     return productColor;
 }
 
 
 public String getProductCategory(){
     return productCategory;
 }
 
 public int getProductStock(){
     return productStock;
 }
 
 public double getProductWeight(){
     return productWeight;
 }
 
 public String getProductDescription(){
     return productDescription;
 }
 
 public void setProductName(String productName){
     this.productName = productName;
 }
 
 
public void setProductColor(String productColor){
     this.productColor = productColor;
 }

public void setProductCategory(String productCategory){
     this.productCategory = productCategory;
 }

public void setProductStock(int producStock){
     this.productStock = productStock;
 }

public void setProductWeight(double productWeight){
     this.productWeight = productWeight;
 }

public void setProductDescription(String productDescription){
     this.productDescription = productDescription;
 }

public boolean reduceStock(int amount){
    if(this.productStock>= amount){
        this.productStock -= amount;
        return true;
    }
    else{
        return false;
    }
}


}
