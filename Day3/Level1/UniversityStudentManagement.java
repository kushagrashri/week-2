// Class to manage student data
class Student {
    // Static variable for the university name 
    static String universityName = "RGPV University";

    // Static variable to keep track of the total number of students enrolled
    static int totalStudents = 0;

    // Instance variables for student details
    private String name;      // Name of the student
    private final int rollNumber; // Unique roll number
    private String grade;     // Grade of the student

    // Constructor to initialize student details using 'this'
    Student(String name, int rollNumber, String grade) {
        this.name = name;            // Assign the name
        this.rollNumber = rollNumber; // Assign the roll number
        this.grade = grade;          // Assign the grade
        totalStudents++;             // Increment the total number of students
    }

    // Static method to display the total number of students enrolled
    static void displayTotalStudents() {
        System.out.println("\nTotal number of students enrolled: " + totalStudents);
    }

    // Instance method to display student details
    void displayDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }

    // Method to update the grade of the student
    void updateGrade(String newGrade) {
        this.grade = newGrade; // Update the grade
        System.out.println("Grade updated for Roll Number " + rollNumber + " to: " + grade);
    }
}

// Main class to simulate the University Student Management System
public class UniversityStudentManagement {
    public static void main(String[] args) {
        // Display the university name (static variable)
        System.out.println("University Name: " + Student.universityName);

        // Create the first student
        Student student1 = new Student("Manish", 101, "A");

        // Check if student1 is an instance of the Student class
        if (student1 instanceof Student) {
            student1.displayDetails(); // Display student1's details
        } else {
            System.out.println("student1 is not an instance of the Student class.");
        }

        // Create the second student
        Student student2 = new Student("Sachin", 102, "B");

        // Check if student2 is an instance of the Student class
        if (student2 instanceof Student) {
            student2.displayDetails(); // Display student2's details
        } else {
            System.out.println("student2 is not an instance of the Student class.");
        }

        // Display the total number of students enrolled
        Student.displayTotalStudents();

        // Update the grade of the first student
        student1.updateGrade("A+");

        // Display updated details of student1
        System.out.println("\n--- Updated Details ---");
        student1.displayDetails();
    }
}
