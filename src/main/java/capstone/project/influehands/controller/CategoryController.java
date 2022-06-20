package capstone.project.influehands.controller;

import capstone.project.influehands.model.BrandModel;
import capstone.project.influehands.model.InfluencerInstagramModel;
import capstone.project.influehands.model.InfluencerTiktokModel;
import capstone.project.influehands.model.RoleModel;
import capstone.project.influehands.model.UserModel;
import capstone.project.influehands.repository.RoleDb;
import capstone.project.influehands.repository.UserDb;
import capstone.project.influehands.rest.LoginDTO;
import capstone.project.influehands.rest.SignUpDTO;
import capstone.project.influehands.service.RoleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

}