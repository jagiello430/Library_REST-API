package com.kodilla.kodillalibrary.repository;

import com.kodilla.kodillalibrary.domain.RentalBooks;
import org.springframework.data.repository.CrudRepository;

public interface RentalBooksRepository extends CrudRepository<RentalBooks, Long> {

    @Override
    RentalBooks save(RentalBooks rentalBooks);
}
