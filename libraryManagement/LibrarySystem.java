package libraryManagement;
import java.io.*;
import java.util.*;
import java.util.concurrent.*;

abstract class LibrarySystem implements ILibrary {
    protected final List<Book> books = new ArrayList<>();
    protected final List<User> users = new ArrayList<>();
    
    public abstract void addBook(Book book);
    public abstract void addUser(User user);
}