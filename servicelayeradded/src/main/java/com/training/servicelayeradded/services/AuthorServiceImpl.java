package com.training.servicelayeradded.services;

import com.training.servicelayeradded.entities.Author;
import com.training.servicelayeradded.repo.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
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
