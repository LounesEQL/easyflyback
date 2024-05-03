package ai115.formation.eql.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class ReservationStudent extends Reservation{

    @ManyToOne
    private StudentPilot studentPilot;

    @ManyToOne
    private Instructor instructor;

    public ReservationStudent() {
    }

    ///Getters
    public StudentPilot getStudentPilot() {return studentPilot;}

    ///Setters
    public void setStudentPilot(StudentPilot studentPilot) {this.studentPilot = studentPilot;}


}
