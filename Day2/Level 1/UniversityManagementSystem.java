class Student {
  public int rollNumber;
  protected String name;
  private double CGPA;

  Student(int rollNumber, String name, double CGPA) {
    this.rollNumber = rollNumber;
    this.name = name;
    this.CGPA = CGPA;
  }

  public void modifyCGPA(double newCGPA) {
    this.CGPA = newCGPA;
  }

  public double getCGPA() {
    return CGPA;
  }

  public void displayDetails() {
    System.out.println("Roll Number: " + rollNumber);
    System.out.println("Name       : " + name);
    System.out.println("CGPA       : " + CGPA);
  }
}

class PostgraduateStudent extends Student {
  PostgraduateStudent(int rollNumber, String name, double CGPA) {
    super(rollNumber, name, CGPA);
  }

  public void displayPostgraduateDetails() {
    // Call parent class method
    displayDetails();
  }
}

public class UniversityManagementSystem {
  public static void main(String[] args) {
    // Create a Student object
    System.out.println("Student Details:");
    Student student = new Student(101, "Sachin", 8.21);
    student.displayDetails();

    // Modify and display CGPA
    System.out.println("\nUpdating CGPA...");
    student.modifyCGPA(9.2);
    System.out.println("Updated CGPA: " + student.getCGPA());

    // Create a PostgraduateStudent object
    System.out.println("\nPostgraduate Student Details:");
    PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Sachin", 9.0);
    pgStudent.displayPostgraduateDetails();
  }
}
