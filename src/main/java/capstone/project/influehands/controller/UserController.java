package capstone.project.influehands.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import capstone.project.influehands.service.InfluencerService;
import capstone.project.influehands.service.InfluencerServiceImpl;
import capstone.project.influehands.model.InfluencerInstagramModel;
import capstone.project.influehands.model.InfluencerTiktokModel;
import capstone.project.influehands.model.UserModel;
import capstone.project.influehands.repository.UserDb;

import java.util.*;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserDb user;

    @GetMapping(value="/")
    public List<UserModel> geListUser() {
        return user.findAll();
    }
    

}