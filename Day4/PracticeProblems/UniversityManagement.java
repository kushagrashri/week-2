import java.util.ArrayList;

class Student1{

    String studentName;
    ArrayList<Course1> courses;

    Student1(String studentName){
        this.studentName=studentName;
        this.courses = new ArrayList<>();
    }

    public void enrollCourse(Course1 course){
        courses.add(course);
    }

    public void showCourses() {
        for (Course1 c:courses){
            System.out.println("Student "+this.studentName+" is enrolled in "+c.courseName);
        }
    }
}

class Professor{

    String professorName;

    Professor(String professorName){
        this.professorName=professorName;
    }

}

class Course1{

    String courseName;
    Professor professor;

    Course1(String courseName){
        this.courseName=courseName;
    }

    public void assignProfessor(Professor professor){
        this.professor=professor;
    }

    public void showProfessor() {
        System.out.println("Course "+this.courseName+" is assigned to "+professor.professorName);
    }
}




public class UniversityManagement {
    public static void main(String[] args) {

        Student1 student1 = new Student1("Deepansh");
        Student1 student2 = new Student1("Anubhav");
        Student1 student3 = new Student1("Mayank");

        Course1 course1 = new Course1("Java Full Stack");
        Course1 course2 = new Course1("Web Development");
        Course1 course3 = new Course1("AI");

        Professor professor1 = new Professor("ABC");
        Professor professor2 = new Professor("XYZ");
        Professor professor3 = new Professor("IJK");

        student1.enrollCourse(course1);
        student2.enrollCourse(course2);
        student3.enrollCourse(course3);

        course1.assignProfessor(professor1);
        course2.assignProfessor(professor2);
        course3.assignProfessor(professor3);

        student1.showCourses();
        student2.showCourses();
        student3.showCourses();

        course1.showProfessor();
        course2.showProfessor();
        course3.showProfessor();

    }
}
