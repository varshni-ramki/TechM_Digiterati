package libraryManagement;
import java.io.*;
import java.util.*;
import java.util.concurrent.*;

class Book implements Serializable {
    private final String title, author, ISBN;
    private boolean isBorrowed;
    
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isBorrowed = false;
    }
    
    public String getISBN() { return ISBN; }
    public String getTitle() { return title; }
    public boolean isBorrowed() { return isBorrowed; }
    public void setBorrowed(boolean status) { isBorrowed = status; }
}