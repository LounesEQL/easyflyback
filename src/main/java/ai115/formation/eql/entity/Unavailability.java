package ai115.formation.eql.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Unavailability {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private ReasonUnavailability reason;
    private LocalDate dateDebut;
    private LocalDate dateFin;

    @ManyToOne
    private Aircraft aircraft;

    public Unavailability() {

    }

    public Unavailability(Long id, ReasonUnavailability reason, LocalDate dateDebut, LocalDate dateFin, Aircraft aircraft) {
        this.id = id;
        this.reason = reason;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.aircraft = aircraft;
    }

    /// Getters
    public Long getId() {return id;}
    public ReasonUnavailability getReason() {return reason;}
    public LocalDate getDateDebut() {return dateDebut;}
    public LocalDate getDateFin() {return dateFin;}
    public Aircraft getAircraft() {return aircraft;}

    /// Setters
    public void setId(Long id) {this.id = id;}
    public void setReason(ReasonUnavailability reason) {this.reason = reason;}
    public void setDateDebut(LocalDate dateDebut) {this.dateDebut = dateDebut;}
    public void setDateFin(LocalDate dateFin) {this.dateFin = dateFin;}
    public void setAircraft(Aircraft aircraft) {this.aircraft = aircraft;}

}
