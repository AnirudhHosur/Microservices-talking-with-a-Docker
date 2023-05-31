package com.asdcLab.crudProject.controller;

import com.asdcLab.crudProject.model.Movie;
import com.asdcLab.crudProject.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    MovieService movieService;

    @GetMapping("/getMovies")
    public List<Movie> getMovieById() {
        return movieService.getMovies();
    }

    @GetMapping("/getActors")
    public String getActors() {
        return movieService.getActors().toString();
    }
}
