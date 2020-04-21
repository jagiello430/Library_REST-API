package com.kodilla.kodillalibrary.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class RentalBooksDto {
    private long id;
    private ExemplarOfBook exemplarOfBook;
    private Reader reader;
    private Date dateOfRent;
    private Date dateOfReturn;
}
