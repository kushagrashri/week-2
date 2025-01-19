class Book{

  // Attributes
  private String title;
  private String author;
  private double price;

  // Default constructor
  Book(){
    this.title = "Default title";
    this.author = "Default author";
    this.price = 100;
  }

  // Parameterized constructor
  Book(String title, String author, double price){
    this.title = title;
    this.author = author;
    this.price = price;
  }

  // Method to display details
  void displayDetails(){
    System.out.println("Title of book is : " + title);
    System.out.println("Author of book is : " + author);
    System.out.println("Price of book is : " + price);
  }
}

public class BookDetails {
  public static void main(String[] args){

    // Default constructor called
    System.out.println("\nDefault constructor called....");
    Book book1 = new Book();
    book1.displayDetails();

    // Parameterized constructor called
    System.out.println("\nParameterized constructor called....");
    Book book2 = new Book("Random Book", "Random Author", 200);
    book2.displayDetails();
  }
}