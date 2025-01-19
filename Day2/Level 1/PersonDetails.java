import java.util.Scanner;

class Person {
  
  // Attributes
  private String name;
  private int age;

  // Parameterized constructor
  Person(String name, int age){
    this.name = name;
    this.age = age;
  }

  // Copy constructor
  Person(Person person){
    this.name = person.name;
    this.age = person.age;
  }

  // Method to display details
  void displayDetails(){
    System.out.println("Name of person is : " + name);
    System.out.println("Age of person is : " + age);
  }
}

public class PersonDetails {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    // Enter name of person
    System.out.print("Enter name of person : ");
    String name = input.nextLine();

    // Enter age of person
    System.out.print("Enter age of person : ");
    int age = input.nextInt();

    // Parameterized constructor called
    System.out.println("\nParameterized constructor called....");
    Person person1 = new Person(name, age);
    person1.displayDetails();

    // Copy constructor called
    System.out.println("\nCopy constructor called....");
    Person person2 = new Person(person1);
    person2.displayDetails();

    input.close();
  }
}