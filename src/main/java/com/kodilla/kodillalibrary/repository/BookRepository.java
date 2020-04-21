package com.kodilla.kodillalibrary.repository;

import com.kodilla.kodillalibrary.domain.Book;
import org.springframework.data.repository.CrudRepository;


public interface BookRepository extends CrudRepository<Book,Long> {

    @Override
    Book save(Book book);
}
