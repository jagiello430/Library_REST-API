package com.kodilla.kodillalibrary.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
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
    LocalDate createDate;

    @OneToMany(
            targetEntity = RentalStatus.class,
            mappedBy = ("reader"),
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    private List<RentalStatus> rentalStatusList;
}
