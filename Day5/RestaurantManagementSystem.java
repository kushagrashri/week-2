// Superclass that holds common attributes for all persons
class Person1 {
  String name; // Name of the person
  String id; // ID of the person

  // Constructor to initialize name and id
  Person1(String name, String id) {
    this.name = name;
    this.id = id;
  }

  // Method to display person's information
  public void displayInfo() {
    System.out.println("\nName of Person is : " + name);
    System.out.println("Id of Person is : " + id);
  }
}

// Interface to define a common contract for performing duties
interface Worker {
  void performDuties(); // Method to perform duties, to be implemented by classes
}

// Subclass Chef inherits from Person1 and implements Worker interface
class Chef extends Person1 implements Worker {

  // Constructor to initialize name and id for Chef, and passing them to the
  // Person1 constructor
  Chef(String name, String id) {
    super(name, id); // Calling the parent constructor
  }

  // Implementation of the performDuties method for Chef 
  @Override
  public void performDuties() {
    super.displayInfo(); // Calling displayInfo from Person1
    System.out.println("Chef performs its duties."); // Chef-specific duties
  }
}

// Subclass Waiter inherits from Person1 and implements Worker interface
class Waiter extends Person1 implements Worker {

  // Constructor to initialize name and id for Waiter, and passing them to the
  // Person1 constructor
  Waiter(String name, String id) {
    super(name, id); // Calling the parent constructor
  }

  // Implementation of the performDuties method for Waiter
  @Override
  public void performDuties() {
    super.displayInfo(); // Calling displayInfo from Person1
    System.out.println("Waiter performs its duties."); // Waiter-specific duties
  }
}

// Main class to simulate the restaurant management system
public class RestaurantManagementSystem {
  public static void main(String[] args) {

    // Creating Chef object and calling performDuties method
    Chef chef = new Chef("Sachin", "149");
    chef.performDuties(); // Chef performs their duties

    // Creating Waiter object and calling performDuties method
    Waiter waiter = new Waiter("Ramu", "100");
    waiter.performDuties(); // Waiter performs their duties
  }
}
