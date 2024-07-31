package com.training.servicelayeradded.repo;

import com.training.servicelayeradded.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface AuthorRepo extends JpaRepository<Author,Long> {
}
