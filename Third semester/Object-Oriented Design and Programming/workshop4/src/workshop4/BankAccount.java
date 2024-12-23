/* Write a class BankAccount with methods deposit(double amount) and withdraw(double 
amount). The account balance should start at 0.0, and the methods should update the 
balance accordingly.  

Write a JUnit test that: 
● Ensures a deposit of 100.0 increases the balance to 100.0. 
● Ensures a withdrawal of 50.0 decreases the balance to 50.0. 
● Verifies that a withdrawal of 60.0 fails (balance should remain 50.0)*/
package workshop4;
class BankAccount {
	 double balance = 0;
	 
	public void deposite(double amount) {
		if(amount > 0 ) {
			balance +=amount;
		}
	
	}
	public boolean withdrawal(double amount) {
		if(balance >= amount && amount > 0) {
			balance -=amount;
		return true;
		}
		return false;
	}
	
	public double getbalance() {
		return balance;
	}
	
	

}
