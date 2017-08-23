package com.abunko.Leson10.filmIO;

import com.abunko.Leson10.Film;
import com.abunko.Leson10.Films;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Andrew on 08.08.2017.
 */
public class FilmsTextIO {
    //read from file
    /**
     * @throws IOException
     * @throws IllegalFormatException
     */
    public static Film readFilmFromFile(File file) throws IOException, IllegalFormatException {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            return readFilm(reader);
        }
    }

    /**
     * @throws IOException
     * @throws IllegalFormatException
     */
    public static Films readFilmsFromFile(String file) throws IOException, IllegalFormatException {
        try (BufferedReader reader = new BufferedReader(new FileReader((file)))){
            return readFilms(reader);
        }
    }

    /**
     * @throws IOException
     * @throws IllegalFormatException
     */
    private static Film readFilm(BufferedReader reader) throws IOException, IllegalFormatException {
        String s = reader.readLine();
            return parseFilm(s);

    }

    /**
     * @throws IOException
     * @throws IllegalFormatException
     */
    private static Films readFilms(BufferedReader reader) throws IllegalFormatException, IOException {
        List<Film> films = new ArrayList<>();

        String line;
        while ((line = reader.readLine()) != null) {
            Film film = parseFilm(line);
            films.add(film);
        }

        return new Films(films);
    }


    //write to file
    /** @throws IOException
     */
    public static void writeFilmsIntoFile(String fileName, Films films) throws IOException {
        try (Writer writer = new BufferedWriter(new FileWriter(fileName, true))) {
            for (Film film : films.getFilms()) {
                String s = formatFilm(film);
                writer.write(s + "\n");
            }
        }
    }

    private static String formatFilm(Film film) {
        return film.getName() + ";" + film.getYearRelease() + ";" + GenresParser.genreFormat(film.getGenres()) + ";" + ActorParser.actorsFormat(film.getActors());
    }

    // Binary Input

    /**
     * @throws IOException
     * @throws IllegalFormatException
     */


    /**
     * @throws IllegalFormatException
     */
    private static Film parseFilm(String s) throws IllegalFormatException {
        String [] str = s.split(";");
        if (str.length < 4){
            throw new IllegalFormatException("should be 4 values: " + s);
        }

        String name = str[0];
        if (!isInt(str[1])) {
            throw new IllegalFormatException("illegal int: " + str[1]);
        }
        int year = Integer.parseInt(str[1]);

        return new Film(name, year, GenresParser.parseGenres(str[2]), ActorParser.parseActors(str[3]));
    }


    private static boolean isInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }
}
