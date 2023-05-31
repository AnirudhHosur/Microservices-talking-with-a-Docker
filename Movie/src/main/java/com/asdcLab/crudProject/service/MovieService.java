package com.asdcLab.crudProject.service;

import com.asdcLab.crudProject.model.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> getMovies();
    Object getActors();
}
