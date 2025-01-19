class Course {

  // Instance Variables
  private String courseName;
  private int duration;
  private double fee;

  // Class Variable
  private static String instituteName = "Tech Institute";

  // Constructor
  Course(String courseName, int duration, double fee) {
    this.courseName = courseName;
    this.duration = duration;
    this.fee = fee;
  }

  // Instance Method to display course details
  void displayCourseDetails() {
    System.out.println("Institute Name : " + instituteName);
    System.out.println("Course Name    : " + courseName);
    System.out.println("Duration       : " + duration + " weeks");
    System.out.println("Fee            : RS " + fee);
  }

  // Class Method to update the institute name
  static void updateInstituteName(String newName) {
    instituteName = newName;
    System.out.println("Institute name updated to: " + instituteName);
  }
}

public class CourseManagement {
  public static void main(String[] args) {

    // Creating course instances
    Course course1 = new Course("Java Programming", 12, 2500);
    Course course2 = new Course("Web Development", 10, 1000);

    // Display details of each course
    System.out.println("Course 1 Details:");
    course1.displayCourseDetails();

    System.out.println("\nCourse 2 Details:");
    course2.displayCourseDetails();

    // Update institute name
    System.out.println("\nUpdating Institute Name...");
    Course.updateInstituteName("Technocrats Institute of Technology");

    // Display details again after updating the institute name
    System.out.println("\nCourse 1 Details (After Update):");
    course1.displayCourseDetails();

    System.out.println("\nCourse 2 Details (After Update):");
    course2.displayCourseDetails();
  }
}
