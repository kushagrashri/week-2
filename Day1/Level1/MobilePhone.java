public class MobilePhone {
    // Attributes
    String brand;
    String model;
    double price;

    // Constructor to initialize the attributes
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display all the details of the phone
    public void displayDetails() {
        System.out.println("Mobile Phone Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + price);
    }

    // Main method to test the MobilePhone class
    public static void main(String[] args) {
        // Create a MobilePhone object
        MobilePhone phone = new MobilePhone("Samsung", "Galaxy S23", 79999.0);

        // Display the details of the phone
        phone.displayDetails();
    }
}
