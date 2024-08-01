package com.training.payments_application.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Book {
    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String title;  //findByTitle
    private LocalDate dateOfPublishing;

    public Book(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Book(String title, LocalDate dateOfPublishing) {
        this.title = title;
        this.dateOfPublishing = dateOfPublishing;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", dateOfPublishing=" + dateOfPublishing +
                '}';
    }

    public Book(Long id, String title, LocalDate dateOfPublishing) {
        this.id = id;
        this.title = title;
        this.dateOfPublishing = dateOfPublishing;
    }

    public LocalDate getDateOfPublishing() {
        return dateOfPublishing;
    }

    public void setDateOfPublishing(LocalDate dateOfPublishing) {
        this.dateOfPublishing = dateOfPublishing;
    }

    public Book(String title) {
        this.title = title;
    }

    public Book() {
    }


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


}
