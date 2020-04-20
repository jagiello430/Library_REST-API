package com.kodilla.kodillalibrary.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "book")
public class Book {

    @Id
    @NotNull
    @Column(name = ("title"))
    private String title;

    @NotNull
    @Column(name = ("author"))
    private String author;

    @NotNull
    @Column(name = ("year_of_publishment"))
    Date yearOfPublishment;

    @OneToMany(
            targetEntity = ExemplarOfBook.class,
            mappedBy = ("book"),
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    private List<ExemplarOfBook> listOfExemplar;
}
