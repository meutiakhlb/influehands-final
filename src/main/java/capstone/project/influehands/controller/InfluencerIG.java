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

import java.util.*;



@RestController
@RequestMapping("/influencerIg")
public class InfluencerIG {

    @Autowired
    private InfluencerService influencerService;

    @GetMapping(value = "/")
    public List<InfluencerInstagramModel> listInfluencerIG(Model model){
        List<InfluencerInstagramModel> listInfluIG = influencerService.viewallInfluencerIG();
        return listInfluIG;
    }

    @GetMapping(value = "/{username}")
    public InfluencerInstagramModel getInfluIgByUsername(@PathVariable String username){
        return influencerService.getInfluIgByUsername(username);
    }

    







}