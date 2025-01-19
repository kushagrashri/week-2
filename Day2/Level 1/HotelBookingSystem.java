class HotelBooking {

  // Attributes
  private String guestName;
  private String roomType;
  private int nights;

  // Default constructor
  HotelBooking() {
    this.guestName = "Default Guest";
    this.roomType = "Standard Room";
    this.nights = 1;
  }

  // Parameterized constructor
  HotelBooking(String guestName, String roomType, int nights) {
    this.guestName = guestName;
    this.roomType = roomType;
    this.nights = nights;
  }

  // Copy constructor
  HotelBooking(HotelBooking booking) {
    this.guestName = booking.guestName;
    this.roomType = booking.roomType;
    this.nights = booking.nights;
  }

  // Method to display booking details
  void displayBookingDetails() {
    System.out.println("Guest Name : " + guestName);
    System.out.println("Room Type  : " + roomType);
    System.out.println("Nights     : " + nights);
  }
}

public class HotelBookingSystem {
  public static void main(String[] args) {

    // Using default constructor
    System.out.println("\nDefault Constructor:");
    HotelBooking defaultBooking = new HotelBooking();
    defaultBooking.displayBookingDetails();

    // Using parameterized constructor
    System.out.println("\nParameterized Constructor:");
    HotelBooking parameterizedBooking = new HotelBooking("Sachin", "Deluxe Room", 3);
    parameterizedBooking.displayBookingDetails();

    // Using copy constructor
    System.out.println("\nCopy Constructor:");
    HotelBooking copiedBooking = new HotelBooking(parameterizedBooking);
    copiedBooking.displayBookingDetails();
  }
}
