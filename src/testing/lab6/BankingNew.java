import java.util.Scanner;

class Account {
    private String customerName;
    private int accountNumber;
    private String accountType;
    protected double balance;

    public Account(String customerName, int accountNumber, String accountType) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of $" + amount + " successful.");
    }

    public void displayBalance() {
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Current Balance: $" + balance);
    }

    public void computeInterest() {
        // Subclasses will override this method for specific interest calculations (if applicable).
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

    public void checkMinimumBalance() {
        // Subclasses will override this method to implement minimum balance checks and penalties.
    }
}

class CurrentAccount extends Account {
    public CurrentAccount(String customerName, int accountNumber) {
        super(customerName, accountNumber, "Current Account");
    }

    @Override
    public void computeInterest() {
        // Current account has no interest computation.
        System.out.println("No interest applicable for Current Account.");
    }

    @Override
    public void checkMinimumBalance() {
        // Current account has no minimum balance check.
        System.out.println("No minimum balance check for Current Account.");
    }
}

class SavingsBankAccount extends Account {
    private double interestRate;
    private double minimumBalance;

    public SavingsBankAccount(String customerName, int accountNumber, double interestRate, double minimumBalance) {
        super(customerName, accountNumber, "Savings Bank Account");
        this.interestRate = interestRate;
        this.minimumBalance = minimumBalance;
    }

    @Override
    public void computeInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest of $" + interest + " added to your account.");
    }

    @Override
    public void checkMinimumBalance() {
        if (balance < minimumBalance) {
            double penalty = 10.0; // You can set the penalty amount as needed.
            balance -= penalty;
            System.out.println("Minimum balance not maintained. Penalty of $" + penalty + " imposed.");
        }
    }
}

public class BankingNew   {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter customer name: ");
        String customerName = scanner.nextLine();
        System.out.println("Enter account number: ");
        int accountNumber = scanner.nextInt();

        System.out.println("Select account type (1 for Current, 2 for Savings): ");
        int accountTypeChoice = scanner.nextInt();

        Account account;
        if (accountTypeChoice == 1) {
            account = new CurrentAccount(customerName, accountNumber);
        } else if (accountTypeChoice == 2) {
            System.out.println("Enter interest rate (e.g., 3.5 for 3.5%): ");
            double interestRate = scanner.nextDouble();
            System.out.println("Enter minimum balance: ");
            double minimumBalance = scanner.nextDouble();
            account = new SavingsBankAccount(customerName, accountNumber, interestRate, minimumBalance);
        } else {
            System.out.println("Invalid account type choice.");
            return;
        }

        while (true) {
            System.out.println("\nSelect operation:");
            System.out.println("1. Deposit");
            System.out.println("2. Display Balance");
            System.out.println("3. Compute Interest");
            System.out.println("4. Withdraw");
            System.out.println("5. Check Minimum Balance");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    account.displayBalance();
                    break;
                case 3:
                    account.computeInterest();
                    break;
                case 4:
                    System.out.println("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;
                case 5:
                    account.checkMinimumBalance();
                    break;
                default:
                    System.out.println("Invalid choice. Exiting.");
                    scanner.close();
                    return;
            }
        }
    }
}
