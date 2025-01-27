// Department interface with methods to assign and get department details
interface Department  {
  // Method to assign a department to an employee
  public void assignDepartment(String department);
  
  // Method to retrieve the department details of an employee
  public String getDepartmentDetails();
}

// Abstract Employee class implementing Department interface
abstract class Employee implements Department{
  // Private fields for employee details
  private String employeeId;
  private String name;
  private String department;
  
  // Constant for hourly wage
  final int HOUR_WAGE = 100;

  // Constructor to initialize employeeId, name, and department
  Employee(String employeeId, String name, String department) {
    this.employeeId = employeeId;
    this.name = name;
    this.department = department;
  }

  // Abstract method to calculate salary, to be implemented by subclasses
  abstract public double calculateSalary();

  // Method to assign department to an employee (from Department interface)
  @Override
  public void assignDepartment(String department) {
    this.department = department;
  }

  // Method to get department details (from Department interface)
  @Override
  public String getDepartmentDetails() {
    return department;
  }

  // Method to display employee details
  public void displayDetails() {
    System.out.println("\nName of employee is : " + name);
    System.out.println("Id of employee is : " + employeeId);
    System.out.println("Department of employee is : " + getDepartmentDetails());
  }
}

// FullTimeEmployee class extending Employee
class FullTimeEmployee extends Employee{
  // Fields for work hours and base salary
  int workHour;
  private double baseSalary;

  // Constructor to initialize FullTimeEmployee details
  FullTimeEmployee(String employeeId, String name, String department, double baseSalary, int workHour) {
    // Calling the constructor of the abstract class Employee
    super(employeeId, name, department);
    setBaseSalary(baseSalary);  // Setting base salary
    this.workHour = workHour;   // Setting work hours
  }

  // Getter and setter for baseSalary
  public double getBaseSalary() {
    return baseSalary;
  }

  public void setBaseSalary(double baseSalary) {
    this.baseSalary = baseSalary;
  }

  // Overridden method to calculate salary for full-time employees
  @Override
  public double calculateSalary() {
    // Base salary + work hours * hourly wage
    double salary = getBaseSalary() + (workHour * HOUR_WAGE);
    return salary;
  }

  // Overridden method to display details of full-time employee
  @Override
  public void displayDetails() {
    super.displayDetails(); // Calling the parent class method to display common details
    System.out.println("Base salary of full-time employee is : " + getBaseSalary());
    System.out.println("Total salary of full-time employee is : " + calculateSalary());
  }
}

// PartTimeEmployee class extending Employee
class PartTimeEmployee extends Employee{
  // Field for work hours
  int workHour;

  // Constructor to initialize PartTimeEmployee details
  PartTimeEmployee(String employeeId, String name, String department, int workHour) {
    // Calling the constructor of the abstract class Employee
    super(employeeId, name, department);
    this.workHour = workHour;  // Setting work hours
  }

  // Overridden method to calculate salary for part-time employees
  @Override
  public double calculateSalary() {
    // work hours * hourly wage
    double salary = workHour * HOUR_WAGE;
    return salary;
  }

  // Overridden method to display details of part-time employee
  @Override
  public void displayDetails() {
    super.displayDetails(); // Calling the parent class method to display common details
    System.out.println("Total salary of part-time employee is : " + calculateSalary());
  }
}

// Main class to manage Employee data
public class EmployeeManagementSystem {
  public static void main(String[] args) {
    // Creating FullTimeEmployee object
    FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("149", "Sachin", "CS", 5000, 5);
    fullTimeEmployee.displayDetails();  // Displaying full-time employee details

    // Creating PartTimeEmployee object
    PartTimeEmployee partTimeEmployee = new PartTimeEmployee("100", "Duggu", "AIML", 5);
    partTimeEmployee.displayDetails();  // Displaying part-time employee details
  }
}