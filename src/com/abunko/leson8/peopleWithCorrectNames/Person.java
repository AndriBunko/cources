package com.abunko.leson8.peopleWithCorrectNames;

/**
 * Created by Andrew on 01.08.2017.
 */
public class Person{
    private final String name;

    public Person() {
        name = null;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
