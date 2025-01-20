// Class representing a Book
class Book {
    // Static variable for the library's name (shared among all Book objects)
    static String libraryName = "Club Library";

    // Private instance variables for the title and author of the book
    private String title;
    private String author;

    // Final variable for the ISBN number (cannot be changed after initialization)
    final double isbn;

    // Constructor to initialize a Book object
    Book(String title, String author, double isbn) {
        this.title = title;  // Assign the title of the book
        this.author = author; // Assign the author's name
        this.isbn = isbn;    // Assign the ISBN number
    }

    // Static method to display the library's name
    static void displayLibraryName() {
        System.out.println("\nThe name of the library is: " + libraryName);
    }

    // Instance method to display the details of a book
    void displayDetails() {
        System.out.println("\nDetails of the book are:");
        System.out.println("The title is: " + title);
        System.out.println("The name of the author is: " + author);
        System.out.println("The ISBN of the book is: " + isbn);
    }
}

// Main class to manage the library system
public class LibraryMangementSystem {
    public static void main(String[] args) {
        // Display the name of the library (accessed using the class name)
        Book.displayLibraryName();

        // Create the first Book object
        Book book1 = new Book("The Conjuring", "Sachin Kumar", 07);

        // Check if book1 is an instance of the Book class
        if (book1 instanceof Book) {
            book1.displayDetails(); // Display details of the book
        } else {
            System.out.println("book1 is not an instance of the Book class");
        }

        // Create the second Book object
        Book book2 = new Book("The Ring", "Manish Kumar", 45);

        // Check if book2 is an instance of the Book class
        if (book2 instanceof Book) {
            book2.displayDetails(); // Display details of the book
        } else {
            System.out.println("book2 is not an instance of the Book class");
        }
    }
}
