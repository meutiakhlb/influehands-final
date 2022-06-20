package capstone.project.influehands.rest;

import lombok.Data;
import java.util.*;

import capstone.project.influehands.model.CategoryModel;
import capstone.project.influehands.model.RoleModel;


@Data
public class SignUpDTO {
    String username;
    String password;
    String email;
    Long id_role;
    Long category_id;

}