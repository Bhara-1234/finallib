package com.example.lastlibrary.contractor;

import java.util.ArrayList;

import com.example.lastlibrary.models.Book;
import com.example.lastlibrary.models.BookPublishers;

public interface BooksInterface {
	
 public ArrayList<Book> getBooks();
 public ArrayList<BookPublishers> getPublishers();
public void addBook(Book book);
public void deleteBook(int id);
public void updateBook(Book book);

}
