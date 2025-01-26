// Base class representing an Animal with common properties and behaviors
class Animal {
  String name;  // Name of the animal
  int age;      // Age of the animal

  // Constructor to initialize name and age
  Animal(String name, int age) {
      this.name = name;
      this.age = age;
  }

  // Method to simulate an animal making a sound
  public void makeSound() {
      System.out.println("Animal makes sound.");
  }

  // Method to display details of the animal
  public void showDetails() {
      System.out.println("\nName of animal is : " + name);
      System.out.println("Age of animal is  : " + age);
  }
}

// Dog class inheriting from Animal class
class Dog extends Animal {

  // Constructor to initialize Dog object using parent class constructor
  Dog(String name, int age) {
      super(name, age);
  }

  // Overriding the makeSound method for Dog
  @Override
  public void makeSound() {
      System.out.println("Dog makes sound.");
  }
}

// Cat class inheriting from Animal class
class Cat extends Animal {

  // Constructor to initialize Cat object using parent class constructor
  Cat(String name, int age) {
      super(name, age);
  }

  // Overriding the makeSound method for Cat
  @Override
  public void makeSound() {
      System.out.println("Cat makes sound.");
  }
}

// Bird class inheriting from Animal class
class Bird extends Animal {

  // Constructor to initialize Bird object using parent class constructor
  Bird(String name, int age) {
      super(name, age);
  }

  // Overriding the makeSound method for Bird
  @Override
  public void makeSound() {
      System.out.println("Bird makes sound.");
  }
}

// Main class to test the functionality of the Animal hierarchy
public class AnimalHierarchy {
  public static void main(String[] args) {
      // Creating an instance of Animal class and calling its methods
      Animal animal = new Animal("Animal", 50);
      animal.makeSound();

      // Creating an instance of Dog class and calling its methods
      Dog dog = new Dog("Dog", 10);
      dog.showDetails();   // Displaying dog details
      dog.makeSound();     // Displaying dog sound

      // Creating an instance of Cat class and calling its methods
      Cat cat = new Cat("Cat", 15);
      cat.showDetails();   // Displaying cat details
      cat.makeSound();     // Displaying cat sound

      // Creating an instance of Bird class and calling its methods
      Bird bird = new Bird("Bird", 8);
      bird.showDetails();  // Displaying bird details
      bird.makeSound();    // Displaying bird sound
  }
}
