package com.training.servicelayeradded.repo;

import com.training.servicelayeradded.entities.Author;
import com.training.servicelayeradded.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BookRepo extends JpaRepository<Book,Long> {

    public List<Book> findByTitle(String title);

    public List<Book> findByAuthor(Author author);


}
