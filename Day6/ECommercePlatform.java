// Taxable interface with methods to calculate tax and get tax details
interface Taxable {
  public double calculateTax(); // Method to calculate tax

  public String getTaxDetails(); // Method to get details about the tax
}

// Abstract class Product with fields and methods for common product features
abstract class Product {
  private String productId;
  private String name;
  private double price;

  // Constructor to initialize product details
  Product(String productId, String name, double price) {
    this.productId = productId;
    this.name = name;
    this.price = price;
  }

  // Getter and setter methods to encapsulate the fields
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  // Abstract method to calculate discount for the product
  abstract public double calculateDiscount();

  // Method to calculate and return the final price after applying tax and
  // discount
  public double calculateFinalPrice(Taxable taxProduct) {
    double discount = calculateDiscount();
    double tax = taxProduct.calculateTax();
    return price + tax - discount; // Final price = price + tax - discount
  }
}

// Electronics class extending Product and implementing Taxable interface
class Electronics extends Product implements Taxable {
  private double discountPercentage; // Discount for electronics

  Electronics(String productId, String name, double price, double discountPercentage) {
    super(productId, name, price);
    this.discountPercentage = discountPercentage;
  }

  // Implementation of the abstract method to calculate discount for electronics
  @Override
  public double calculateDiscount() {
    return (getPrice() * discountPercentage) / 100;
  }

  // Implementation of calculateTax() from Taxable interface
  @Override
  public double calculateTax() {
    return getPrice() * 0.18; // 18% tax on electronics
  }

  // Implementation of getTaxDetails() from Taxable interface
  @Override
  public String getTaxDetails() {
    return "Tax Rate: 18% (Electronics)";
  }
}

// Clothing class extending Product and implementing Taxable interface
class Clothing extends Product implements Taxable {
  private double discountPercentage; // Discount for clothing

  Clothing(String productId, String name, double price, double discountPercentage) {
    super(productId, name, price);
    this.discountPercentage = discountPercentage;
  }

  // Implementation of the abstract method to calculate discount for clothing
  @Override
  public double calculateDiscount() {
    return (getPrice() * discountPercentage) / 100;
  }

  // Implementation of calculateTax() from Taxable interface
  @Override
  public double calculateTax() {
    return getPrice() * 0.12; // 12% tax on clothing
  }

  // Implementation of getTaxDetails() from Taxable interface
  @Override
  public String getTaxDetails() {
    return "Tax Rate: 12% (Clothing)";
  }
}

// Groceries class extending Product and implementing Taxable interface
class Groceries extends Product implements Taxable {
  private double discountPercentage; // Discount for groceries

  Groceries(String productId, String name, double price, double discountPercentage) {
    super(productId, name, price);
    this.discountPercentage = discountPercentage;
  }

  // Implementation of the abstract method to calculate discount for groceries
  @Override
  public double calculateDiscount() {
    return (getPrice() * discountPercentage) / 100;
  }

  // Implementation of calculateTax() from Taxable interface
  @Override
  public double calculateTax() {
    return getPrice() * 0.05; // 5% tax on groceries
  }

  // Implementation of getTaxDetails() from Taxable interface
  @Override
  public String getTaxDetails() {
    return "Tax Rate: 5% (Groceries)";
  }
}

// Main class to test the E-Commerce platform
public class ECommercePlatform {
  public static void main(String[] args) {
    // Create a list of Product objects
    Product[] products = {
        new Electronics("P101", "Laptop", 50000, 10), // Product ID, Name, Price, Discount
        new Clothing("P102", "T-shirt", 1000, 20),
        new Groceries("P103", "Rice", 200, 5)
    };

    // Loop through the products and display final price details
    for (Product product : products) {
      // Print product details
      System.out.println("\nProduct Name: " + product.getName());
      System.out.println("Product ID: " + product.getProductId());
      System.out.println("Original Price: " + product.getPrice());

      // Display tax details
      if (product instanceof Taxable) {
        Taxable taxableProduct = (Taxable) product;
        System.out.println(taxableProduct.getTaxDetails());

        // Calculate and print final price
        double finalPrice = product.calculateFinalPrice(taxableProduct);
        System.out.println("Final Price (after tax and discount): " + finalPrice);
      }
    }
  }
}
