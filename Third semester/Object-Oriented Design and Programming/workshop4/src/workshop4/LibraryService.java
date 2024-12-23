package workshop4;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {
	  private List<String> books = new ArrayList<>();

	    public void addBook(String book) {
	        books.add(book);
	    }

	    public boolean searchBook(String title) {
	        return books.contains(title);
	    }
}
