public class Employee {
    // Attributes
    String name;
    int id;
    double salary;

    // Constructor to initialize the attributes
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: ₹" + salary);
    }

    // Main method to test the Employee class
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee("John Doe", 101, 50000.0);

        // Display the employee details
        emp.displayDetails();
    }
}
