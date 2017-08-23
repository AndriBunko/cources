package com.abunko.Leson10.filmIO;

import com.abunko.Leson10.Genre;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Andrew on 23.08.2017.
 */
public final class GenresParser {
    public static Set<Genre> parseGenres(String s) throws IllegalFormatException {
       HashSet<Genre>  genres = new HashSet<>();
        String [] str = s.split(",");
        if(str.length == 0){
            throw new IllegalFormatException("Illegal format" + s);
        }
        for (String strGenre : str) {
            genres.add(Genre.valueOf(strGenre));
        }
        return genres;
    }

    public static String genreFormat(Set<Genre> genres){
        return genres.stream().map(Genre :: toString).collect(Collectors.joining(","));
    }
}
