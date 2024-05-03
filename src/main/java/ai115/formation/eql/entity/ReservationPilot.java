package ai115.formation.eql.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class ReservationPilot extends Reservation{

    @ManyToOne
    private Pilot pilot;

    public ReservationPilot() {
    }

    ///Getters
    public Pilot getPilot() {return pilot;}

    ///Setters
    public void setPilot(Pilot pilot) {this.pilot = pilot;}


}
