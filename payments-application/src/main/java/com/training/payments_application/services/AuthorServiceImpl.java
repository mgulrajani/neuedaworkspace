package com.training.payments_application.services;

import com.training.payments_application.entities.Author;
import com.training.payments_application.entities.Author;
import com.training.payments_application.repo.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements  AuthorService {

    @Autowired
    private AuthorRepo repo;

    @Override
    public Author saveAuthor(Author a) {
        return repo.save(a);

    }
}
