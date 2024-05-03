package ai115.formation.eql.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;


@Entity
public class Aircraft {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String immatriculation;
    private String type;
    private String model;
    private String picture;
    private int HdV;
    private LocalDate dateImmatriculation;

    @JsonIgnore
    @OneToMany(mappedBy = "aircraft", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Reservation> reservations;

    @JsonIgnore
    @OneToMany(mappedBy = "aircraft", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Unavailability> unavailabilities;


    /// Getters
    public Long getId() {return id;}
    public String getImmatriculation() {return immatriculation;}
    public String getType() {return type;}
    public String getModel() {return model;}
    public String getPicture() {return picture;}
    public int getHdV() {return HdV;}
    public LocalDate getDateImmatriculation() {return dateImmatriculation;}
    public List<Reservation> getReservations() {return reservations;}

    public List<Unavailability> getUnavailabilities() {
        return unavailabilities;
    }

    /// Setters
    public void setId(Long id) {this.id = id;}
    public void setImmatriculation(String immatriculation) {this.immatriculation = immatriculation;}
    public void setType(String type) {this.type = type;}
    public void setModel(String model) {this.model = model;}
    public void setPicture(String picture) {this.picture = picture;}
    public void setHdV(int hdV) {HdV = hdV;}
    public void setDateImmatriculation(LocalDate dateImmatriculation) {this.dateImmatriculation = dateImmatriculation;}
    public void setReservations(List<Reservation> reservations) {this.reservations = reservations;}
    public void setUnavailabilities(List<Unavailability> unavailabilities) {this.unavailabilities = unavailabilities;}

    /// Constructors
    public Aircraft(Long id, String immatriculation, String type, String model, String picture, int hdV, LocalDate dateImmatriculation, List<Reservation> reservations, List<Unavailability> unavailabilities) {
        this.id = id;
        this.immatriculation = immatriculation;
        this.type = type;
        this.model = model;
        this.picture = picture;
        HdV = hdV;
        this.dateImmatriculation = dateImmatriculation;
        this.reservations = reservations;
        this.unavailabilities = unavailabilities;
    }

    public Aircraft() {
    }
}
