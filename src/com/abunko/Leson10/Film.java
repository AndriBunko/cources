package com.abunko.Leson10;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 * Created by Andrew on 20.07.2017.
 */
public class Film implements Serializable{
    private String name;
    private int yearRelease;
    private final Set<Genre> genres;
    private final Actors actors;

    public Film(String name, int yearRelease, Set<Genre> genres, Actors actors) {
        this.name = name;
        this.yearRelease = yearRelease;
        this.genres = genres;
        this.actors = actors;
    }

    public String getName() {
        return name;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public Set<Genre> getGenres() {
        return genres;
    }

    public Actors getActors() {
        return  actors;
    }

    @Override
    public String toString() {
        return "Film name = " + name ;
    }
}
