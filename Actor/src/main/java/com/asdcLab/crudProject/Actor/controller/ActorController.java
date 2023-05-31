package com.asdcLab.crudProject.Actor.controller;

import com.asdcLab.crudProject.Actor.model.Actor;
import com.asdcLab.crudProject.Actor.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/actors")
public class ActorController {

    @Autowired
    ActorService actorService;

    @GetMapping("/getActors")
    public List<Actor> getActor() {
        return actorService.getActors();
    }

    @GetMapping("/getMovies")
    public String getMovies() {
        return actorService.getMovies().toString();
    }
}
