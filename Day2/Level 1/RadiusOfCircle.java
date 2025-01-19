import java.util.Scanner;

class Circle {

  // Attributes
  private double radius;

  // Default constructor
  Circle() {
    this.radius = 5;
  }

  // Parameterized constructor
  Circle(double radius) {
    this.radius = radius;
  }

  // Method to display details
  void displayDetails() {
    System.out.println("Radius of Circle is : " + radius);
  }
}

public class RadiusOfCircle {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    // Default constructor called
    System.out.println("\nDefault constructor called....");
    Circle circle1 = new Circle();
    circle1.displayDetails();

    // Enter radius of circle to call parameterized constructor
    System.out.print("Enter radius of circle to call parameterized constructor : ");
    double radius = input.nextDouble();

    // Parameterized constructor called
    System.out.println("\nParameterized constructor called....");
    Circle circle2 = new Circle(radius);
    circle2.displayDetails();

    input.close();
  }
}
