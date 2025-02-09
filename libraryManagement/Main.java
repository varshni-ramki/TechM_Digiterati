package libraryManagement;
import java.io.*;
import java.util.*;
import java.util.concurrent.*;

public class Main {
	  public static void main(String[] args) {
	        LibraryManager library = new LibraryManager();

	        library.addBook(new Book("Java Basics", "John Doe", "ISBN123"));
	        library.addBook(new Book("Data Structures", "Alice Smith", "ISBN456"));
	        library.addUser(new User("Alice", "U1"));
	        library.addUser(new User("Bob", "U2"));

	        ExecutorService executor = Executors.newFixedThreadPool(2);
	        executor.execute(() -> {
	            try { library.borrowBook("ISBN123", "U1"); } catch (Exception e) { System.out.println(e.getMessage()); }
	        });
	        executor.execute(() -> {
	            try { library.returnBook("ISBN123", "U1"); } catch (Exception e) { System.out.println(e.getMessage()); }
	        });
	        executor.shutdown();
	    }

}
