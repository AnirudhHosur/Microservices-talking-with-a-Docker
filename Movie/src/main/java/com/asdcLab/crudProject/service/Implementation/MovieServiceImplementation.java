package com.asdcLab.crudProject.service.Implementation;

import com.asdcLab.crudProject.model.Movie;
import com.asdcLab.crudProject.service.MovieService;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServiceImplementation implements MovieService {

    @Override
    public List<Movie> getMovies() {
        List<Movie> movies = new ArrayList<>();
        Movie m1 = new Movie(1, "Inception", 2015, 9.0F);
        movies.add(m1);
        return movies;
    }

    @Override
    public Object getActors() {
        String url = "http://consumer:8080/actors/getActors";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Object> response = restTemplate.exchange(url, HttpMethod.GET, HttpEntity.EMPTY,
                new ParameterizedTypeReference<Object>() {
                    @Override
                    public Type getType() {
                        return super.getType();
                    }
                });
        Object actor = response.getBody();
        return actor;
    }
}
