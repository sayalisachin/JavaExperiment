// Abstraction Example
/*Create an abstract class 'Bank' with an abstract method 'getBalance'. 
$100, $150 and $200 are deposited in banks A, B and C respectively. 
'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'. 
Call this method by creating an object of each of the three classes.*/


package standard_code;

abstract class Bank {
    public abstract int getBalance();
}

class BankA extends Bank {
    private int balance;

    public BankA() {
        balance = 100;
    }

    public int getBalance() {
        return balance;
    }
}

class BankB extends Bank {
    private int balance;

    public BankB() {
        balance = 150;
    }

    public int getBalance() {
        return balance;
    }
}

class BankC extends Bank {
    private int balance;

    public BankC() {
        balance = 200;
    }

    public int getBalance() {
        return balance;
    }
}

public class BankExample {
    public static void main(String[] args) {
        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();

        System.out.println("Bank A Balance: $" + bankA.getBalance());
        System.out.println("Bank B Balance: $" + bankB.getBalance());
        System.out.println("Bank C Balance: $" + bankC.getBalance());
    }
}

