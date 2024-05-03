package ai115.formation.eql.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class StudentPilot extends Person{

    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private Promotion promotion;

    @OneToMany(mappedBy = "studentPilot", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ReservationStudent> reservationStudents;


    public StudentPilot() {
    }

    public Promotion getPromotion() {
        return promotion;
    }

    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }



}
