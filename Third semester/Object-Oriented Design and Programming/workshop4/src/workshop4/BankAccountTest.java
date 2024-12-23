package workshop4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountTest {


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
