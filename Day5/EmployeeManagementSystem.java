// Base class representing an Employee with common attributes and behavior
class Employee {
  String name; // Employee name
  int id; // Employee ID
  double salary; // Employee salary

  // Constructor to initialize employee attributes
  Employee(String name, int id, double salary) {
    this.name = name;
    this.id = id;
    this.salary = salary;
  }

  // Method to display employee details
  public void displayDetails() {
    System.out.println("\nName of employee is : " + name);
    System.out.println("ID of employee is     : " + id);
    System.out.println("Salary of employee is : " + salary);
  }
}

// Manager class inheriting from Employee class
class Manager extends Employee {

  // Constructor to initialize manager-specific and inherited attributes
  Manager(String name, int id, double salary) {
    super(name, id, salary);
  }

  // Overriding the displayDetails method to customize output for Manager
  @Override
  public void displayDetails() {
    System.out.println("\nName of Manager is : " + name);
    System.out.println("ID of Manager is     : " + id);
    System.out.println("Salary of Manager is : " + salary);
  }
}

// Developer class inheriting from Employee class
class Developer extends Employee {

  // Constructor to initialize developer-specific and inherited attributes
  Developer(String name, int id, double salary) {
    super(name, id, salary);
  }

  // Overriding the displayDetails method to customize output for Developer
  @Override
  public void displayDetails() {
    System.out.println("\nName of Developer is : " + name);
    System.out.println("ID of Developer is     : " + id);
    System.out.println("Salary of Developer is : " + salary);
  }
}

// Intern class inheriting from Employee class
class Intern extends Employee {

  // Constructor to initialize intern-specific and inherited attributes
  Intern(String name, int id, double salary) {
    super(name, id, salary);
  }

  // Overriding the displayDetails method to customize output for Intern
  @Override
  public void displayDetails() {
    System.out.println("\nName of Intern is : " + name);
    System.out.println("ID of Intern is     : " + id);
    System.out.println("Salary of Intern is : " + salary);
  }
}

// Main class to test the Employee Management System
public class EmployeeManagementSystem {
  public static void main(String[] args) {
    // Creating an Employee object and displaying details
    Employee employee = new Employee("Sachin", 149, 50000);
    employee.displayDetails();

    // Creating a Manager object and displaying details
    Manager manager = new Manager("Duggu", 200, 90000);
    manager.displayDetails();

    // Creating a Developer object and displaying details
    Developer developer = new Developer("Vishal", 100, 60000);
    developer.displayDetails();

    // Creating an Intern object and displaying details
    Intern intern = new Intern("Raghav", 001, 15000);
    intern.displayDetails();
  }
}
