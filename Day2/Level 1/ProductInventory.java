class Product {

  // Instance Variables
  private String productName;
  private double price;

  // Class Variable
  private static int totalProducts = 0;

  // Constructor
  Product(String productName, double price) {
    this.productName = productName;
    this.price = price;
    // Increment total products each time a new product is created
    totalProducts++;
  }

  // Instance Method to display product details
  void displayProductDetails() {
    System.out.println("Product Name : " + productName);
    System.out.println("Price        : RS " + price);
  }

  // Class Method to display total number of products
  static void displayTotalProducts() {
    System.out.println("Total Products : " + totalProducts);
  }
}

public class ProductInventory {
  public static void main(String[] args) {

    // Creating product instances
    Product product1 = new Product("Laptop", 50000);
    Product product2 = new Product("Smartphone", 20000);

    // Display details of each product
    System.out.println("Product 1 Details :");
    product1.displayProductDetails();

    System.out.println("\nProduct 2 Details :");
    product2.displayProductDetails();

    // Display total number of products
    System.out.println("\nDisplaying Total Products :");
    Product.displayTotalProducts();
  }
}
