
public class Q12 {
    private String accountNumber;
    private double balance;
    private String accountHolderName;
    private String accountHolderAddress;

    // Constructor
    public Q12(String accountNumber, double balance, String accountHolderName, String accountHolderAddress) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
        this.accountHolderAddress = accountHolderAddress;
    }

    // Getter method for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter method for balance
    public double getBalance() {
        return balance;
    }

    // Getter method for accountHolderName
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Getter method for accountHolderAddress
    public String getAccountHolderAddress() {
        return accountHolderAddress;
    }

    // Other methods remain the same...

    public static void main(String[] args) {
        // Create a BankAccount object
        Q12 account = new Q12("123456789", 875800.0, "Dipesh Mahato", "kawai");

        // Access balance using the getter method
        System.out.println("Balance: $" + account.getBalance());
    }
}
