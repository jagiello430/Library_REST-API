package com.kodilla.kodillalibrary.mapper;

import com.kodilla.kodillalibrary.domain.ExemplarOfBook;
import com.kodilla.kodillalibrary.domain.ExemplarOfBookDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ExemplarOfBookMapper {

    public ExemplarOfBook mapToExemplarOfBook(final ExemplarOfBookDto exemplarOfBookDto) {
        return new ExemplarOfBook(
                exemplarOfBookDto.getBook(),
                exemplarOfBookDto.getTypeOfStatus());
    }

    public ExemplarOfBookDto mapToExemplarOfBookDto(final ExemplarOfBook exemplarOfBook) {
        return new ExemplarOfBookDto(
                exemplarOfBook.getBook(),
                exemplarOfBook.getTypeOfStatus());
    }

    public List<ExemplarOfBookDto> mapToExemplarOfBookDtoList(final List<ExemplarOfBook> exemplarOfBooks) {
        return exemplarOfBooks.stream()
                .map(x -> new ExemplarOfBookDto(x.getBook(), x.getTypeOfStatus()))
                .collect(Collectors.toList());
    }
}
