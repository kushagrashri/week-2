class CarRental {

  // Attributes
  private String customerName;
  private String carModel;
  private int rentalDays;
  private static final double DAILY_RATE = 50.0; // Fixed daily rental rate

  // Default constructor
  CarRental() {
    this.customerName = "Unknown Customer";
    this.carModel = "Unknown Model";
    this.rentalDays = 0;
  }

  // Parameterized constructor
  CarRental(String customerName, String carModel, int rentalDays) {
    this.customerName = customerName;
    this.carModel = carModel;
    this.rentalDays = rentalDays;
  }

  // Method to calculate total cost
  double calculateTotalCost() {
    return rentalDays * DAILY_RATE;
  }

  // Method to display rental details
  void displayRentalDetails() {
    System.out.println("Customer Name : " + customerName);
    System.out.println("Car Model     : " + carModel);
    System.out.println("Rental Days   : " + rentalDays);
    System.out.println("Daily Rate    : RS " + DAILY_RATE);
    System.out.println("Total Cost    : RS " + calculateTotalCost());
  }
}

public class CarRentalSystem {
  public static void main(String[] args) {

    // Default constructor
    System.out.println("\nDefault Constructor:");
    CarRental defaultRental = new CarRental();
    defaultRental.displayRentalDetails();

    // Parameterized constructor
    System.out.println("\nParameterized Constructor:");
    CarRental rental1 = new CarRental("Sachin", "Toyota Fortuner", 7);
    rental1.displayRentalDetails();
  }
}
