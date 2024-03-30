class Q9 {
    String accountNumber;
    double balance;
    String accountHolderName;
    String accountHolderAddress;

    // Parameterized constructor
    Q9(String accNumber, double bal, String holderName, String holderAddress) {
        accountNumber = accNumber;
        balance = bal;
        accountHolderName = holderName;
        accountHolderAddress = holderAddress;
    }

    // Method to display account details
    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Holder Address: " + accountHolderAddress);
        System.out.println("Balance: $" + balance);
    }

    public static void main(String[] args) {
        // Creating an object of the Q9 class using the parameterized constructor
        Q9 account = new Q9("123456789", 10000000.0, "Asiya", "Kathmandu");

        // Displaying account details
        account.displayAccountDetails();
    }
}