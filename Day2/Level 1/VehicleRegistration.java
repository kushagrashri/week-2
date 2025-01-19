class Vehicle {

  // Instance Variables
  private String ownerName;
  private String vehicleType;

  // Class Variable
  // Default registration fee
  private static double registrationFee = 500.0; 

  // Constructor
  Vehicle(String ownerName, String vehicleType) {
    this.ownerName = ownerName;
    this.vehicleType = vehicleType;
  }

  // Instance Method to display vehicle details
  void displayVehicleDetails() {
    System.out.println("Owner Name       : " + ownerName);
    System.out.println("Vehicle Type     : " + vehicleType);
    System.out.println("Registration Fee : RS " + registrationFee);
  }

  // Class Method to update registration fee
  static void updateRegistrationFee(double newFee) {
    registrationFee = newFee;
    System.out.println("Registration fee updated to: RS " + registrationFee);
  }
}

public class VehicleRegistration {
  public static void main(String[] args) {

    // Creating vehicle instances
    Vehicle vehicle1 = new Vehicle("Sachin", "Car");
    Vehicle vehicle2 = new Vehicle("Duggu", "Motorcycle");

    // Display details of each vehicle
    System.out.println("Vehicle 1 Details:");
    vehicle1.displayVehicleDetails();

    System.out.println("\nVehicle 2 Details:");
    vehicle2.displayVehicleDetails();

    // Update the registration fee
    System.out.println("\nUpdating Registration Fee...");
    Vehicle.updateRegistrationFee(600.0);

    // Display details again after updating the registration fee
    System.out.println("\nVehicle 1 Details (After Update):");
    vehicle1.displayVehicleDetails();

    System.out.println("\nVehicle 2 Details (After Update):");
    vehicle2.displayVehicleDetails();
  }
}
