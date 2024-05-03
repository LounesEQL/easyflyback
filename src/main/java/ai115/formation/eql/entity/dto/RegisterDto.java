package ai115.formation.eql.entity.dto;

public class RegisterDto {
    private String name;
    private String surname;
    private String username;
    private String password;
    private String email;




    public RegisterDto() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

