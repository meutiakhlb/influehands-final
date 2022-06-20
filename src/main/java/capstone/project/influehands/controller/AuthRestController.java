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
import capstone.project.influehands.service.CategoryService;
import capstone.project.influehands.service.RoleService;
import capstone.project.influehands.service.BrandService;


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
@RequestMapping("/api/auth")
public class AuthRestController {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserDb userDb;

    @Autowired
    private RoleService roleService;

    @Autowired
    private BrandService brandService;

    @Autowired
    private CategoryService category;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/login")
    public ResponseEntity<String> authenticateUser(@RequestBody LoginDTO loginDto){
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                loginDto.getUsername(), loginDto.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        return new ResponseEntity<>("User signed-in successfully!.", HttpStatus.OK);
    }

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@RequestBody SignUpDTO signUpDto){

        // add check for username exists in a DB
        if(userDb.findByUsername(signUpDto.getUsername()) != null){
            return new ResponseEntity<>("Username is already taken!", HttpStatus.BAD_REQUEST);
        }

        // create user object
        UserModel user = new UserModel();
        user.setUsername(signUpDto.getUsername());
        user.setPassword(passwordEncoder.encode(signUpDto.getPassword()));
        user.setEmail(signUpDto.getEmail());
        
        RoleModel role = roleService.getRoleById(signUpDto.getId_role());

        if(role.getId() == 1L){
            BrandModel brand = new BrandModel();
            brand.setBrandCategory(category.findById(signUpDto.getCategory_id()));
//tambahan
            brand.setNama(signUpDto.getUsername());
            brandService.saveBrand(brand);

            user.setBrand(brand);
            user.setRole(role);
            userDb.save(user);
            return new ResponseEntity<>("User Brand registered successfully", HttpStatus.OK);
        } else if(role.getId() == 2L) {
            InfluencerTiktokModel influencerTiktok =  new InfluencerTiktokModel();
            influencerTiktok.setCategoryTiktokInfluencer(category.findById(signUpDto.getCategory_id()));
            user.setInfluencerTiktok(influencerTiktok);
            user.setRole(role);
            userDb.save(user);
            return new ResponseEntity<>("User Influencer Tiktok registered successfully", HttpStatus.OK);
        } else {
            InfluencerInstagramModel instagramModel = new InfluencerInstagramModel();
            instagramModel.setCategoryIGInfluencer(category.findById(signUpDto.getCategory_id()));
            user.setInfluencerInstagram(instagramModel);
            user.setRole(role);
            userDb.save(user);
            return new ResponseEntity<>("User Influencer Instagram registered successfully", HttpStatus.OK);
        }
        
        

       

        

    }






}