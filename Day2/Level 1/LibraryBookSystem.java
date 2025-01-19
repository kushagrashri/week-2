class Book {

  // Attributes
  private String title;
  private String author;
  private double price;
  private boolean availability;

  // Default constructor
  Book() {
    this.title = "Unknown Title";
    this.author = "Unknown Author";
    this.price = 0.0;
    this.availability = true; // Default is available
  }

  // Parameterized constructor
  Book(String title, String author, double price, boolean availability) {
    this.title = title;
    this.author = author;
    this.price = price;
    this.availability = availability;
  }

  // Method to display book details
  void displayDetails() {
    System.out.println("Book Title       : " + title);
    System.out.println("Book Author      : " + author);
    System.out.println("Book Price       : $" + price);
    System.out.println("Availability     : " + (availability ? "Available" : "Not Available"));
  }

  // Method to borrow a book
  void borrowBook() {
    if (availability) {
      availability = false;
      System.out.println("You have successfully borrowed \"" + title + "\".");
    } else {
      System.out.println("Sorry, \"" + title + "\" is currently not available.");
    }
  }
}

public class LibraryBookSystem {
  public static void main(String[] args) {

    // Create a book using the parameterized constructor
    Book book1 = new Book("The Alchemist", "Paulo Coelho", 10.99, true);

    // Display book details
    System.out.println("Book Details:");
    book1.displayDetails();

    // Attempt to borrow the book
    System.out.println("\nAttempting to borrow the book...");
    book1.borrowBook();

    // Display book details after borrowing
    System.out.println("\nBook Details After Borrowing:");
    book1.displayDetails();

    // Attempt to borrow the book again
    System.out.println("\nAttempting to borrow the book again...");
    book1.borrowBook();
  }
}
