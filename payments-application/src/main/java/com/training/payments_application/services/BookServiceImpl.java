package com.training.payments_application.services;

import com.training.payments_application.entities.Book;
import com.training.payments_application.exceptions.BookNotFoundException;
import com.training.payments_application.repo.BookRepo;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

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

    @Override
    public List<Book> findTitles(String title) {
        return repo.findByTitle(title);

    }

    @Override
    public Book updateBook(Long id, Book b) throws BookNotFoundException {
        Book book =  findBook(id);  //this book instance is retrieved from the db

        System.out.println(book);
        if(Objects.nonNull(b.getTitle()) && !"".equalsIgnoreCase(b.getTitle())){
            book.setTitle(b.getTitle());
        }
        book.setDateOfPublishing(b.getDateOfPublishing());

        repo.save(book);
        return book;



    }

    @Override
    public Book findBook(Long id) throws BookNotFoundException {
       Book  foundBook = repo.findById(id).orElseThrow(()->new BookNotFoundException(("book with this id  does not exist")));
       return foundBook;


    }


}
