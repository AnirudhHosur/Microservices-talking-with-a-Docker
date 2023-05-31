package com.asdcLab.crudProject.Actor.service.implementation;

import com.asdcLab.crudProject.Actor.model.Actor;
import com.asdcLab.crudProject.Actor.service.ActorService;
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
public class ActorServiceImplementation implements ActorService {

    @Override
    public List<Actor> getActors() {
        List<Actor> actors = new ArrayList<>();
        Actor a1 = new Actor(1, "Anirudh", "Hosur", 'M', 2, 0);
        actors.add(a1);
        return actors;
    }

    @Override
    public Object getMovies() {
        // give the container name here
        String url = "http://producer:8081/movies/getMovies";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Object> response = restTemplate.exchange(url, HttpMethod.GET, HttpEntity.EMPTY,
                new ParameterizedTypeReference<Object>() {
                    @Override
                    public Type getType() {
                        return super.getType();
                    }
                });
        Object movie = response.getBody();
        return movie;
    }
}
