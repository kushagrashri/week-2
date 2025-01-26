// Base class representing a general Course
class Course {
  String courseName;
  int duration;

  // Constructor to initialize courseName and duration
  Course(String courseName, int duration) {
    this.courseName = courseName;
    this.duration = duration;
  }

  // Method to display general course details
  public void displayCourseInfo() {
    System.out.println("\nCourse Name: " + courseName);
    System.out.println("Duration: " + duration + " days");
  }
}

// Subclass representing an OnlineCourse, extending Course
class OnlineCourse extends Course {
  String platform;
  boolean isRecorded;

  // Constructor to initialize courseName, duration, platform, and isRecorded
  OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
    super(courseName, duration); // Call the constructor of the superclass (Course)
    this.platform = platform;
    this.isRecorded = isRecorded;
  }

  // Overriding displayCourseInfo to include online course specific details
  @Override
  public void displayCourseInfo() {
    super.displayCourseInfo(); // Call the base class method to display basic course info
    System.out.println("Platform: " + platform);
    System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
  }
}

// Subclass representing a PaidOnlineCourse, extending OnlineCourse
class PaidOnlineCourse extends OnlineCourse {
  double fee;
  double discount;

  // Constructor to initialize courseName, duration, platform, isRecorded, fee,
  // and discount
  PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
    super(courseName, duration, platform, isRecorded); // Call the constructor of the superclass (OnlineCourse)
    this.fee = fee;
    this.discount = discount;
  }

  // Overriding displayCourseInfo to include paid course specific details
  @Override
  public void displayCourseInfo() {
    super.displayCourseInfo(); // Call the base class method to display online course info
    System.out.println("Fee: RS " + fee);
    System.out.println("Discount: " + discount + "%");
    System.out.println("Discounted Price: RS " + (fee - (fee * discount / 100)));
  }
}

// Main class to demonstrate the Educational Course Hierarchy
public class EducationalCourseHierarchy {
  public static void main(String[] args) {

    // Creating Course, OnlineCourse, and PaidOnlineCourse objects
    Course course1 = new Course("Java Programming", 30);
    OnlineCourse onlineCourse1 = new OnlineCourse("Web Development", 45, "Udemy", true);
    PaidOnlineCourse paidOnlineCourse1 = new PaidOnlineCourse("Machine Learning", 60, "Coursera", false, 200, 15);

    // Displaying course information for each object
    course1.displayCourseInfo();
    onlineCourse1.displayCourseInfo();
    paidOnlineCourse1.displayCourseInfo();
  }
}
