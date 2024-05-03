package ai115.formation.eql.entity;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class ReservationDateInstr {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;

    @ManyToOne
    private Instructor instructor;
    @Enumerated(EnumType.STRING)
    private PartOfTheDay partOfTheDay;

    public ReservationDateInstr() {

    }

    public ReservationDateInstr(Long id, LocalDate date, Instructor instructor, PartOfTheDay partOfTheDay) {
        this.id = id;
        this.date = date;
        this.instructor = instructor;
        this.partOfTheDay = partOfTheDay;
    }

    /// Getters
    public Long getId() {return id;}
    public LocalDate getDate() {return date;}
    public Instructor getInstructor() {return instructor;}
    public PartOfTheDay getPartOfTheDay() {return partOfTheDay;}

    /// Setters
    public void setId(Long id) {this.id = id;}
    public void setDate(LocalDate date) {this.date = date;}
    public void setInstructor(Instructor instructor) {this.instructor = instructor;}
    public void setPartOfTheDay(PartOfTheDay partOfTheDay) {this.partOfTheDay = partOfTheDay;}
}
