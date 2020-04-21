package com.kodilla.kodillalibrary.mapper;

import com.kodilla.kodillalibrary.domain.Book;
import com.kodilla.kodillalibrary.domain.BookDto;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class BookMapper {

    public Book mapToBook(final BookDto bookDto) {
        return new Book(
                bookDto.getTitle(),
                bookDto.getAuthor(),
                bookDto.getYearOfPublishment());
    }

    public BookDto mapToBookDto(final Book book) {
        return new BookDto(
                book.getTitle(),
                book.getAuthor(),
                book.getYearOfPublishment());
    }

    public List<BookDto> mapToBookDtoList(final List<Book> bookList) {
        return bookList.stream()
                .map(x -> new BookDto(x.getTitle(), x.getAuthor(), x.getYearOfPublishment()))
                .collect(Collectors.toList());
    }
}
