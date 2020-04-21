package com.kodilla.kodillalibrary.mapper;

import com.kodilla.kodillalibrary.domain.ReaderDto;
import com.kodilla.kodillalibrary.domain.RentalBooks;
import com.kodilla.kodillalibrary.domain.RentalBooksDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class RentalBooksMapper {

    public RentalBooks mapToRentalBooks(final RentalBooksDto rentalBooksDto) {
        return new RentalBooks(
                rentalBooksDto.getId(),
                rentalBooksDto.getExemplarOfBook(),
                rentalBooksDto.getReader(),
                rentalBooksDto.getDateOfRent(),
                rentalBooksDto.getDateOfReturn());
    }

    public RentalBooksDto mapToRentalBooksDto(final RentalBooks rentalBooks) {
        return new RentalBooksDto(
                rentalBooks.getId(),
                rentalBooks.getExemplarOfBook(),
                rentalBooks.getReader(),
                rentalBooks.getDateOfRent(),
                rentalBooks.getDateOfReturn());
    }

    public List<RentalBooksDto> mapToRentalBooksDtoList(final List<RentalBooks> rentalBooksList) {
        return rentalBooksList.stream()
                .map(x -> new RentalBooksDto(x.getId(), x.getExemplarOfBook(), x.getReader(), x.getDateOfRent(), x.getDateOfReturn()))
                .collect(Collectors.toList());
    }
}
