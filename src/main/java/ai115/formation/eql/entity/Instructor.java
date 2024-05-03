package ai115.formation.eql.entity;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;



    @Entity
    public class Instructor extends Person{

    @ElementCollection(targetClass = DayAvailable.class, fetch = FetchType.LAZY)
    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "day_available_instructor")
    @Column(name = "day_available")
    private List<DayAvailable> dayAvailable = new ArrayList<>();

    @OneToMany(mappedBy = "instructor")
    private List<Promotion> promotions;

    @OneToMany(mappedBy = "instructor")
    private List<ReservationDateInstr> reservationDateInstrs;

    @OneToMany(mappedBy = "instructor")
    private List <ReservationStudent> reservationStudents;



    public Instructor() {
    }

        ///Getters
        public List<DayAvailable> getDayAvailable() {return dayAvailable;}
        public List<Promotion> getPromotions() {return promotions;}

        ///Setters
        public void setDayAvailable(List<DayAvailable> dayAvailable) {this.dayAvailable = dayAvailable;}
        public void setPromotions(List<Promotion> promotions) {this.promotions = promotions;}
    }
