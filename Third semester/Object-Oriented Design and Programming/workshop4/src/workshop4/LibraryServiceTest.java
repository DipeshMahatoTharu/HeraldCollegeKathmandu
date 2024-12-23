package workshop4;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LibraryServiceTest {

	 private LibraryService libraryService;

	    @BeforeAll
	    static void setUpBeforeClass() {
	        System.out.println("Starting LibraryService Tests");
	    }

	    @AfterAll
	    static void tearDownAfterClass() {
	        System.out.println("All LibraryService Tests Completed");
	    }

	    @BeforeEach
	    void setUp() {
	        libraryService = new LibraryService();
	        System.out.println("Initializing LibraryService for Test");
	    }

	    @AfterEach
	    void tearDown() {
	        System.out.println("Test Completed\n");
	    }

	    @Test
	    void testAddBook() {
	        libraryService.addBook("Java");
	        assertTrue(libraryService.searchBook("Java"));
	    }

	    @Test
	    void testSearchBookFound() {
	        libraryService.addBook("Clean Code");
	        assertTrue(libraryService.searchBook("Clean Code"));
	    }

	    @Test
	    void testSearchBookNotFound() {
	        assertFalse(libraryService.searchBook("Heraldcollege Book"));
	    }

}
