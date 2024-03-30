// Create an abstract class 'Bank' with an abstract method 'getBalance'.
//  $100, $150 and $200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', 
// each having a method named 'getBalance'.
//  Call this method by creating an object of each of the three classes.
abstract class Bank {
    abstract int getBalance();
}

class BankA extends Bank {
    private int balance = 100;

    int getBalance() {
        return balance;
    }
}

class BankB extends Bank {
    private int balance = 150;

    int getBalance() {
        return balance;
    }
}

class BankC extends Bank {
    private int balance = 200;

    int getBalance() {
        return balance;
    }
}

public class Task2 {
    public static void main(String[] args) {
        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();

        System.out.println("Balance in Bank A: $" + bankA.getBalance());
        System.out.println("Balance in Bank B : $ "+bankB.getBalance());
        System.out.println("balance in Bank C : $" +bankC.getBalance());
    }
} 