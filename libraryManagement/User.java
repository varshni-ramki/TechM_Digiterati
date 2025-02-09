package libraryManagement;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;

class User implements Serializable {
    private final String name, userID;
    private final List<Book> borrowedBooks = new ArrayList<>();
    
    public User(String name, String userID) {
        this.name = name;
        this.userID = userID;
    }
    
    public String getUserID() { return userID; }
    public List<Book> getBorrowedBooks() { return borrowedBooks; }
}
