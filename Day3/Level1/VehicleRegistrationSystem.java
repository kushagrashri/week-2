// Class to manage vehicle registration details
class Vehicle {
    // Static variable for registration fee 
    static double registrationFee = 1000.0;

    // Instance variables to store vehicle details
    private String ownerName;         // Name of the owner
    private String vehicleType;       // Type of the vehicle (e.g., Car, Bike, Truck)
    private final String registrationNumber; // Unique registration number (final)

    // Constructor to initialize the vehicle details using 'this'
    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;                 // Assign owner name
        this.vehicleType = vehicleType;             // Assign vehicle type
        this.registrationNumber = registrationNumber; // Assign unique registration number
    }

    // Static method to update the registration fee
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: " + registrationFee);
    }

    // Instance method to display vehicle registration details
    void displayRegistrationDetails() {
        System.out.println("\nVehicle Registration Details:");
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: " + registrationFee);
    }
}

// Main class to simulate the Vehicle Registration System
public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        // Display the default registration fee
        System.out.println("Default Registration Fee: " + Vehicle.registrationFee);

        // Update the registration fee
        Vehicle.updateRegistrationFee(1200.0);

        // Create the first vehicle
        Vehicle vehicle1 = new Vehicle("Sachin", "Car", "CAR123");

        // Check if vehicle1 is an instance of the Vehicle class
        if (vehicle1 instanceof Vehicle) {
            vehicle1.displayRegistrationDetails(); // Display vehicle1 details
        } else {
            System.out.println("vehicle1 is not an instance of the Vehicle class.");
        }

        // Create the second vehicle
        Vehicle vehicle2 = new Vehicle("Manish", "Bike", "BIKE456");

        // Check if vehicle2 is an instance of the Vehicle class
        if (vehicle2 instanceof Vehicle) {
            vehicle2.displayRegistrationDetails(); // Display vehicle2 details
        } else {
            System.out.println("vehicle2 is not an instance of the Vehicle class.");
        }

        // Update the registration fee again
        Vehicle.updateRegistrationFee(1500.0);

        // Display the updated fee and vehicle details
        System.out.println("\n--- Updated Registration Fee and Vehicle Details ---");
        vehicle1.displayRegistrationDetails();
        vehicle2.displayRegistrationDetails();
    }
}
