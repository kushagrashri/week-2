public class Book {
    // Attributes
    String title;
    String author;
    double price;

    // Constructor to initialize the attributes
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display the book details
    public void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
    }

    // Main method to test the Book class
    public static void main(String[] args) {
        // Create a Book object
        Book book = new Book("To Kill a Mockingbird", "Harper Lee", 399.99);

        // Display the book details
        book.displayDetails();
    }
}
