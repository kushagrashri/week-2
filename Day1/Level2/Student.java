// Define the Student class
class Student {
    // Attributes
    String name;
    int rollNumber;
    double marks;
    char grade; // Grade will be calculated based on marks

    // Constructor to initialize the attributes
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.grade = calculateGrade(marks); // Calculate grade based on initial marks
    }

    // Method to calculate grade based on marks
    private char calculateGrade(double marks) {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 80) {
            return 'B';
        } else if (marks >= 70) {
            return 'C';
        } else if (marks >= 60) {
            return 'D';
        } else {
            return 'F'; // Fail
        }
    }

    // Method to display student details and grade
    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }




    public static void main(String[] args) {
        // Creating a new Student object
        Student student1 = new Student("John Doe", 101, 85.5);

        // Displaying student details
        student1.displayDetails();
    }
}
