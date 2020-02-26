
package shoppingcart02;

public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";
        //String message = custName+" wants to purchase a "+itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity.   
        double price = 25;
        double tax = 0.78;
        int quantity = 2;
        
        // Declare and assign a calculated totalPrice
        int totalPrice = 0;
        
        
        // Modify message to include quantity 
           String message = custName+" wants to purchase " + quantity + " " + itemDesc;
           String message2 = "Total cost with tax is: " + "$" + (price + tax) ;

        
        System.out.println(message);
        System.out.println(message2);
        
        // Print another message with the total cost
        
    }    
}
