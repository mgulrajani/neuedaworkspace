package com.training.servicelayeradded.entities;

import jakarta.persistence.*;

@Entity

public class Author {

    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String name;

    private String emailId;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @OneToOne(mappedBy = "author",cascade =CascadeType.ALL,fetch = FetchType.EAGER)
    private Book book;
    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }

    public Author() {
    }

    public Author(Long id, String name, String emailId) {
        this.id = id;
        this.name = name;
        this.emailId = emailId;
    }

    public Author(String name, String emailId) {
        this.name = name;
        this.emailId = emailId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
