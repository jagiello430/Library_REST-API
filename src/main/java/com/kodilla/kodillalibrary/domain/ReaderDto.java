package com.kodilla.kodillalibrary.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@NoArgsConstructor
@Setter
public class ReaderDto {
    private long id;
    private String name;
    private String surname;
    Date createDate;

    public ReaderDto(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.createDate = new Date();
    }
}
