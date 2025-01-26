// Superclass to represent a vehicle
class Vehicle1 {
  int maxSpeed;  // Maximum speed of the vehicle
  String model;  // Model of the vehicle

  // Constructor to initialize maxSpeed and model
  Vehicle1(int maxSpeed, String model) {
    this.maxSpeed = maxSpeed;
    this.model = model;
  }

  // Method to display vehicle details
  public void displayInfo() {
    System.out.println("\nModel of vehicle is    : " + model);  // Displaying model
    System.out.println("MaxSpeed of vehicle is : " + maxSpeed);  // Displaying max speed
  }
}

// Interface to provide refuel functionality for refuelable vehicles
interface Refuelable {
  void refuel();  // Method to refuel a vehicle
}

// Subclass representing a petrol-powered vehicle
class PetrolVehicle extends Vehicle1 implements Refuelable {

  // Constructor to initialize maxSpeed and model, and passing to superclass constructor
  PetrolVehicle(int maxSpeed, String model) {
    super(maxSpeed, model);  // Calling the constructor of Vehicle1 class
  }

  // Implementation of refuel method from Refuelable interface
  public void refuel() {
    System.out.println("PetrolVehicle refueled.");  // Specific refuel action for petrol vehicle
  }
}

// Subclass representing an electric-powered vehicle
class ElectricVehicle extends Vehicle1 {

  // Constructor to initialize maxSpeed and model, and passing to superclass constructor
  ElectricVehicle(int maxSpeed, String model) {
    super(maxSpeed, model);  // Calling the constructor of Vehicle1 class
  }

  // Method to charge an electric vehicle
  public void charge() {
    System.out.println("ElectricVehicle charged.");  // Specific charging action for electric vehicle
  }
}

// Main class to test the Vehicle Management System
public class VehicleManagementSystem {
  public static void main(String[] args) {

    // Creating a PetrolVehicle object
    PetrolVehicle petrolVehicle = new PetrolVehicle(140, "TOYOTA FORTUNER");
    petrolVehicle.displayInfo();  // Displaying details of the petrol vehicle
    petrolVehicle.refuel();  // Refueling the petrol vehicle

    // Creating an ElectricVehicle object
    ElectricVehicle electricVehicle = new ElectricVehicle(120, "TATA CURVE");
    electricVehicle.displayInfo();  // Displaying details of the electric vehicle
    electricVehicle.charge();  // Charging the electric vehicle
  }
}
