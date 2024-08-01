package com.training.payments_application.repo;

import com.training.payments_application.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface AuthorRepo extends JpaRepository<Author,Long> {
}
