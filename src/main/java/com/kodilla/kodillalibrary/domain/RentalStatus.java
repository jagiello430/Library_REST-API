package com.kodilla.kodillalibrary.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "rental_status")
public class RentalStatus {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = ("id_exemplar_of_book"))
    private ExemplarOfBook exemplarOfBook;

    @NotNull
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = ("reader_id"))
    private Reader reader;

    @NotNull
    @Column(name = ("date_of_rent"))
    private Date dateOfRent;

    @NotNull
    @Column(name = ("date_of_return"))
    private Date dateOfReturn;
}
