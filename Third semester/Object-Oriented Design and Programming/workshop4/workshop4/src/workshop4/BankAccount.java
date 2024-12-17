/* Write a class BankAccount with methods deposit(double amount) and withdraw(double 
amount). The account balance should start at 0.0, and the methods should update the 
balance accordingly.  

Write a JUnit test that: 
● Ensures a deposit of 100.0 increases the balance to 100.0. 
● Ensures a withdrawal of 50.0 decreases the balance to 50.0. 
● Verifies that a withdrawal of 60.0 fails (balance should remain 50.0)*/
package workshop4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

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
	
	
	@Test
	void testdeposite(){
		BankAccount account = new BankAccount();
		account.deposite(100.0);
		assertEquals(100.0,account.getbalance());
		
	}
	@Test
	void testwithdraw() {
		BankAccount account = new BankAccount();
		account.deposite(100.0);
		boolean testssucess=account.withdrawal(50.0);
		assertTrue(testssucess);
		assertEquals(50.0,account.getbalance());
	}
	@Test
	void testfailwithdraw() {
		BankAccount account = new BankAccount();
		account.deposite(100.0);
		account.withdrawal(50.0);
		boolean testssucess=account.withdrawal(60.0);
		assertFalse(testssucess);
		assertEquals(50.0,account.getbalance());
	}
		
	
	

}
