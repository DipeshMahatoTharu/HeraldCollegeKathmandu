package demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Databaseconnection {

	
	private String databaseConnection;

	@Before
	public void connectToDatabase() {

		databaseConnection = "Connected to database";
		System.out.println("Setup: " + databaseConnection);
	}

	@After
	public void closeDatabaseConnection() {

		databaseConnection = null;
		System.out.println("datebase should be close");
	}

	@Test
	public void testDatabaseOperation() {

		System.out.println("test" + databaseConnection);

		assert databaseConnection != null : "Test base should be tested";
	}
}
