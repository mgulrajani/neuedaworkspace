package com.training.servicelayeradded.entities;

import jakarta.persistence.*;

@Entity
public class Book {
    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String title;  //findByTitle

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author=" + author +
                '}';
    }

    public Book(String title) {
        this.title = title;
    }

    public Book() {
    }

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    public Book(Long id, String title, Author author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    @OneToOne
    private Author  author;   //findByAuthor

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
