// Define the BankAccount class
class BankAccount {
    // Attributes
    String accountHolder;
    int accountNumber;
    double balance;

    // Constructor to initialize the attributes
    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew ₹" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance! Withdrawal failed.");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    // Method to display the current balance
    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
    }


// Main class to test the BankAccount class

    public static void main(String[] args) {
        // Creating a new BankAccount object
        BankAccount account = new BankAccount("Alice Johnson", 123456789, 5000.0);

        // Display initial balance
        account.displayBalance();

        // Deposit money
        account.deposit(2000.0);

        // Withdraw money
        account.withdraw(1500.0);

        // Attempt to withdraw more than the current balance
        account.withdraw(6000.0);

        // Display final balance
        account.displayBalance();
    }

}