// GPS interface with methods to get and update the location of a vehicle
interface GPS {
  String getCurrentLocation(); // Method to get the current location of the vehicle

  void updateLocation(String location); // Method to update the current location of the vehicle
}

// Abstract class Vehicle1 with common fields and methods for all vehicles
abstract class Vehicle1 implements GPS {
  private String vehicleId;
  private String driverName;
  private double ratePerKm;

  // Constructor to initialize common vehicle details
  Vehicle1(String vehicleId, String driverName, double ratePerKm) {
    this.vehicleId = vehicleId;
    this.driverName = driverName;
    this.ratePerKm = ratePerKm;
  }

  // Getter and setter methods for encapsulating sensitive fields
  public String getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(String vehicleId) {
    this.vehicleId = vehicleId;
  }

  public String getDriverName() {
    return driverName;
  }

  public void setDriverName(String driverName) {
    this.driverName = driverName;
  }

  public double getRatePerKm() {
    return ratePerKm;
  }

  public void setRatePerKm(double ratePerKm) {
    this.ratePerKm = ratePerKm;
  }

  // Concrete method to get vehicle details
  public void getVehicleDetails() {
    System.out.println("Vehicle ID: " + vehicleId);
    System.out.println("Driver Name: " + driverName);
    System.out.println("Rate per km: RS " + ratePerKm);
  }

  // Abstract method to calculate the fare based on distance
  abstract public double calculateFare(double distance);

  // Implementing methods from the GPS interface
  @Override
  public String getCurrentLocation() {
    return "Current location: Unknown"; // Default location (can be updated in subclasses)
  }

  @Override
  public void updateLocation(String location) {
    System.out.println("Vehicle's new location: " + location);
  }
}

// Car1 subclass that extends Vehicle1 and implements calculateFare()
class Car1 extends Vehicle1 {
  Car1(String vehicleId, String driverName, double ratePerKm) {
    super(vehicleId, driverName, ratePerKm);
  }

  @Override
  public double calculateFare(double distance) {
    // Car fare calculation: ratePerKm * distance
    return getRatePerKm() * distance;
  }

  @Override
  public void getVehicleDetails() {
    super.getVehicleDetails();
    System.out.println("Vehicle Type: Car1");
  }
}

// Bike1 subclass that extends Vehicle1 and implements calculateFare()
class Bike1 extends Vehicle1 {
  Bike1(String vehicleId, String driverName, double ratePerKm) {
    super(vehicleId, driverName, ratePerKm);
  }

  @Override
  public double calculateFare(double distance) {
    // Bike fare calculation: ratePerKm * distance
    return getRatePerKm() * distance;
  }

  @Override
  public void getVehicleDetails() {
    super.getVehicleDetails();
    System.out.println("Vehicle Type: Bike1");
  }
}

// Vehicle2 subclass that extends Vehicle1 and implements calculateFare()
class Vehicle2 extends Vehicle1 {
  Vehicle2(String vehicleId, String driverName, double ratePerKm) {
    super(vehicleId, driverName, ratePerKm);
  }

  @Override
  public double calculateFare(double distance) {
    // Vehicle fare calculation: ratePerKm * distance
    return getRatePerKm() * distance;
  }

  @Override
  public void getVehicleDetails() {
    super.getVehicleDetails();
    System.out.println("Vehicle Type: Vehicle2");
  }
}

// Main class to demonstrate the Ride-Hailing Application
public class RideHailingApp {
  public static void main(String[] args) {
    // Create instances of different vehicles
    Vehicle1 car1 = new Car1("C123", "Sachin", 2.5); // Car1 with $2.5 per km rate
    Vehicle1 bike1 = new Bike1("B456", "Duggu", 1.2); // Bike1 with $1.2 per km rate
    Vehicle2 vehicle1 = new Vehicle2("V789", "Ramu", 1.5); // Vehicle2 with $1.5 per km rate

    // Display vehicle details
    System.out.println("---- Vehicle Details ----");
    car1.getVehicleDetails();
    System.out.println("Fare for 10 km: RS " + car1.calculateFare(10)); // Calculate fare for 10 km
    System.out.println();

    bike1.getVehicleDetails();
    System.out.println("Fare for 10 km: RS " + bike1.calculateFare(10)); // Calculate fare for 10 km
    System.out.println();

    vehicle1.getVehicleDetails();
    System.out.println("Fare for 10 km: RS " + vehicle1.calculateFare(10)); // Calculate fare for 10 km
    System.out.println();

    // Demonstrate updating location for each vehicle
    car1.updateLocation("Bhopal");
    bike1.updateLocation("Indore");
    vehicle1.updateLocation("Anand Nagar");
  }
}
