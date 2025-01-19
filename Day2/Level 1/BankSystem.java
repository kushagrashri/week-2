// Parent class: BankAccount
class BankAccount {

  // Attributes
  public String accountNumber; 
  protected String accountHolder;
  private double balance; 

  // Constructor to initialize account details
  BankAccount(String accountNumber, String accountHolder, double balance) {
    this.accountNumber = accountNumber; 
    this.accountHolder = accountHolder; 
    this.balance = balance;
  }

  // Public method to get the balance (getter)
  public double getBalance() {
    return balance; 
  }

  // Public method to set the balance (setter)
  public void setBalance(double balance) {
    if (balance >= 0) { 
      this.balance = balance;
    } else {
      System.out.println("Balance cannot be negative.");
    }
  }

  // Public method to deposit money into the account
  public void deposit(double amount) {
    if (amount > 0) { // Ensure deposit is positive
      balance += amount; // Add deposit to balance
      System.out.println("Deposited: RS " + amount);
    } else {
      System.out.println("Deposit amount must be positive.");
    }
  }

  // Public method to withdraw money from the account
  public void withdraw(double amount) {
    if (amount > 0 && amount <= balance) { // Ensure withdrawal amount is valid
      balance -= amount; // Deduct amount from balance
      System.out.println("Withdrawn: RS " + amount);
    } else {
      System.out.println("Invalid withdrawal amount.");
    }
  }
}

// Subclass: SavingsAccount (inherits from BankAccount)
class SavingsAccount extends BankAccount {

  // Constructor for SavingsAccount that calls the constructor of the parent BankAccount class
  SavingsAccount(String accountNumber, String accountHolder, double balance) {
     // Initialize parent class (BankAccount) with the given values
    super(accountNumber, accountHolder, balance);
  }

  // Method to display details of the savings account
  public void displayDetails() {
     // Access public accountNumber field
    System.out.println("Account Number  : " + accountNumber);
     // Access protected accountHolder field
    System.out.println("Account Holder  : " + accountHolder);
    // Access balance using getter method from BankAccount class
    System.out.println("Balance         : RS " + getBalance()); 
  }
}

// Main class to demonstrate BankAccount and SavingsAccount functionality
public class BankSystem {
  public static void main(String[] args) {

    // Create a BankAccount object
    BankAccount account = new BankAccount("123456789", "Sachin", 1000.0);

    // Access balance and modify it using public methods
    System.out.println("Initial Balance: RS " + account.getBalance());
    account.deposit(500); // Deposit money
    System.out.println("Updated Balance: RS " + account.getBalance());
    account.withdraw(200); // Withdraw money
    System.out.println("Final Balance: RS " + account.getBalance());

    // Create a SavingsAccount object
    System.out.println("\nGetting details from SavingsAccount:");
    SavingsAccount savings = new SavingsAccount("987654321", "Thakur", 5000.0);
    savings.displayDetails(); // Display details of the savings account

    // Modify balance using public method in SavingsAccount
    savings.setBalance(6000.0);
    System.out.println("Updated Balance in Savings Account: RS " + savings.getBalance());
  }
}
