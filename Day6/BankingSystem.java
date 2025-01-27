// Loanable interface with methods to apply for a loan and calculate loan eligibility
interface Loanable {
  boolean applyForLoan(double loanAmount); // Method to apply for a loan

  boolean calculateLoanEligibility(); // Method to calculate loan eligibility
}

// Abstract class BankAccount with common fields and methods
abstract class BankAccount implements Loanable {
  private String accountNumber;
  private String holderName;
  private double balance;

  // Constructor to initialize account details
  BankAccount(String accountNumber, String holderName, double initialBalance) {
    this.accountNumber = accountNumber;
    this.holderName = holderName;
    this.balance = initialBalance;
  }

  // Getter and setter methods to encapsulate fields
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public String getHolderName() {
    return holderName;
  }

  public void setHolderName(String holderName) {
    this.holderName = holderName;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  // Concrete deposit method to add money to the balance
  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      System.out.println("Deposited: " + amount + ". New balance: " + balance);
    } else {
      System.out.println("Invalid deposit amount.");
    }
  }

  // Concrete withdraw method to withdraw money from the balance
  public void withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
      balance -= amount;
      System.out.println("Withdrawn: " + amount + ". New balance: " + balance);
    } else {
      System.out.println("Invalid withdrawal amount or insufficient balance.");
    }
  }

  // Abstract method to calculate interest, to be implemented by subclasses
  abstract public double calculateInterest();

  // Method to display account details
  public void displayAccountDetails() {
    System.out.println("\nAccount Number: " + accountNumber);
    System.out.println("Account Holder: " + holderName);
    System.out.println("Account Balance: " + balance);
  }

  // Methods from Loanable interface to apply for loan and calculate eligibility
  @Override
  public boolean applyForLoan(double loanAmount) {
    // Placeholder: A simple rule that account balance must be above 5000 to apply
    // for loan
    return balance > 5000;
  }

  @Override
  public boolean calculateLoanEligibility() {
    // Placeholder: Simple loan eligibility check based on balance
    return balance >= 10000;
  }
}

// SavingsAccount subclass that calculates interest as per savings account rules
class SavingsAccount extends BankAccount {
  private static final double INTEREST_RATE = 0.04; // 4% interest rate for savings accounts

  // Constructor to initialize SavingsAccount details
  SavingsAccount(String accountNumber, String holderName, double initialBalance) {
    super(accountNumber, holderName, initialBalance);
  }

  // Implementing abstract method to calculate interest for savings account
  @Override
  public double calculateInterest() {
    return getBalance() * INTEREST_RATE; // Interest = Balance * 4%
  }
}

// CurrentAccount subclass that calculates interest as per current account rules
class CurrentAccount extends BankAccount {
  private static final double INTEREST_RATE = 0.02; // 2% interest rate for current accounts

  // Constructor to initialize CurrentAccount details
  CurrentAccount(String accountNumber, String holderName, double initialBalance) {
    super(accountNumber, holderName, initialBalance);
  }

  // Implementing abstract method to calculate interest for current account
  @Override
  public double calculateInterest() {
    return getBalance() * INTEREST_RATE; // Interest = Balance * 2%
  }
}

// Main class to demonstrate the Banking System
public class BankingSystem {
  public static void main(String[] args) {
    // Creating objects for SavingsAccount and CurrentAccount
    BankAccount savingsAccount = new SavingsAccount("SA123", "Alice", 15000);
    BankAccount currentAccount = new CurrentAccount("CA456", "Bob", 8000);

    // Display account details and calculate interest for each account
    savingsAccount.displayAccountDetails();
    System.out.println("Savings Account Interest: " + savingsAccount.calculateInterest());

    currentAccount.displayAccountDetails();
    System.out.println("Current Account Interest: " + currentAccount.calculateInterest());

    // Demonstrating deposit and withdrawal
    savingsAccount.deposit(500);
    currentAccount.withdraw(1000);

    // Demonstrating loan eligibility
    System.out.println("\nLoan Eligibility Check:");
    System.out.println("Savings Account Loan Eligibility: " + savingsAccount.calculateLoanEligibility());
    System.out.println("Current Account Loan Eligibility: " + currentAccount.calculateLoanEligibility());
  }
}
