package com.abunko.leson1.monthFromNumber;

/**
 * Created by Andrew on 13.07.2017.
 */
public class MonthExeption extends Exception {
    String s;

    MonthExeption (String s){
        this.s = s;
    }

    @Override
    public String toString() {
        return s;
    }
}
