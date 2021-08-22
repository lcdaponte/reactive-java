package com.lcdaponte.reactivejava.application.controller;

import com.lcdaponte.reactivejava.application.service.BookService;
import com.lcdaponte.reactivejava.repository.jpa.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;


    @PostMapping
    public Mono<Book> saveBook(@RequestBody Mono<Book> bookMono){
        return bookMono.flatMap(this.bookService::saveBook);
    }

    @GetMapping
    public Flux<Book> getAllBooks(){
        return this.bookService.getAllBooks();
    }
}
