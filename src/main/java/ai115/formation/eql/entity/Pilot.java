package ai115.formation.eql.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Pilot extends Person{


    public Pilot() {
    }

    public Pilot(List<ReservationPilot> reservationPilots) {
        this.reservationPilots = reservationPilots;
    }

    public Pilot(Long id, String name, String surname, String username, String password, int hdV, String licence, String email, List<Role> roles, List<ReservationPilot> reservationPilots) {
        super(id, name, surname, username, password, hdV, licence, email, roles);
        this.reservationPilots = reservationPilots;
    }

    /// Getters
    public List<ReservationPilot> getReservationPilots() {
        return reservationPilots;
    }

    /// Setters
    public void setReservationPilots(List<ReservationPilot> reservationPilots) {
        this.reservationPilots = reservationPilots;
    }

    @OneToMany(mappedBy = "pilot")
    private List<ReservationPilot> reservationPilots;

}
