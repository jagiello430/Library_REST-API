package com.kodilla.kodillalibrary.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity(name = "reader")
public class Reader {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = ("id"), unique = true)
    private long id;

    @NotNull
    @Column(name = ("name"))
    private String name;

    @NotNull
    @Column(name = ("surname"))
    private String surname;

    @Column(name = ("create_date"))
    Date createDate;

    @OneToMany(
            targetEntity = RentalBooks.class,
            mappedBy = ("reader"),
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    private List<RentalBooks> rentalStatusList;

    public Reader(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.createDate = new Date();
    }
}
