package com.abunko.Leson10;

import com.abunko.Leson10.filmIO.FilmBinaryIO;
import com.abunko.Leson10.filmIO.FilmsTextIO;
import com.abunko.Leson10.filmIO.IllegalFormatException;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Andrew on 08.08.2017.
 */
public class Runner {
    public static void main(String[] args) {
        Films films = new Films();
        Set<Genre> genrs = new HashSet<>();
        genrs.add(Genre.ACTHION);
        genrs.add(Genre.DRAMA);
        Actor a  = new Actor("Petya", "Petkin");
        Actor a1  = new Actor("Vasya", "Vaskin");
        Actor a2  = new Actor("Roma", "Romin");

        Actors actors = new Actors();
        actors.addActor(a);
        actors.addActor(a1);
        actors.addActor(a2);

        Film f1 = new Film("test", 1990, genrs, actors);
        films.addFilm(f1);

        genrs.add(Genre.HORROR);
        Film f2 = new Film("test2", 2017, genrs, actors);
        films.addFilm(f2);

//        try {
//            FilmsTextIO.writeFilmsIntoFile("test.txt",films);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            Films films1 = FilmsTextIO.readFilmsFromFile("test.txt");
//            for (Film f : films1.getFilms()) {
//                System.out.println(f.getName()+ " " + f.getYearRelease() + " " + f.getGenres() + " " + f.getActors().getActorsList());
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (IllegalFormatException e) {
//            e.printStackTrace();
//        }
        try {
            FilmBinaryIO.writePeopleIntoBinFile("test-binary.txt", films);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Films f = FilmBinaryIO.readPeopleFromBinFile("test-binary.txt");
            for (Film film : f.getFilms()) {
                System.out.println(film.getName()+ " " + film.getYearRelease() + " " + film.getGenres() + " " + film.getActors().getActorsList());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalFormatException e) {
            e.printStackTrace();
        }


    }
}
