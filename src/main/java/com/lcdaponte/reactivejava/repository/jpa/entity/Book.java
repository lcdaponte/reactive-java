package com.lcdaponte.reactivejava.repository.jpa.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.domain.Persistable;


import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;


public class Book implements Persistable<UUID> {

    @Id
    private UUID id;
    private String name;
    private String author;
    private LocalDate published_date;



    public Book() {
    }

    public Book(UUID id, String name, String author, LocalDate published_date) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.published_date = published_date;
    }

    public Book(String name, String author, LocalDate published_date) {
        this.name = name;
        this.author = author;
        this.published_date = published_date;
    }

    @Override
    public boolean isNew() {
        boolean result = Objects.isNull(id);
        this.id = result ? UUID.randomUUID() : this.id;
        return result;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getPublishedDate() {
        return published_date;
    }

    public void setPublishedDate(LocalDate published_date) {
        this.published_date = published_date;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publishedDate=" + published_date +
                '}';
    }
}
