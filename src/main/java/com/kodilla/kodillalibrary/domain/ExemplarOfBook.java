package com.kodilla.kodillalibrary.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Setter
@Getter
@NoArgsConstructor
@Entity(name = "exemplar_of_book")
public class ExemplarOfBook {

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = ("id_exemplar_of_book"), unique = true)
    private long exemplarOfBook;

    @NotNull
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = ("title"))
    private Book book;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = ("type_of_status"), columnDefinition = "Enum('USED', 'DESTROYED', 'LOST')")
    private TypeOfStatus typeOfStatus;

    public ExemplarOfBook(Book book, TypeOfStatus typeOfStatus) {
        this.book = book;
        this.typeOfStatus = typeOfStatus;
    }
}

