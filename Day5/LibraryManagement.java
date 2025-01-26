// Base class representing a general Book
class Book {
  String title;
  int publicationYear;

  // Constructor to initialize the Book details
  Book(String title, int publicationYear) {
    this.title = title;
    this.publicationYear = publicationYear;
  }

  // Method to display book information
  public void displayInfo() {
    System.out.println("\nTitle of the book is         : " + title);
    System.out.println("Publication year of the book is: " + publicationYear);
  }
}

// Subclass representing an Author
class Author extends Book {
  String name;
  String bio;

  // Constructor to initialize Author and Book details
  Author(String title, int publicationYear, String name, String bio) {
    super(title, publicationYear);
    this.name = name;
    this.bio = bio;
  }

  // Overriding displayInfo to include author-specific details
  @Override
  public void displayInfo() {
    super.displayInfo();
    System.out.println("Author's name is             : " + name);
    System.out.println("Author's biography is        : " + bio);
  }
}

// Main class to demonstrate the Library Management
public class LibraryManagement {
  public static void main(String[] args) {
    // Creating an Author object with Book details
    Author book1 = new Author("Basic Java", 2021, "Sachin", "A student");
    book1.displayInfo(); // Displaying information about the book and author

    // Creating another Author object with Book details
    Author book2 = new Author("Basic C++", 2022, "Duggu", "A Proffessor");
    book2.displayInfo(); // Displaying information about the book and author
  }
}
