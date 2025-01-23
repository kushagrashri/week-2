import java.util.ArrayList;

class University {
    public String universityName;
    public ArrayList<Department1> departments;

    University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(String departmentName) {
        Department1 department = new Department1(departmentName); // Object created within University
        this.departments.add(department);
    }

    public void deleteUniversity() {
        System.out.println("Deleting University: " + this.universityName);
        this.departments.clear(); // All associated departments are deleted
    }

    public void showDepartments() {
        for (Department1 d : departments) {
            System.out.println("Department: " + d.departmentName + " in " + this.universityName);
        }
    }
}

class Department1 {
    public String departmentName;

    Department1(String departmentName) {
        this.departmentName = departmentName;
    }
}

class Faculty {
    public String facultyName;

    Faculty(String facultyName) {
        this.facultyName = facultyName;
    }

    public void showFaculty() {
        System.out.println("Faculty: " + this.facultyName);
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        // Creating a university
        University university = new University("TIT");

        // Composition
        university.addDepartment("CSE");
        university.addDepartment("ME");
        university.addDepartment("EC");

        // Aggregation
        Faculty faculty1 = new Faculty("Deepansh");
        Faculty faculty2 = new Faculty("Anubhav");
        Faculty faculty3 = new Faculty("Mayank");


        System.out.println("University Departments");
        university.showDepartments();


        System.out.println("Faculty Members");
        faculty1.showFaculty();
        faculty2.showFaculty();
        faculty3.showFaculty();

        // Deleting the university
        System.out.println("Deleting University");
        university.deleteUniversity();

        System.out.println("Departments after deleting the University:");
        university.showDepartments(); // Departments are deleted

        // Faculty members remain
        System.out.println("Faculty members still exist:");
        faculty1.showFaculty();
        faculty2.showFaculty();
        faculty3.showFaculty();
    }
}
