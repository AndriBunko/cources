package com.abunko.Leson10.filmIO;

import com.abunko.Leson10.Films;

import java.io.*;

/**
 * Created by Andrew on 23.08.2017.
 */
public class FilmBinaryIO {
    /**
     * @throws IOException
     * @throws IllegalFormatException
     */
    public static Films readPeopleFromBinFile(String fileName) throws IOException, IllegalFormatException {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Films) inputStream.readObject();
        } catch (ClassNotFoundException e) {
            throw new IllegalFormatException("illegal bin file", e);
        }
    }

    // Binary Output

    /**
     * @throws IOException
     */
    public static void writePeopleIntoBinFile(String fileName, Films films) throws IOException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            outputStream.writeObject(films);
        }
    }

}
