package shoppingcart02;

public class ShoppingCart02 {

    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";
        String message = custName + " wants to purchase a " + itemDesc;

        // Declare and initialize numeric fields: price, tax, quantity.   
        double price = 1000;
        double tax = 0.1;
        int quantity = 5;

        // Declare and assign a calculated totalPrice
        double totalPrice = price * quantity + (tax * quantity * price);
        // Modify message to include quantity 
        message = custName + "wants to purchase "  + quantity + " " + itemDesc + "\n" + "Total cost is : " + totalPrice;
        System.out.println(message);

        // Print another message with the total cost
    }
}
