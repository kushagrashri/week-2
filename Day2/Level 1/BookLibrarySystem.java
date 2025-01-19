// Parent class: Book
class Book {

  // Attributes of the Book class
  public String ISBN;
  protected String title;
  private String author; 

  // Constructor to initialize ISBN, title, and author for the book
  Book(String ISBN, String title, String author) {
    this.ISBN = ISBN; 
    this.title = title;   
    this.author = author; 
  }

  // Public method to set the author's name (used to update the private author field)
  public void setAuthor(String author) {
    this.author = author;
  }

  // Public method to get the author's name (used to access the private author field)
  public String getAuthor() {
    return author;
  }
}

// Subclass: EBook (inherits from Book)
class EBook extends Book {

  // Constructor of EBook that calls the constructor of the Book class
  EBook(String ISBN, String title, String author) {

     // Calls the constructor of the parent class (Book)
    super(ISBN, title, author);
  }

  // Method to display details of the EBook
  public void displayDetails() {

    // Access protected field from the parent class
    System.out.println("Title of Book  : " + title);
    System.out.println("ISBN of Book   : " + ISBN);
  }
}

// Main class to demonstrate the functionality of the Book and EBook classes
public class BookLibrarySystem {
  public static void main(String[] args) {
    
    // Create a Book object using the parameterized constructor
    Book book = new Book("978-3-16-148410-0", "Java Programming", "John Doe");

    // Display details of the Book object
    System.out.println("\nGetting details by Book class.....\n");
    System.out.println("ISBN of book is : " + book.ISBN);
    System.out.println("Title of book is : " + book.title);
    // Access private author using getter
    System.out.println("Author of book is : " + book.getAuthor());

    // Update the author of the book using the setter method
    book.setAuthor("Updated Author");
    System.out.println("Updated author of book is : " + book.getAuthor());

    // Create an EBook object using the parameterized constructor
    System.out.println("\nGetting details by EBook class.....\n");
    EBook ebook = new EBook("978-3-16-148410-1", "Java Concepts", "Johny");
    ebook.displayDetails();
    // Access the author of EBook via getter
    System.out.println("Author of book is : " + ebook.getAuthor());

    // Update the author of the EBook using the setter method
    ebook.setAuthor("New Author");
    // Display updated author of EBook
    System.out.println("Updated author of book is : " + ebook.getAuthor());
  }
}
