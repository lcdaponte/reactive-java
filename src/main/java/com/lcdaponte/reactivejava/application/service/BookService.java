package com.lcdaponte.reactivejava.application.service;

import com.lcdaponte.reactivejava.repository.BookRepository;
import com.lcdaponte.reactivejava.repository.jpa.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Service
public class BookService {

    @Autowired
    private BookRepository repository;

    public Flux<Book> getAllBooks(){
        return this.repository.findAll();
    }

    public Mono<Book> saveBook(Book book){
        return this.repository.save(book);
    }
}
