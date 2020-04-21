package com.kodilla.kodillalibrary.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity(name = "book")
public class Book {

    public Book(String title, String author, int yearOfPublishment) {
        this.title = title;
        this.author = author;
        this.yearOfPublishment = yearOfPublishment;
    }
    @Id
    @Column(name = ("title"))
    private String title;

    @Column(name = ("author"))
    private String author;

    @Column(name = ("year_of_publishment"))
    int yearOfPublishment;

    @OneToMany(
            targetEntity = ExemplarOfBook.class,
            mappedBy = ("book"),
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    private List<ExemplarOfBook> listOfExemplar;


}
