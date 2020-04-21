package com.kodilla.kodillalibrary.repository;

import com.kodilla.kodillalibrary.domain.ExemplarOfBook;
import org.springframework.data.repository.CrudRepository;

public interface ExemplarOfBookRepository extends CrudRepository<ExemplarOfBook, Long> {

    @Override
    ExemplarOfBook save(ExemplarOfBook exemplarOfBook);
}
