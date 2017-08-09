package com.abunko.leson9.ageCategoriesForPeople;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Andrew on 26.07.2017.
 */
public class People {
    private  List<Person> people = new ArrayList<>();

    public People addPerson(Person person){
        people.add(person);
        return this;
    }

    public List<Person> getPeople() {
        return people;
    }

    @Override
    public String toString() {
        return String.valueOf(people);
    }
}
