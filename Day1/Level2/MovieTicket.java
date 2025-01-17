public class MovieTicket {
    // Attributes
    String movieName;
    int seatNumber;
    double price;

    // Constructor to initialize a MovieTicket
    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = -1; // Unassigned seat initially
        this.price = 0.0; // No price until a ticket is booked
    }

    // Method to book a ticket (assign seat and update price)
    public void bookTicket(int seatNumber, double price) {
        if (this.seatNumber != -1) {
            System.out.println("The ticket is already booked for seat number " + this.seatNumber + ".");
        } else {
            this.seatNumber = seatNumber;
            this.price = price;
            System.out.println("Ticket successfully booked for seat number " + seatNumber + " at ₹" + price + ".");
        }
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        if (seatNumber == -1) {
            System.out.println("No ticket booked for the movie \"" + movieName + "\".");
        } else {
            System.out.println("Movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: ₹" + price);
        }
    }

    // Main method to test the MovieTicket class
    public static void main(String[] args) {
        // Create a MovieTicket object for a specific movie
        MovieTicket ticket = new MovieTicket("Inception");

        // Display initial ticket details
        ticket.displayTicketDetails();

        // Book a ticket
        ticket.bookTicket(12, 250.0);

        // Attempt to book the ticket again
        ticket.bookTicket(15, 300.0);

        // Display updated ticket details
        ticket.displayTicketDetails();
    }
}
