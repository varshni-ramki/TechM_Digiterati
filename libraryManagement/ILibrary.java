package libraryManagement;
import java.io.*;
import java.util.*;

import libraryManagement.Exceptions.BookNotFoundException;
import libraryManagement.Exceptions.MaxBooksAllowedException;
import libraryManagement.Exceptions.UserNotFoundException;

interface ILibrary {
    void borrowBook(String ISBN, String userID) throws BookNotFoundException, UserNotFoundException, MaxBooksAllowedException;
    void returnBook(String ISBN, String userID) throws BookNotFoundException, UserNotFoundException;
    Book searchBook(String title);
}

