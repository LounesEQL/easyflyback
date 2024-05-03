package ai115.formation.eql.entity;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;

import java.util.Set;

@Entity
public class Role implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;



    public Role() {
    }

    public Role(String name) {
        this.name = name;
    }

    public Role(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    /// Getters
    public Long getId() {return id;}
    public String getName() {return name;}

    /// Setters
    public void setId(Long id) {this.id = id;}
    public void setName(String name) {this.name = name;}

    @Override
    public String getAuthority() {
        return null;
    }

}
