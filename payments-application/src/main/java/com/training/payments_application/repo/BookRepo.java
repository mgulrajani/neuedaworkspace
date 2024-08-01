package com.training.payments_application.repo;

import com.training.payments_application.entities.Author;
import com.training.payments_application.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BookRepo extends JpaRepository<Book,Long> {

    public List<Book> findByTitle(String title);


}
