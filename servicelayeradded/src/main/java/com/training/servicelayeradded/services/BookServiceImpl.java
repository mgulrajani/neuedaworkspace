package com.training.servicelayeradded.services;

import com.training.servicelayeradded.entities.Book;
import com.training.servicelayeradded.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements  BookService{

    @Autowired
    private BookRepo repo;


    @Override
    public List<Book> listAllBooks() {
        return repo.findAll();

    }

    @Override
    public Book addBook(Book b) {
        Book newlyAddedBook = repo.save(b);

        return newlyAddedBook;

    }
}
