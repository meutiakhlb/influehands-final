package capstone.project.influehands.controller;

import capstone.project.influehands.service.InfluencerService;
import capstone.project.influehands.service.InfluencerServiceImpl;
import capstone.project.influehands.service.WishlistService;
import capstone.project.influehands.model.InfluencerInstagramModel;
import capstone.project.influehands.model.InfluencerTiktokModel;
import capstone.project.influehands.model.WishlistModel;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Wishlist {
    @Autowired
    private WishlistService wishlistService;


    

}