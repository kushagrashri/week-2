// Class representing a Bank Account
class BankAccount {
    // Static variable for the bank's name (shared across all bank accounts)
    static String bankName = "Fraud Bank";

    // Static variable to track the total number of accounts (shared across all bank accounts)
    static int numberOfAccount = 0;

    // Instance variable for the account holder's name (unique for each account)
    public String accountHolderName;

    // Final variable for the account number (unique for each account and cannot be changed after initialization)
    final long accountNumber;

    // Constructor to initialize a BankAccount object
    BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName; // Assign the account holder's name
        this.accountNumber = accountNumber;         // Assign the account number
        numberOfAccount++;                          // Increment the total number of accounts
    }

    // Static method to get the total number of accounts
    static int getTotaAccounts() {
        return numberOfAccount; // Return the total number of accounts
    }

    // Instance method to display the details of the bank account
    void getDetails() {
        System.out.println("\nThe name of the account holder: " + accountHolderName);
        System.out.println("Account number: " + accountNumber);
    }
}

// Main class to simulate the bank account system
public class BankAccountSystem {
    public static void main(String[] args) {
        // Print the bank name (accessed using the class name as it is static)
        System.out.println("\nThe bank name is: " + BankAccount.bankName);

        // Create the first bank account
        BankAccount account1 = new BankAccount("Kushagra", 147258369);

        // Check if account1 is an instance of the BankAccount class
        if (account1 instanceof BankAccount) {
            account1.getDetails(); // Display the details of the first account
        } else {
            System.out.println("account1 is not an instance of BankAccount");
        }

        // Create the second bank account
        BankAccount account2 = new BankAccount("Sachin", 123456789);

        // Check if account2 is an instance of the BankAccount class
        if (account2 instanceof BankAccount) {
            account2.getDetails(); // Display the details of the second account
        } else {
            System.out.println("account2 is not an instance of BankAccount");
        }

        // Display the total number of bank accounts
        System.out.println("\nThe total number of Accounts are: " + BankAccount.getTotaAccounts());
    }
}
