// Class to manage patient data in a hospital
class Patient {
    // Static variable for the hospital name (shared among all patients)
    static String hospitalName = "City Hospital";

    // Static variable to count the total number of patients admitted
    static int totalPatients = 0;

    // Instance variables for patient details
    private String name;       // Name of the patient
    private int age;           // Age of the patient
    private String ailment;    // Ailment of the patient
    private final int patientID; // Unique ID for each patient (final)

    // Constructor to initialize patient details using 'this'
    Patient(String name, int age, String ailment, int patientID) {
        this.name = name;           // Assign the name
        this.age = age;             // Assign the age
        this.ailment = ailment;     // Assign the ailment
        this.patientID = patientID; // Assign the unique patient ID
        totalPatients++;            // Increment the total patient count
    }

    // Static method to get the total number of patients admitted
    static void getTotalPatients() {
        System.out.println("\nTotal patients admitted: " + totalPatients);
    }

    // Method to display patient details
    void displayDetails() {
        System.out.println("\nPatient Details:");
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
        System.out.println("Hospital Name: " + hospitalName);
    }
}

// Main class to simulate the Hospital Management System
public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Display the hospital name
        System.out.println("Welcome to " + Patient.hospitalName);

        // Create the first patient
        Patient patient1 = new Patient("RamBahadur", 30, "Fever", 101);

        // Check if patient1 is an instance of the Patient class
        if (patient1 instanceof Patient) {
            patient1.displayDetails(); // Display details of patient1
        } else {
            System.out.println("patient1 is not an instance of the Patient class.");
        }

        // Create the second patient
        Patient patient2 = new Patient("Ram", 45, "Diabetes", 102);

        // Check if patient2 is an instance of the Patient class
        if (patient2 instanceof Patient) {
            patient2.displayDetails(); // Display details of patient2
        } else {
            System.out.println("patient2 is not an instance of the Patient class.");
        }

        // Display the total number of patients admitted
        Patient.getTotalPatients();
    }
}
