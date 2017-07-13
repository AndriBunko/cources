package com.abunko.leson1.monthFromNumber;

/**
 * Created by Anrew on 13.07.2017.
 */
public enum Month {
    ЯНВАРЬ,
    ФЕВРАЛЬ,
    МАРТ,
    АПРЕЛЬ,
    МАЙ,
    ИЮНЬ,
    ИЮЛЬ,
    АВГУСТ,
    СЕНТЯБРЬ,
    ОКТЯБРЬ,
    НОЯБРЬ,
    ДЕКАБРЬ;

    private static final Month[] ENUMS = Month.values();


    public static Month of(int month) throws MonthExeption {
        if (month < 1 || month > 12) {
            throw new MonthExeption("Не верное значение месяца: " + month + "\nВведите значение от 1 до 12!!");
        }
        return ENUMS[month - 1];
    }
}
