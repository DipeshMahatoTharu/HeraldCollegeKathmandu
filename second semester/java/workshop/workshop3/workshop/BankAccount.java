  
//
import java.util.Scanner;

public class BankAccount {



	String accountNumber, accountHolderName, accountHolderAddress;

	double balance;

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		BankAccount account = new BankAccount();
		account.accountNumber = "0993813419414149";
		account.accountHolderName = "Dipesh";
		account.accountHolderAddress = "Kalopul";
		account.balance = 10000;
		System.out.println("The Account Holder is: " + account.accountHolderName);
		System.out.println("The Account Number is: " + account.accountNumber);
		System.out.println("The Account Holder Address is: " + account.accountHolderAddress);
		System.out.println("The Account Balance is: " + account.balance);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount to deposit: ");
		double deposit = sc.nextDouble();
		System.out.println("Balance After Depositing Rs." + deposit + " is Rs." + account.depositMoney(deposit));
		System.out.println("Enter amount to windraw: ");
		double withdraw = sc.nextDouble();
		System.out.println("Balance After Withdrawing Rs." + withdraw + " is Rs." + account.withdrawMoney(withdraw));

	}
	public double depositMoney(double deposit) {
		return this.balance += deposit;
	}



	public double withdrawMoney(double withdraw) {

		return this.balance -= withdraw;

	}



}