package com.training.payments_application.services;
import com.training.payments_application.entities.Book;
import com.training.payments_application.exceptions.BookNotFoundException;
import org.springframework.beans.factory.ObjectProvider;

import java.util.List;

public interface BookService {

    public List<Book> listAllBooks();  //all books

    public Book addBook(Book b);

    public List<Book> findTitles(String title);

    public Book updateBook(Long id, Book b) throws BookNotFoundException;

    public Book findBook(Long id) throws BookNotFoundException;  //byId


}
