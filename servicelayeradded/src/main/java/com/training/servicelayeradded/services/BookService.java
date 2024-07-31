package com.training.servicelayeradded.services;
import com.training.servicelayeradded.entities.Book;

import java.util.List;

public interface BookService {

    //how to find all books
    //public void m1() ;

    public List<Book> listAllBooks();

    public Book addBook(Book b);


}
