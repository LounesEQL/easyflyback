package ai115.formation.eql.entity.dto;

public class RegisterDto {
    private String name;
    private String surname;
    private String username;
    private String password;
    private String licence;
    private String email;




    public RegisterDto() {
    }

    /// Getters
    public String getName() {return name;}
    public String getSurname() {return surname;}
    public String getUsername() {return username;}
    public String getPassword() {
        return password;
    }
    public String getLicence() {return licence;}
    public String getEmail() {return email;}

    /// Setters
    public void setName(String name) {this.name = name;}
    public void setSurname(String surname) {this.surname = surname;}
    public void setPassword(String password) {
        this.password = password;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setLicence(String licence) {this.licence = licence;}
    public void setEmail(String email) {this.email = email;}
}

