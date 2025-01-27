// Reservable interface with methods to reserve items and check availability
interface Reservable {
  void reserveItem(); // Method to reserve an item

  boolean checkAvailability(); // Method to check if an item is available
}

// Abstract class LibraryItem with fields and methods common to all library
// items
abstract class LibraryItem implements Reservable {
  private String itemId;
  private String title;
  private String author;
  private boolean isAvailable;

  // Constructor to initialize the common fields for library items
  LibraryItem(String itemId, String title, String author) {
    this.itemId = itemId;
    this.title = title;
    this.author = author;
    this.isAvailable = true; // Default to available
  }

  // Getter and setter methods for encapsulating fields
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public boolean isAvailable() {
    return isAvailable;
  }

  public void setAvailability(boolean isAvailable) {
    this.isAvailable = isAvailable;
  }

  // Concrete method to get the details of a library item
  public void getItemDetails() {
    System.out.println("Item ID: " + itemId);
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
  }

  // Abstract method to get the loan duration for different types of items
  abstract public int getLoanDuration();
}

// Book subclass that overrides getLoanDuration for book-specific logic
class Book extends LibraryItem {

  Book(String itemId, String title, String author) {
    super(itemId, title, author);
  }

  // Book typically has a 14-day loan duration
  @Override
  public int getLoanDuration() {
    return 14;
  }

  // Override the reserveItem method from Reservable interface
  @Override
  public void reserveItem() {
    if (isAvailable()) {
      setAvailability(false);
      System.out.println("The book '" + getTitle() + "' has been reserved.");
    } else {
      System.out.println("The book '" + getTitle() + "' is not available for reservation.");
    }
  }

  // Override the checkAvailability method from Reservable interface
  @Override
  public boolean checkAvailability() {
    return isAvailable();
  }
}

// Magazine subclass that overrides getLoanDuration for magazine-specific logic
class Magazine extends LibraryItem {

  Magazine(String itemId, String title, String author) {
    super(itemId, title, author);
  }

  // Magazine typically has a 7-day loan duration
  @Override
  public int getLoanDuration() {
    return 7;
  }

  @Override
  public void reserveItem() {
    if (isAvailable()) {
      setAvailability(false);
      System.out.println("The magazine '" + getTitle() + "' has been reserved.");
    } else {
      System.out.println("The magazine '" + getTitle() + "' is not available for reservation.");
    }
  }

  @Override
  public boolean checkAvailability() {
    return isAvailable();
  }
}

// DVD subclass that overrides getLoanDuration for DVD-specific logic
class DVD extends LibraryItem {

  DVD(String itemId, String title, String author) {
    super(itemId, title, author);
  }

  // DVD typically has a 3-day loan duration
  @Override
  public int getLoanDuration() {
    return 3;
  }

  @Override
  public void reserveItem() {
    if (isAvailable()) {
      setAvailability(false);
      System.out.println("The DVD '" + getTitle() + "' has been reserved.");
    } else {
      System.out.println("The DVD '" + getTitle() + "' is not available for reservation.");
    }
  }

  @Override
  public boolean checkAvailability() {
    return isAvailable();
  }
}

// Main class to demonstrate the Library Management System
public class LibraryManagementSystem {
  public static void main(String[] args) {
    // Create library items of different types
    LibraryItem book = new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald");
    LibraryItem magazine = new Magazine("M001", "National Geographic", "Various");
    LibraryItem dvd = new DVD("D001", "Inception", "Christopher Nolan");

    // Display details of library items
    book.getItemDetails();
    System.out.println("Loan Duration: " + book.getLoanDuration() + " days\n");

    magazine.getItemDetails();
    System.out.println("Loan Duration: " + magazine.getLoanDuration() + " days\n");

    dvd.getItemDetails();
    System.out.println("Loan Duration: " + dvd.getLoanDuration() + " days\n");

    // Test reservation and availability
    book.reserveItem();
    magazine.reserveItem();
    dvd.reserveItem();

    // Checking availability after reservation
    System.out.println("\nChecking availability after reservation:");
    System.out.println("Is the book available? " + book.checkAvailability());
    System.out.println("Is the magazine available? " + magazine.checkAvailability());
    System.out.println("Is the DVD available? " + dvd.checkAvailability());
  }
}
