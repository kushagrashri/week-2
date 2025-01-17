import java.util.ArrayList;

public class CartItem {
    // Attributes
    String itemName;
    double price;
    int quantity;

    // Constructor to initialize CartItem
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate the cost of the current item
    public double calculateItemCost() {
        return price * quantity;
    }

    // Main class to manage the cart
    public static void main(String[] args) {
        // Cart to hold CartItem objects
        ArrayList<CartItem> cart = new ArrayList<>();

        // Add an item to the cart
        addItemToCart(cart, "Apple", 10.0, 5);
        addItemToCart(cart, "Banana", 2.0, 12);

        // Display the cart contents and total cost
        displayCart(cart);

        // Remove an item from the cart
        removeItemFromCart(cart, "Apple");

        // Display the cart contents and total cost again
        displayCart(cart);
    }

    // Method to add an item to the cart
    public static void addItemToCart(ArrayList<CartItem> cart, String itemName, double price, int quantity) {
        for (CartItem item : cart) {
            if (item.itemName.equalsIgnoreCase(itemName)) {
                item.quantity += quantity;
                System.out.println(quantity + " more " + itemName + "(s) added to the cart.");
                return;
            }
        }
        cart.add(new CartItem(itemName, price, quantity));
        System.out.println("Added " + itemName + " to the cart.");
    }

    // Method to remove an item from the cart
    public static void removeItemFromCart(ArrayList<CartItem> cart, String itemName) {
        for (CartItem item : cart) {
            if (item.itemName.equalsIgnoreCase(itemName)) {
                cart.remove(item);
                System.out.println("Removed " + itemName + " from the cart.");
                return;
            }
        }
        System.out.println(itemName + " not found in the cart.");
    }

    // Method to display the cart contents and the total cost
    public static void displayCart(ArrayList<CartItem> cart) {
        if (cart.isEmpty()) {
            System.out.println("The cart is empty.");
            return;
        }

        System.out.println("Cart Contents:");
        double totalCost = 0.0;

        for (CartItem item : cart) {
            double itemCost = item.calculateItemCost();
            System.out.println(item.quantity + " x " + item.itemName + " @ ₹" + item.price + " each = ₹" + itemCost);
            totalCost += itemCost;
        }

        System.out.println("Total Cost: ₹" + totalCost);
    }
}
