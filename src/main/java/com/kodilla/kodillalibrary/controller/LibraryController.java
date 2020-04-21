package com.kodilla.kodillalibrary.controller;

import com.kodilla.kodillalibrary.domain.*;
import com.kodilla.kodillalibrary.mapper.BookMapper;
import com.kodilla.kodillalibrary.mapper.ExemplarOfBookMapper;
import com.kodilla.kodillalibrary.mapper.ReaderMapper;
import com.kodilla.kodillalibrary.mapper.RentalBooksMapper;
import com.kodilla.kodillalibrary.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/v1/library")
public class LibraryController {
    @Autowired
    DbService dbService;
    @Autowired
    BookMapper bookMapper;
    @Autowired
    ReaderMapper readerMapper;
    @Autowired
    ExemplarOfBookMapper exemplarOfBookMapper;
    @Autowired
    RentalBooksMapper rentalBooksMapper;

    @PostMapping(value = "createBook", consumes = APPLICATION_JSON_VALUE)
    public Book createBook(@RequestBody BookDto bookDto) {
        return dbService.saveBook(bookMapper.mapToBook(bookDto));
    }

    @PostMapping(value = "createReader", consumes = APPLICATION_JSON_VALUE)
    public Reader createReader(@RequestBody ReaderDto readerDto) {
        return dbService.saveReader(readerMapper.mapToReader(readerDto));
    }

    @PostMapping(value = "createExemplar", consumes = APPLICATION_JSON_VALUE)
    public ExemplarOfBook createExemplarOfBook(@RequestBody ExemplarOfBookDto exemplarOfBookDto) {
        return dbService.saveExemplarOfBook(exemplarOfBookMapper.mapToExemplarOfBook(exemplarOfBookDto));
    }

    @PutMapping(value = "updateExemplarOfBook")
    public ExemplarOfBookDto updateExemplarOfBook(@RequestBody ExemplarOfBookDto exemplarOfBookDto) {
        return exemplarOfBookMapper.mapToExemplarOfBookDto(dbService.saveExemplarOfBook(exemplarOfBookMapper.mapToExemplarOfBook(exemplarOfBookDto)));
    }

    @GetMapping(value = "getExampleOfBook")
    public ExemplarOfBookDto getExampleOfBook(@RequestParam long exampleId) throws ExampleOfBookNotFindID {
        return exemplarOfBookMapper.mapToExemplarOfBookDto(dbService.getExampleOfBook(exampleId).orElseThrow(ExampleOfBookNotFindID::new));
    }

    @PostMapping(value = "createRental", consumes = APPLICATION_JSON_VALUE)
    public RentalBooks createRentalBooks(@RequestBody RentalBooksDto rentalBooksDto) {
        return dbService.saveRentalBook(rentalBooksMapper.mapToRentalBooks(rentalBooksDto));
    }

    @DeleteMapping(value = "deleteRentalBook")
    public void deleteRental(@RequestParam long rentalId) {
        dbService.deleteRentalBook(rentalId);
    }

}
