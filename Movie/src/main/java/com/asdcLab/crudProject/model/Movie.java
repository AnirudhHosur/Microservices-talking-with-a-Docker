package com.asdcLab.crudProject.model;

public class Movie {

    private int id;
    private String name;
    private int year;
    private float rank;

    public Movie() {

    }

    public Movie(int id, String name, int year, float rank) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.rank = rank;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getRank() {
        return rank;
    }

    public void setRank(float rank) {
        this.rank = rank;
    }
}
