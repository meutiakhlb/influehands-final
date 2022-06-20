package capstone.project.influehands.rest;

import capstone.project.influehands.model.RoleModel;

public class UserDTO {
    public String username;
    public String password;
    public RoleModel role;

    public UserDTO( String username, String password, RoleModel role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

}