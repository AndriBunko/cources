package com.abunko.leson9.uniqueSortedPeople;

import java.util.*;

/**
 * Created by Andrew on 26.07.2017.
 */
public class People {
    private final List<Person> people = new ArrayList<>();

    public People addPerson(Person person){
        people.add(person);
        return this;
    }

    public Set<Person> sortPeople(Comparator<Person> comparator){
        Set<Person> treeSet = new TreeSet<>(comparator);
        people.forEach(p -> treeSet.add(p));
        return treeSet;
    }

    @Override
    public String toString() {
        return String.valueOf(people);
    }
}
