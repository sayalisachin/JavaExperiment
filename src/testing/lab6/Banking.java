package testing.lab6;

// Base class
class Account {
    protected String name;
    protected int accountNumber;
    protected String accountType;
    protected double balance;

    public Account(String name, int accountNumber, String accountType, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " into " + accountType + " account. New balance: " + balance);
    }

    public void displayBalance() {
        System.out.println("Balance in " + accountType + " account: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from " + accountType + " account. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void computeInterest(double rate) {
        double interest = balance * rate / 100;
        balance += interest;
        System.out.println("Interest of " + interest + " credited to " + accountType + " account. New balance: " + balance);
    }
}

// Derived class: CurrentAccount
class CurrentAccount extends Account {
    public CurrentAccount(String name, int accountNumber, double balance) {
        super(name, accountNumber, "Current", balance);
    }

    // Additional methods specific to CurrentAccount can be added here
}

// Derived class: SavingsAccount
class SavingsAccount extends Account {
    public SavingsAccount(String name, int accountNumber, double balance) {
        super(name, accountNumber, "Savings", balance);
    }

    // Additional methods specific to SavingsAccount can be added here
}

// Main class
public class Banking {
    public static void main(String[] args) {
        // Creating instances of accounts
        CurrentAccount currentAccount = new CurrentAccount("John Doe", 1001, 1000.0);
        SavingsAccount savingsAccount = new SavingsAccount("Jane Smith", 2001, 2000.0);

        // Performing operations on accounts
        currentAccount.deposit(500.0);
        currentAccount.displayBalance();
        currentAccount.withdraw(200.0);
        currentAccount.computeInterest(5.0);

        savingsAccount.deposit(1000.0);
        savingsAccount.displayBalance();
        savingsAccount.withdraw(300.0);
        savingsAccount.computeInterest(3.0);
    }
}

