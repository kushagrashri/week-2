// Class representing an Employee
class Employee {
    // Static variable to store the name of the company (shared among all employees)
    static String companyName = "HCl";

    // Private instance variable for the employee's name
    private String name;

    // Private final variable for the employee's unique ID (cannot be changed after initialization)
    private final int id;

    // Private instance variable for the employee's designation
    private String designation;

    // Static variable to track the total number of employees (shared across all instances)
    static int totalEmployee = 0;

    // Constructor to initialize an Employee object
    Employee(String name, int id, String designation) {
        this.name = name;                 // Assign the employee's name
        this.id = id;                     // Assign the employee's ID
        this.designation = designation;   // Assign the employee's designation
        totalEmployee++;                  // Increment the total number of employees
    }

    // Static method to display the total number of employees
    static void displayTotalEmployee() {
        System.out.println("\nThe number of total employees are: " + totalEmployee);
    }

    // Instance method to display the details of the employee
    void displayDetails() {
        System.out.println("\nThe name of the employee is: " + name);
        System.out.println("The Employee ID: " + id);
        System.out.println("The designation of the employee is: " + designation);
    }
}

// Main class to manage the employee system
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Print the name of the company (accessed using the class name as it is static)
        System.out.println("The name of the company is: " + Employee.companyName);

        // Create the first Employee object
        Employee emp1 = new Employee("Sachin Kumar Thakur", 183, "Software Developer");

        // Check if emp1 is an instance of the Employee class
        if (emp1 instanceof Employee) {
            emp1.displayDetails(); // Call the method to display employee details
        } else {
            System.out.println("emp1 is not an instance of the Employee class");
        }

        // Create the second Employee object
        Employee emp2 = new Employee("Kushagra", 456, "Developer");

        // Check if emp2 is an instance of the Employee class
        if (emp2 instanceof Employee) {
            emp2.displayDetails(); // Call the method to display employee details
        } else {
            System.out.println("emp2 is not an instance of the Employee class");
        }

        // Display the total number of employees
        Employee.displayTotalEmployee();
    }
}
