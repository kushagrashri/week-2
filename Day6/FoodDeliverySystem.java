// Discountable interface with methods to apply and get discount details
interface Discountable {
  void applyDiscount(); // Method to apply discount to a food item

  String getDiscountDetails(); // Method to get discount details
}

// Abstract class FoodItem with common fields and methods for food items
abstract class FoodItem implements Discountable {
  private String itemName;
  private double price;
  private int quantity;

  // Constructor to initialize the common fields for food items
  FoodItem(String itemName, double price, int quantity) {
    this.itemName = itemName;
    this.price = price;
    this.quantity = quantity;
  }

  // Getter and setter methods for encapsulating fields
  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  // Concrete method to get the details of a food item
  public void getItemDetails() {
    System.out.println("Item: " + itemName);
    System.out.println("Price per unit: $" + price);
    System.out.println("Quantity: " + quantity);
  }

  // Abstract method to calculate total price (to be implemented by subclasses)
  abstract public double calculateTotalPrice();

  // Concrete method to apply a discount (for the sake of this example, we'll just
  // display a message)
  @Override
  public void applyDiscount() {
    System.out.println("Applying discount on " + itemName);
  }

  // Concrete method to get discount details
  @Override
  public String getDiscountDetails() {
    return "Discount details for " + itemName;
  }
}

// VegItem subclass that extends FoodItem and calculates total price including a
// discount
class VegItem extends FoodItem {

  VegItem(String itemName, double price, int quantity) {
    super(itemName, price, quantity);
  }

  @Override
  public double calculateTotalPrice() {
    // Veg items don't have extra charges, just multiply price by quantity
    double total = getPrice() * getQuantity();
    System.out.println("Total price for Veg Item (" + getItemName() + "): $" + total);
    return total;
  }
}

// NonVegItem subclass that extends FoodItem and calculates total price with an
// additional charge
class NonVegItem extends FoodItem {
  private double additionalCharge = 2.0; // Additional charge for non-veg items

  NonVegItem(String itemName, double price, int quantity) {
    super(itemName, price, quantity);
  }

  @Override
  public double calculateTotalPrice() {
    // Non-veg items have an additional charge
    double total = (getPrice() + additionalCharge) * getQuantity();
    System.out.println("Total price for Non-Veg Item (" + getItemName() + "): $" + total);
    return total;
  }

  @Override
  public void applyDiscount() {
    // Apply a different discount logic for non-veg items (e.g., 5% discount)
    System.out.println("Applying 5% discount on " + getItemName());
  }

  @Override
  public String getDiscountDetails() {
    return "5% discount applied on " + getItemName();
  }
}

// Main class to demonstrate the Online Food Delivery System
public class FoodDeliverySystem {
  public static void main(String[] args) {
    // Create food items of different types (VegItem and NonVegItem)
    FoodItem vegItem = new VegItem("Paneer Butter Masala", 10.0, 2);
    FoodItem nonVegItem = new NonVegItem("Chicken Biryani", 12.0, 1);

    // Get details and total price for Veg item
    vegItem.getItemDetails();
    vegItem.calculateTotalPrice();
    vegItem.applyDiscount();
    System.out.println(vegItem.getDiscountDetails() + "\n");

    // Get details and total price for Non-Veg item
    nonVegItem.getItemDetails();
    nonVegItem.calculateTotalPrice();
    nonVegItem.applyDiscount();
    System.out.println(nonVegItem.getDiscountDetails() + "\n");

    // Calculate total cost for the entire order (combining Veg and Non-Veg items)
    double totalCost = vegItem.calculateTotalPrice() + nonVegItem.calculateTotalPrice();
    System.out.println("Total cost of order: $" + totalCost);
  }
}
