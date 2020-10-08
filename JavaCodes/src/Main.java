import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
Total sale price for moisturizer is 220
Total sale price for concealer is 135
Total sale price for Lotion is 110
*/
class Main {
	
	public static void main (String[] args) {
    
    //ystem.out.println("Hello Java");
    Product prod1 = new Product("moisturizer",20, 2);
    Product prod2 = new Product("concealer",13.50, 3);
    Product prod3 = new Product("moisturizer",20, 3);
    Product prod4 = new Product("concealer",13.50, 7);
    Product prod5 = new Product("moisturizer",20, 6);
    Product prod6 = new Product("Lotion",22, 5);
    List<Product> myList = new ArrayList<Product>();
    myList.add(prod1);
    myList.add(prod2);
    myList.add(prod3);
    myList.add(prod4);
    myList.add(prod5);
    myList.add(prod6);
    
       ListIterator<Product> itr =  myList.listIterator();
        System.out.println("");
        
        while(itr.hasNext())
        {
            System.out.println(itr.next());
            
            Product value = itr.next();
          if  (value.getName().equalsIgnoreCase("moisturizer"))
          {
        	//  System.out.println("");
          }
            
        }
        
        
        
        
        //Write your code here 
  
	}
}


class Product {
  private String name;
  private int quantity;
  private double price;
  
  public Product(String name, double price, int quantity) {
    this.name=name;
    this.price=price;
    this.quantity=quantity;
  }
  
  public String getName() {
		return name;
	}
  
  public double getPrice() {
		return price;
	}
  
  public int getInt() {
		return quantity;
                 
	}
    
    //Write to string to get value in string
     public String toString()
      {
          return name +" "+  quantity +"" +price; 
      }
  
}