package ai115.formation.eql.entity;


import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "person_type")
public class Person implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String username;
    private String password;
    private int HdV;
    private String licence;
    private String email;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Role> roles = new ArrayList<>();

    public Person() {
    }

    public Person(Long id, String name, String surname, String username, String password, int hdV, String licence, String email, List<Role> roles) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
        HdV = hdV;
        this.licence = licence;
        this.email = email;
        this.roles = roles;
    }

    /// Getters

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public int getHdV() {
        return HdV;
    }
    public String getLicence() {
        return licence;
    }
    public List<Role> getRoles() {
        return roles;
    }
    public String getEmail() {return email;}

    /// Setters


    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setHdV(int hdV) {
        HdV = hdV;
    }
    public void setLicence(String licence) {
        this.licence = licence;
    }
    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
    public void setEmail(String email) {this.email = email;}

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }





}
