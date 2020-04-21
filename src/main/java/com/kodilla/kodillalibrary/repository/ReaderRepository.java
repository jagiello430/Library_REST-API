package com.kodilla.kodillalibrary.repository;

import com.kodilla.kodillalibrary.domain.Reader;
import org.springframework.data.repository.CrudRepository;

public interface ReaderRepository extends CrudRepository<Reader, Long> {
    @Override
    Reader save(Reader reader);
}
