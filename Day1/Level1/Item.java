public class Item {
    // Attributes
    int itemCode;
    String itemName;
    double price;

    // Constructor to initialize the attributes
    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    public void displayItemDetails() {
        System.out.println("Item Details:");
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: ₹" + price);
    }

    // Method to calculate the total cost for a given quantity
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    // Main method to test the Item class
    public static void main(String[] args) {
        // Create an Item object
        Item item = new Item(101, "Laptop", 55000.0);

        // Display the item details
        item.displayItemDetails();

        // Calculate and display the total cost for a given quantity
        int quantity = 3; // Example quantity
        double totalCost = item.calculateTotalCost(quantity);
        System.out.println("Total Cost for " + quantity + " " + item.itemName + "(s): ₹" + totalCost);
    }
}
