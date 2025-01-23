import java.util.ArrayList;

class Bank {
    String bankName;

    Bank(String bankName) {
        this.bankName = bankName;
    }

    void openAccount(Customer customer, double initialBalance) {
        Account account = new Account(this, initialBalance); // Association with Bank
        customer.addAccount(account); // Association with Customer
        System.out.println("Now "+customer.name+" has an account in "+this.bankName);
    }
}

class Customer {
    String name;
    ArrayList<Account> accounts;

    Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    void addAccount(Account account) {
        accounts.add(account);
    }

    void viewBalance() {
        System.out.println(name + "'s Accounts:");
        for (Account account : accounts) {
            System.out.println("Bank: " + account.bank.bankName + ", Balance: " + account.balance);
        }
    }
}

class Account {
    Bank bank;
    double balance;

    Account(Bank bank, double balance) {
        this.bank = bank;
        this.balance = balance;
    }
}

public class BankSystem {
    public static void main(String[] args) {
        // Create two bank
        Bank bank1 = new Bank("SBI");
        Bank bank2 = new Bank("UBI");

        // Create customers
        Customer customer1 = new Customer("Deepansh");
        Customer customer2 = new Customer("Khare");

        // Open account
        bank1.openAccount(customer1, 10000);
        bank1.openAccount(customer2, 20000);
        bank2.openAccount(customer1, 5000);

        // View balance
        customer1.viewBalance();
        customer2.viewBalance();
    }
}
