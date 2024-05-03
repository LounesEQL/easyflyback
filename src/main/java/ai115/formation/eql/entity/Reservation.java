package ai115.formation.eql.entity;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;

    @ManyToOne
    private Aircraft aircraft;

    @Enumerated(EnumType.STRING)
    private PartOfTheDay partOfTheDay;

    public Reservation() {

    }

    public Reservation(Long id, LocalDate date, Aircraft aircraft, PartOfTheDay partOfTheDay) {
        this.id = id;
        this.date = date;
        this.aircraft = aircraft;
        this.partOfTheDay = partOfTheDay;
    }

    /// Getters
    public Long getId() {return id;}
    public LocalDate getDate() {return date;}
    public Aircraft getAircraft() {return aircraft;}
    public PartOfTheDay getPartOfTheDay() {return partOfTheDay;}

    /// Setters
    public void setId(Long id) {this.id = id;}
    public void setDate(LocalDate date) {this.date = date;}
    public void setAircraft(Aircraft aircraft) {this.aircraft = aircraft;}
    public void setPartOfTheDay(PartOfTheDay partOfTheDay) {this.partOfTheDay = partOfTheDay;}
}
