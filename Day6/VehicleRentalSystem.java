// Insurable interface with methods to calculate insurance and get insurance details
interface Insurable {
  double calculateInsurance(); // Method to calculate insurance cost

  String getInsuranceDetails(); // Method to get details about the insurance
}

// Abstract class Vehicle with common fields and methods for all vehicles
abstract class Vehicle implements Insurable {
  private String vehicleNumber;
  private String type;
  private double rentalRate; // Rental rate per day

  // Constructor to initialize vehicle details
  Vehicle(String vehicleNumber, String type, double rentalRate) {
    this.vehicleNumber = vehicleNumber;
    this.type = type;
    this.rentalRate = rentalRate;
  }

  // Getter and setter methods to encapsulate fields
  public String getVehicleNumber() {
    return vehicleNumber;
  }

  public void setVehicleNumber(String vehicleNumber) {
    this.vehicleNumber = vehicleNumber;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public double getRentalRate() {
    return rentalRate;
  }

  public void setRentalRate(double rentalRate) {
    this.rentalRate = rentalRate;
  }

  // Abstract method to calculate rental cost, to be implemented by subclasses
  abstract public double calculateRentalCost(int days);

  // Method to calculate and return the total cost (rental cost + insurance cost)
  public double calculateTotalCost(int days) {
    double rentalCost = calculateRentalCost(days);
    double insuranceCost = calculateInsurance();
    return rentalCost + insuranceCost;
  }
}

// Car class extending Vehicle and implementing Insurable interface
class Car extends Vehicle {
  private double fuelSurcharge;

  // Constructor to initialize Car specific details
  Car(String vehicleNumber, double rentalRate, double fuelSurcharge) {
    super(vehicleNumber, "Car", rentalRate);
    this.fuelSurcharge = fuelSurcharge;
  }

  // Implementation of calculateRentalCost() method for Car
  @Override
  public double calculateRentalCost(int days) {
    return getRentalRate() * days + fuelSurcharge;
  }

  // Implementation of calculateInsurance() method from Insurable interface for
  // Car
  @Override
  public double calculateInsurance() {
    return getRentalRate() * 0.05; // 5% of rental rate as insurance cost for cars
  }

  // Implementation of getInsuranceDetails() method from Insurable interface
  @Override
  public String getInsuranceDetails() {
    return "Insurance Details: Car Insurance, 5% of rental rate.";
  }
}

// Bike class extending Vehicle and implementing Insurable interface
class Bike extends Vehicle {
  private boolean isSportBike;

  // Constructor to initialize Bike specific details
  Bike(String vehicleNumber, double rentalRate, boolean isSportBike) {
    super(vehicleNumber, "Bike", rentalRate);
    this.isSportBike = isSportBike;
  }

  // Implementation of calculateRentalCost() method for Bike
  @Override
  public double calculateRentalCost(int days) {
    double surcharge = isSportBike ? 50 : 20; // Extra charge for sport bikes
    return getRentalRate() * days + surcharge;
  }

  // Implementation of calculateInsurance() method from Insurable interface for
  // Bike
  @Override
  public double calculateInsurance() {
    return getRentalRate() * 0.03; // 3% of rental rate as insurance cost for bikes
  }

  // Implementation of getInsuranceDetails() method from Insurable interface
  @Override
  public String getInsuranceDetails() {
    return "Insurance Details: Bike Insurance, 3% of rental rate.";
  }
}

// Truck class extending Vehicle and implementing Insurable interface
class Truck extends Vehicle {
  private double loadCapacity;

  // Constructor to initialize Truck specific details
  Truck(String vehicleNumber, double rentalRate, double loadCapacity) {
    super(vehicleNumber, "Truck", rentalRate);
    this.loadCapacity = loadCapacity;
  }

  // Implementation of calculateRentalCost() method for Truck
  @Override
  public double calculateRentalCost(int days) {
    double surcharge = loadCapacity * 0.1; // Extra charge based on truck's load capacity
    return getRentalRate() * days + surcharge;
  }

  // Implementation of calculateInsurance() method from Insurable interface for
  // Truck
  @Override
  public double calculateInsurance() {
    return getRentalRate() * 0.08; // 8% of rental rate as insurance cost for trucks
  }

  // Implementation of getInsuranceDetails() method from Insurable interface
  @Override
  public String getInsuranceDetails() {
    return "Insurance Details: Truck Insurance, 8% of rental rate.";
  }
}

// Main class to test the Vehicle Rental System
public class VehicleRentalSystem {
  public static void main(String[] args) {
    // Create an array of Vehicle objects
    Vehicle[] vehicles = {
        new Car("C123", 500, 50), // Car: Vehicle Number, Rental Rate, Fuel Surcharge
        new Bike("B456", 200, true), // Bike: Vehicle Number, Rental Rate, Is Sport Bike
        new Truck("T789", 1000, 10) // Truck: Vehicle Number, Rental Rate, Load Capacity
    };

    // Iterate over the list of vehicles and calculate rental and insurance costs
    for (Vehicle vehicle : vehicles) {
      System.out.println("\nVehicle Type: " + vehicle.getType());
      System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());
      System.out.println("Rental Rate per day: " + vehicle.getRentalRate());

      // Calculate and print rental cost for 5 days
      int rentalDays = 5;
      double totalCost = vehicle.calculateTotalCost(rentalDays);
      System.out.println("Total Rental and Insurance Cost for " + rentalDays + " days: " + totalCost);
      System.out.println(vehicle.getInsuranceDetails());
    }
  }
}
