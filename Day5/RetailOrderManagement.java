// Base class representing a general Order
class Order {
  int orderId; // Order ID
  String orderDate; // Order date in String format

  // Constructor to initialize orderId and orderDate
  Order(int orderId, String orderDate) {
    this.orderId = orderId;
    this.orderDate = orderDate;
  }

  // Method to print the initial order status
  public void getOrderStatus() {
    System.out.println("\nOrder placed. Waiting to be shipped.");
  }
}

// Subclass representing a ShippedOrder, extending Order
class ShippedOrder extends Order {
  String trackingNumber; // Tracking number for the shipment

  // Constructor to initialize orderId, orderDate, and trackingNumber
  ShippedOrder(int orderId, String orderDate, String trackingNumber) {
    super(orderId, orderDate); // Call the constructor of the superclass (Order)
    this.trackingNumber = trackingNumber;
  }

  // Overriding getOrderStatus to return the shipped order status with tracking
  // number
  @Override
  public void getOrderStatus() {
    System.out.println("\nOrder has been shipped with tracking number: " + trackingNumber);
  }
}

// Subclass representing a DeliveredOrder, extending ShippedOrder
class DeliveredOrder extends ShippedOrder {
  String deliveryDate; // Delivery date of the order

  // Constructor to initialize orderId, orderDate, trackingNumber, and
  // deliveryDate
  DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
    super(orderId, orderDate, trackingNumber); // Call the constructor of the superclass (ShippedOrder)
    this.deliveryDate = deliveryDate;
  }

  // Overriding getOrderStatus to return the delivered order status with delivery
  // date
  @Override
  public void getOrderStatus() {
    System.out.println("\nOrder has been delivered on: " + deliveryDate);
  }
}

// Main class to demonstrate Retail Order Management using multilevel
// inheritance
public class RetailOrderManagement {
  public static void main(String[] args) {

    // Creating Order, ShippedOrder, and DeliveredOrder objects with relevant
    // details
    Order order1 = new Order(101, "2025-01-15"); // Initializing Order with orderId 101 and orderDate
    ShippedOrder shippedOrder1 = new ShippedOrder(102, "2025-01-16", "TRACK123"); // Initializing ShippedOrder
    DeliveredOrder deliveredOrder1 = new DeliveredOrder(103, "2025-01-16", "TRACK456", "2025-01-20"); // Initializing
                                                                                                      // DeliveredOrder

    // Calling the getOrderStatus method for each object to display the status of
    // the orders
    order1.getOrderStatus(); // Displays "Order placed. Waiting to be shipped."
    shippedOrder1.getOrderStatus(); // Displays "Order has been shipped with tracking number: TRACK123"
    deliveredOrder1.getOrderStatus(); // Displays "Order has been delivered on: 2025-01-20"
  }
}
