package com.nikhil.patterns.strategy;

/**
 * Strategy pattern
 *
 */
public class StrategyMain 
{
    public static void main( String[] args )
    {
    	// Create few cart items
    	CartItem laptop = new CartItem("laptop-1", 10000.00D);
    	CartItem mouse = new CartItem("mouse-1", 500.0D);
    	
    	// Create shopping cart and add previous items to the cart
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addCartItem(laptop);
        shoppingCart.addCartItem(mouse);
        
        shoppingCart.calculateAmount();
        System.out.println("Total cart amount: " + shoppingCart.getAmount());
        
        // Make payment using the UPI mode
        UPIPayment upiPayment = new UPIPayment("upi@ybl");
        shoppingCart.makePayment(upiPayment);
        
        // Make payment using the card mode
        CardPayment cardPayment = new CardPayment("1234", "Firstname LastName", "123", "today");
        shoppingCart.makePayment(cardPayment);
    }
}
