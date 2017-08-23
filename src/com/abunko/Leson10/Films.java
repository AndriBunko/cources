package com.abunko.Leson10;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Andrew on 20.07.2017.
 */
public class Films implements Serializable {
    private List<Film> films = new ArrayList<>();

    public Films() {
    }

    public Films(List<Film> films) {
        this.films = films;
    }

    public void addFilm(Film f){
        films.add(f);
    }

    public List<Film> sortFilmsByGare(Genre ... genres) {
        return films.stream().filter(film -> film.getGenres().containsAll((Arrays.asList(genres)))).collect(Collectors.toList());
    }

    public List<Film> sortFilmsByActor(Actor ... actors) {
        return films.stream().filter(film -> film.getActors().getActorsList().containsAll((Arrays.asList(actors)))).collect(Collectors.toList());
    }

    public List<Film> sortFilmsByYear(int star, int end) {
        return films.stream().filter(film -> film.getYearRelease() >= star && film.getYearRelease() <= end).collect(Collectors.toList());
    }

    public List<Film> getFilms() {
        return films;
    }
}
