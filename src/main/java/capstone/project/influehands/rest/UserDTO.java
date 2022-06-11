package capstone.project.influehands.rest;

public class UserDTO {
    public String email;
    public String username;
    public String password;

    public UserDTO(String email, String username, String password) {
        this.email = email;
        this.username = username;
        this.password = password;
    }

}