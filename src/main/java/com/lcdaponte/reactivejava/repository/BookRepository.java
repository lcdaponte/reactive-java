package com.lcdaponte.reactivejava.repository;

import com.lcdaponte.reactivejava.repository.jpa.entity.Book;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BookRepository extends ReactiveCrudRepository<Book, UUID> {
}
