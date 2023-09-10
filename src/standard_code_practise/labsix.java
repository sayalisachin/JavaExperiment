package standard_code_practise;
/* Create a class that stores customers names. */

class Account{
    protected String name;
    protected int accountNumber;
    protected String accountType;
    protected double balance;

    public Account (String name, int accountNumber, String accountType, double balance){
        this.name=name;
        this.accountNumber=accountNumber;
        this.accountType=accountType;
        this.balance=balance;
    }
    public void deposit(double amount){
        balance+=amount;
        System.out.println("Deposited"+amount+"into"+accountType+"account. New balance: "+balance);
    
    }
    public void displayBalance(){
        System.out.println("Balance in "+accountType+"account: "+balance);
    }
    public void withdraw(double amount){
        if(balance>=amount) {
            balance-=amount;
            System.out.println("Withdrew "+amount+ "from "+accountType+"account. New balance: "+balance);

        }else{
            System.out.println("Insufficient balance");
        }

    }
    public void computeInterest(double rate){
        double interest=balance*rate/100;
        balance+=interest;
        System.out.println("Interest of"+interest+"is credited to"+accountType+"account. New balance: "+balance);
    }
}
class CurrentAccount extends Account{
    public CurrentAccount(String name, int accountNumber, double balance){
        super(name,accountNumber,"Current",balance);
    }
}
class SavingAccount extends Account{
    public SavingAccount(String name, int accountNumber, double balance){
        super(name,accountNumber,"Savings",balance);
    }
}
public class labsix{
    public static void main(String[] args) {
        CurrentAccount currentAccount=new CurrentAccount("Sayali", 100, 1000);
        SavingAccount savingsAccount=new SavingAccount("Sachin", 200, 500);

        currentAccount.deposit(500);
        currentAccount.displayBalance();
        currentAccount.withdraw(200);
        currentAccount.computeInterest(5);

        savingsAccount.deposit(1000);
        savingsAccount.displayBalance();
        savingsAccount.withdraw(500);
        savingsAccount.computeInterest(7);

    }
}


