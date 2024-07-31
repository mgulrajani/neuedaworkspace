package com.training.servicelayeradded.services;

import com.training.servicelayeradded.entities.Author;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;

public interface AuthorService {

    public Author saveAuthor(Author a);

}
