// MedicalRecord interface with methods to add and view medical records
interface MedicalRecord {
  void addRecord(String record); // Method to add a medical record

  String viewRecords(); // Method to view medical records
}

// Abstract class Patient with common fields and methods for all patients
abstract class Patient implements MedicalRecord {
  private String patientId;
  private String name;
  private int age;
  private String diagnosis;
  private String medicalHistory;

  // Constructor to initialize common patient details
  Patient(String patientId, String name, int age) {
    this.patientId = patientId;
    this.name = name;
    this.age = age;
  }

  // Getter and setter methods for encapsulating sensitive fields
  public String getPatientId() {
    return patientId;
  }

  public void setPatientId(String patientId) {
    this.patientId = patientId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getDiagnosis() {
    return diagnosis;
  }

  public void setDiagnosis(String diagnosis) {
    this.diagnosis = diagnosis;
  }

  public String getMedicalHistory() {
    return medicalHistory;
  }

  public void setMedicalHistory(String medicalHistory) {
    this.medicalHistory = medicalHistory;
  }

  // Concrete method to get patient details
  public void getPatientDetails() {
    System.out.println("Patient ID: " + patientId);
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Diagnosis: " + diagnosis);
    System.out.println("Medical History: " + medicalHistory);
  }

  // Abstract method to calculate medical bill, to be implemented by subclasses
  abstract public double calculateBill();

  // Implementing addRecord() and viewRecords() from MedicalRecord interface
  @Override
  public void addRecord(String record) {
    // Add medical record logic (e.g., append to a list or database)
    this.medicalHistory += "\n" + record; // Simplified for this example
  }

  @Override
  public String viewRecords() {
    return medicalHistory;
  }
}

// InPatient subclass that extends Patient and implements calculateBill()
class InPatient extends Patient {
  private int daysAdmitted;
  private double dailyRate;

  InPatient(String patientId, String name, int age, int daysAdmitted, double dailyRate) {
    super(patientId, name, age);
    this.daysAdmitted = daysAdmitted;
    this.dailyRate = dailyRate;
  }

  @Override
  public double calculateBill() {
    // In-patient billing logic: daily rate * number of days admitted
    return daysAdmitted * dailyRate;
  }

  @Override
  public void getPatientDetails() {
    super.getPatientDetails();
    System.out.println("Days Admitted: " + daysAdmitted);
    System.out.println("Daily Rate: $" + dailyRate);
    System.out.println("Total Bill (In-Patient): $" + calculateBill());
  }
}

// OutPatient subclass that extends Patient and implements calculateBill()
class OutPatient extends Patient {
  private double consultationFee;

  OutPatient(String patientId, String name, int age, double consultationFee) {
    super(patientId, name, age);
    this.consultationFee = consultationFee;
  }

  @Override
  public double calculateBill() {
    // Out-patient billing logic: just the consultation fee
    return consultationFee;
  }

  @Override
  public void getPatientDetails() {
    super.getPatientDetails();
    System.out.println("Consultation Fee: $" + consultationFee);
    System.out.println("Total Bill (Out-Patient): $" + calculateBill());
  }
}

// Main class to demonstrate the Hospital Patient Management System
public class HospitalManagementSystem {
  public static void main(String[] args) {
    // Create instances of InPatient and OutPatient
    Patient inPatient = new InPatient("101", "John Doe", 45, 5, 200.0);
    Patient outPatient = new OutPatient("102", "Jane Smith", 38, 50.0);

    // Add medical records to the patients
    inPatient.addRecord("Admitted with fever and severe dehydration.");
    outPatient.addRecord("Consultation for routine checkup.");

    // Display patient details and their total bill
    System.out.println("---- In-Patient Details ----");
    inPatient.getPatientDetails();
    System.out.println("Medical Records: \n" + inPatient.viewRecords() + "\n");

    System.out.println("---- Out-Patient Details ----");
    outPatient.getPatientDetails();
    System.out.println("Medical Records: \n" + outPatient.viewRecords() + "\n");

    // Calculate and print total bills for both patients
    double totalBill = inPatient.calculateBill() + outPatient.calculateBill();
    System.out.println("Total Bill for all patients: $" + totalBill);
  }
}
