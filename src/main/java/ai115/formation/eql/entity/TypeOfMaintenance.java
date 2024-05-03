package ai115.formation.eql.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class TypeOfMaintenance {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    private String type;

    public TypeOfMaintenance() {

    }

    public TypeOfMaintenance(Long id, String type) {
        this.id = id;
        this.type = type;
    }

    /// Getters
    public Long getId() {return id;}
    public String getType() {return type;}

    /// Setters
    public void setId(Long id) {this.id = id;}
    public void setType(String type) {this.type = type;}

}
