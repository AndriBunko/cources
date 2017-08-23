package com.abunko.Leson10.filmIO;

/**
 * Created by Andrew on 23.08.2017.
 */
public class IllegalFormatException extends  Exception{

    public IllegalFormatException(String message) {
        super(message);
    }

    public IllegalFormatException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalFormatException(Throwable cause) {
        super(cause);
    }
}

