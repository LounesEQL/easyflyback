package ai115.formation.eql.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Promotion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    private Instructor instructor;
    @OneToMany(mappedBy = "promotion")
    private List<StudentPilot> studentPilots;

    public Promotion() {
    }

    public Promotion(Long id, String name, Instructor instructor, List<StudentPilot> studentPilots) {
        this.id = id;
        this.name = name;
        this.instructor = instructor;
        this.studentPilots = studentPilots;
    }

    /// Getters
    public Long getId() {return id;}
    public String getName() {return name;}
    public Instructor getInstructor() {return instructor;}
    public List<StudentPilot> getStudentPilots() {return studentPilots;}

    /// Setters
    public void setId(Long id) {this.id = id;}
    public void setName(String name) {this.name = name;}
    public void setInstructor(Instructor instructor) {this.instructor = instructor;}
    public void setStudentPilots(List<StudentPilot> studentPilots) {this.studentPilots = studentPilots;}
}
