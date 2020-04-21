package com.kodilla.kodillalibrary.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@Setter
public class ExemplarOfBookDto {
    private long exemplarOfBook;
    private Book book;
    private TypeOfStatus typeOfStatus;

    public ExemplarOfBookDto(Book book, TypeOfStatus typeOfStatus) {
        this.book = book;
        this.typeOfStatus = typeOfStatus;
    }
}
