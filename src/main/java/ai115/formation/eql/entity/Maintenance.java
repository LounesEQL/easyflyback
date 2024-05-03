package ai115.formation.eql.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Maintenance {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    private LocalDate dateDebut;
    private LocalDate dateFin;

    @Enumerated(EnumType.STRING)
    private Mechanic mechanic;

    @OneToOne
    private Aircraft aircraft;

    public Maintenance() {

    }

    public Maintenance(Long id, LocalDate dateDebut, LocalDate dateFin, Mechanic mechanic) {
        this.id = id;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.mechanic = mechanic;
    }

    /// Getters
    public Long getId() {return id;}
    public LocalDate getDateDebut() {return dateDebut;}
    public LocalDate getDateFin() {return dateFin;}
    public Mechanic getMechanic() {return mechanic;}

    /// Setters
    public void setId(Long id) {this.id = id;}
    public void setDateDebut(LocalDate dateDebut) {this.dateDebut = dateDebut;}
    public void setDateFin(LocalDate dateFin) {this.dateFin = dateFin;}
    public void setMechanic(Mechanic mechanic) {this.mechanic = mechanic;}
}
