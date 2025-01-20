// Class representing a Product in the shopping cart system
class Product {
    // Static variable to store the discount percentage 
    static double discount = 10.0; // Default discount in percentage

    // Instance variables to store product details
    private String productName;
    private double price;
    private int quantity;

    // Final variable for a unique product ID 
    private final int productID;

    // Static variable to generate unique product IDs
    private static int idCounter = 1;

    // Constructor to initialize a Product object
    Product(String productName, double price, int quantity) {
        this.productName = productName;  // Assign the product name
        this.price = price;              // Assign the product price
        this.quantity = quantity;        // Assign the product quantity
        this.productID = idCounter++;    // Assign a unique product ID and increment the counter
    }

    // Static method to update the discount percentage
    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("\nDiscount updated to: " + discount + "%");
    }

    // Method to calculate the total price after applying the discount
    double calculateTotalPrice() {
        double totalPrice = price * quantity;
        double discountedPrice = totalPrice - (totalPrice * discount / 100);
        return discountedPrice;
    }

    // Method to display the product details
    void displayDetails() {
        System.out.println("\nProduct Details:");
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discounted Total Price: " + calculateTotalPrice());
    }
}

// Main class to simulate the shopping cart system
public class ShoppingCartSystem {
    public static void main(String[] args) {
        // Update the discount percentage (static method)
        Product.updateDiscount(30);

        // Create the first product
        Product product1 = new Product("Laptop", 100000, 1);

        // Check if product1 is an instance of the Product class
        if (product1 instanceof Product) {
            product1.displayDetails(); // Display the details of product1
        } else {
            System.out.println("product1 is not an instance of the Product class.");
        }

        // Create the second product
        Product product2 = new Product("Smartphone", 50000, 2);

        // Check if product2 is an instance of the Product class
        if (product2 instanceof Product) {
            product2.displayDetails(); // Display the details of product2
        } else {
            System.out.println("product2 is not an instance of the Product class.");
        }

        // Update the discount percentage again
        Product.updateDiscount(20);

        // Display details of products after discount update
        System.out.println("\n--- After Updating Discount ---");
        product1.displayDetails();
        product2.displayDetails();
    }
}

