// Parent class: Employee
class Employee {

  // Attributes
  public String employeeID;
  protected String department;
  private double salary; 

  // Constructor to initialize employee details
  Employee(String employeeID, String department, double salary) {
    this.employeeID = employeeID; 
    this.department = department; 
    this.salary = salary; 
  }

  // Public method to get the salary (getter)
  public double getSalary() {
    return salary; 
  }

  // Public method to set the salary (setter)
  public void setSalary(double salary) {
    if (salary >= 0) { // Ensure salary is not negative
      this.salary = salary; 
    } else {
      System.out.println("Salary cannot be negative.");
    }
  }

  // Public method to display employee details
  public void displayEmployeeDetails() {
    System.out.println("Employee ID   : " + employeeID); 
    System.out.println("Department    : " + department);
    System.out.println("Salary        : RS " + getSalary()); // Access salary using getter method
  }
}

// Subclass: Manager (inherits from Employee)
class Manager extends Employee {

  // Constructor for Manager that calls the constructor of the parent Employee class
  Manager(String employeeID, String department, double salary) {
    // Initialize parent class (Employee) with the given values 
    super(employeeID, department, salary); 
  }

  // Method to display details of the Manager (inherits from Employee)
  public void displayManagerDetails() {
    System.out.println("\nManager Details:");
    System.out.println("Employee ID   : " + employeeID); // Access public employeeID field
    System.out.println("Department    : " + department); // Access protected department field
  }
}

// Main class to demonstrate Employee and Manager functionality
public class EmployeeRecords {
  public static void main(String[] args) {

    // Create an Employee object
    Employee employee = new Employee("E12345", "HR", 50000.0);

    // Display Employee details
    System.out.println("Employee Details:");
    employee.displayEmployeeDetails();

    // Modify salary using public method and display updated salary
    employee.setSalary(55000.0); // Update salary
    System.out.println("Updated Salary: RS " + employee.getSalary());

    // Create a Manager object
    Manager manager = new Manager("M98765", "IT", 80000.0);

    // Display Manager details
    manager.displayManagerDetails(); // Display employeeID and department (from the parent class)

    // Display Manager salary using Employee class methods
    System.out.println("Manager's Salary: RS " + manager.getSalary()); // Access salary using getter method
  }
}
