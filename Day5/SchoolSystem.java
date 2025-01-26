// Base class representing a Person
class Person {
  String name; // Name of the person
  int age; // Age of the person

  // Constructor to initialize name and age
  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // Method to display common details about a person
  public void displayRole() {
    System.out.println("Name of Person is : " + name);
    System.out.println("Age of Person is  : " + age);
  }
}

// Subclass representing a Teacher, inheriting from Person
class Teacher extends Person {
  String subject; // Subject taught by the teacher

  // Constructor to initialize name, age, and subject
  Teacher(String name, int age, String subject) {
    super(name, age); // Call the constructor of the superclass (Person)
    this.subject = subject;
  }

  // Overriding displayRole to include teacher-specific details
  @Override
  public void displayRole() {
    System.out.println("\nRole of Person is Teacher.");
    super.displayRole(); // Call the base class method to display common details
    System.out.println("Subject of teacher is : " + subject);
  }
}

// Subclass representing a Student, inheriting from Person
class Student extends Person {
  char grade; // Grade of the student

  // Constructor to initialize name, age, and grade
  Student(String name, int age, char grade) {
    super(name, age); // Call the constructor of the superclass (Person)
    this.grade = grade;
  }

  // Overriding displayRole to include student-specific details
  @Override
  public void displayRole() {
    System.out.println("\nRole of Person is Student.");
    super.displayRole(); // Call the base class method to display common details
    System.out.println("Grade of Student is : " + grade);
  }
}

// Subclass representing a Staff member, inheriting from Person
class Staff extends Person {
  String id; // Staff ID

  // Constructor to initialize name, age, and id
  Staff(String name, int age, String id) {
    super(name, age); // Call the constructor of the superclass (Person)
    this.id = id;
  }

  // Overriding displayRole to include staff-specific details
  @Override
  public void displayRole() {
    System.out.println("\nRole of Person is Staff.");
    super.displayRole(); // Call the base class method to display common details
    System.out.println("Id of staff is : " + id);
  }
}

// Main class to demonstrate the school system with different roles
public class SchoolSystem {
  public static void main(String[] args) {
    // Creating objects of different roles in the school
    Teacher teacher = new Teacher("Bhuvan", 25, "Java");
    teacher.displayRole();

    Student student = new Student("Sachin", 21, 'A');
    student.displayRole();

    Staff staff = new Staff("Ramu", 35, "100");
    staff.displayRole();
  }
}
