import java.util.ArrayList;

// Base class representing a general vehicle
class Vehicle {
  int maxSpeed;  // Maximum speed of the vehicle
  String fuelType;  // Fuel type of the vehicle (e.g., petrol, diesel)
  ArrayList<Vehicle> vehicles;  // List to store different vehicles

  Vehicle(int maxSpeed, String fuelType) {
    this.maxSpeed = maxSpeed;
    this.fuelType = fuelType;
    this.vehicles = new ArrayList<>();
  }

  // Method to display vehicle information
  public void displayInfo() {
    System.out.println("Maximum speed of vehicle is : " + maxSpeed);
    System.out.println("Fuel type of vehicle is     : " + fuelType);
  }
}

// Subclass representing a Car
class Car extends Vehicle {
  int seatCapacity;  // Number of seats in the car

  Car(int maxSpeed, String fuelType, int seatCapacity){
    super(maxSpeed, fuelType);
    this.seatCapacity = seatCapacity;
  }

  // Overriding displayInfo to include car-specific details
  @Override
  public void displayInfo() {
    System.out.println("\nShowing details of Car....");
    super.displayInfo();
    System.out.println("Seat capacity of car is     : " + seatCapacity);
  }
}

// Subclass representing a Truck
class Truck extends Vehicle {
  int numberOfTyres;  // Number of tyres in the truck

  Truck(int maxSpeed, String fuelType, int numberOfTyres){
    super(maxSpeed, fuelType);
    this.numberOfTyres = numberOfTyres;
  }

  // Overriding displayInfo to include truck-specific details
  @Override
  public void displayInfo() {
    System.out.println("\nShowing details of Truck....");
    super.displayInfo();
    System.out.println("Number of tyres of truck is : " + numberOfTyres);
  }
}

// Subclass representing a Motorcycle
class MotorCycle extends Vehicle {
  String nameOfMotorCycle;  // Name of the motorcycle

  MotorCycle(int maxSpeed, String fuelType, String nameOfMotorCycle){
    super(maxSpeed, fuelType);
    this.nameOfMotorCycle = nameOfMotorCycle;
  }

  // Overriding displayInfo to include motorcycle-specific details
  @Override
  public void displayInfo() {
    System.out.println("\nShowing details of MotorCycle....");
    super.displayInfo();
    System.out.println("Name of MotorCycle is       : " + nameOfMotorCycle);
  }
}

// Main class to demonstrate polymorphism
public class VehicleAndTransportInfo {
  public static void main(String[] args) {
    // Creating objects of different vehicle types
    Car car = new Car(80, "petrol", 4);
    car.displayInfo();

    Truck truck = new Truck(60, "diesel", 10);
    truck.displayInfo();

    MotorCycle motorCycle = new MotorCycle(120, "petrol", "Shine 125");
    motorCycle.displayInfo();

    // Demonstrating polymorphism by storing different vehicle objects in an array list
    Vehicle vehicle = new Vehicle(0, null);
    for(Vehicle v : vehicle.vehicles){
      v.displayInfo();
    }
  }
}
