// Superclass representing a general Device
class Device {
  String deviceId; // ID of the device
  String status; // Status of the device (e.g., on, off)

  // Constructor to initialize the device details
  Device(String deviceId, String status) {
    this.deviceId = deviceId;
    this.status = status;
  }

  // Method to display device status
  public void displayStatus() {
    System.out.println("\nDevice ID: " + deviceId);
    System.out.println("Status: " + status);
  }
}

// Subclass representing a Thermostat, extending Device
class Thermostat extends Device {
  int temperatureSetting;

  // Constructor to initialize Thermostat details
  Thermostat(String deviceId, String status, int temperatureSetting) {
    super(deviceId, status); // Call the constructor of the superclass (Device)
    this.temperatureSetting = temperatureSetting;
  }

  // Overriding displayStatus to include thermostat-specific details
  @Override
  public void displayStatus() {
    super.displayStatus(); // Display general device details
    System.out.println("Temperature Setting: " + temperatureSetting + "°C");
  }
}

// Main class to demonstrate the smart home system
public class SmartHomeSystem {
  public static void main(String[] args) {
    // Creating a Device object (generic)
    Device device = new Device("Device001", "On");
    device.displayStatus(); // Displaying device status

    // Creating a Thermostat object
    Thermostat thermostat = new Thermostat("Thermo001", "On", 22);
    thermostat.displayStatus(); // Displaying thermostat details
  }
}
