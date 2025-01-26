// Base class representing a Bank Account
class BankAccount {
  String accountNumber; // Account number
  double balance;       // Account balance

  // Constructor to initialize account number and balance
  BankAccount(String accountNumber, double balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  // Method to display common account details
  public void displayAccountType() {
    System.out.println("Account number is  : " + accountNumber);
    System.out.println("Account balance is : " + balance);
  }
}

// Subclass representing a Savings Account, inheriting from BankAccount
class SavingsAccount extends BankAccount {
  int interestRate; // Interest rate for the savings account

  // Constructor to initialize account number, balance, and interest rate
  SavingsAccount(String accountNumber, double balance, int interestRate) {
    super(accountNumber, balance); // Call the constructor of the superclass (BankAccount)
    this.interestRate = interestRate;
  }

  // Overriding displayAccountType to include savings account specific details
  @Override
  public void displayAccountType() {
    super.displayAccountType(); // Call the base class method to display basic account info
    System.out.println("Interest rate is : " + interestRate + "%");
  }
}

// Subclass representing a Checking Account, inheriting from BankAccount
class CheckingAccount extends BankAccount {
  int withdrawalLimit; // Withdrawal limit for the checking account

  // Constructor to initialize account number, balance, and withdrawal limit
  CheckingAccount(String accountNumber, double balance, int withdrawalLimit) {
    super(accountNumber, balance); // Call the constructor of the superclass (BankAccount)
    this.withdrawalLimit = withdrawalLimit;
  }

  // Overriding displayAccountType to include checking account specific details
  @Override
  public void displayAccountType() {
    super.displayAccountType(); // Call the base class method to display basic account info
    System.out.println("Withdrawal Limit is : " + withdrawalLimit + " RS");
  }
}

// Main class to test BankAccount, SavingsAccount, and CheckingAccount
public class BankAccountTypes {
  public static void main(String[] args) {
    
    // Creating objects for different account types
    BankAccount bankAccount = new BankAccount("123456", 1000.0);
    SavingsAccount savingsAccount = new SavingsAccount("234567", 2000.0, 5);
    CheckingAccount checkingAccount = new CheckingAccount("345678", 1500.0, 500);

    // Displaying account details for each account type
    System.out.println("Displaying Bank Account details:");
    bankAccount.displayAccountType();
    
    System.out.println("\nDisplaying Savings Account details:");
    savingsAccount.displayAccountType();
    
    System.out.println("\nDisplaying Checking Account details:");
    checkingAccount.displayAccountType();
  }
}
