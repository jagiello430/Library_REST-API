package com.kodilla.kodillalibrary.service;

import com.kodilla.kodillalibrary.domain.Book;
import com.kodilla.kodillalibrary.domain.ExemplarOfBook;
import com.kodilla.kodillalibrary.domain.Reader;
import com.kodilla.kodillalibrary.domain.RentalBooks;
import com.kodilla.kodillalibrary.repository.BookRepository;
import com.kodilla.kodillalibrary.repository.ExemplarOfBookRepository;
import com.kodilla.kodillalibrary.repository.ReaderRepository;
import com.kodilla.kodillalibrary.repository.RentalBooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DbService {
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private ReaderRepository readerRepository;
    @Autowired
    private ExemplarOfBookRepository exemplarOfBookRepository;
    @Autowired
    private RentalBooksRepository rentalBooksRepository;

    public Book saveBook(final Book book) {
        return bookRepository.save(book);
    }

    public Reader saveReader(final Reader reader) {
        return readerRepository.save(reader);
    }

    public ExemplarOfBook saveExemplarOfBook(final ExemplarOfBook exemplarOfBook) {
        return exemplarOfBookRepository.save(exemplarOfBook);
    }

    public Optional<ExemplarOfBook> getExampleOfBook(final long id) {
        return exemplarOfBookRepository.findById(id);
    }

    public RentalBooks saveRentalBook(final RentalBooks rentalBooks) {
        return rentalBooksRepository.save(rentalBooks);
    }

    public void deleteRentalBook(final long id) {
        rentalBooksRepository.deleteById(id);
    }

}
