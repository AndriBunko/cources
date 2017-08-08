package com.abunko.leson9.ageCategoriesForPeople;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Andrew on 08.08.2017.
 */
public class Runner{
    public static void main(String[] args) {
        People people = new People();
        people.addPerson(new Person("Tom", 34))
                .addPerson(new Person("Ben",20))
                .addPerson(new Person("Andrew",23))
                .addPerson(new Person("Ben",16))
                .addPerson(new Person("Pol",11))
                .addPerson(new Person("Pol",11))
                .addPerson(new Person("Pit",44));

        TreeMap<Integer, Person> map = new TreeMap<>();
        people.getPeople().forEach( p -> map.put(p.getAge(), p));
        System.out.println(map);

        System.out.println(map.subMap(12, 17));
        System.out.println(map.get(map.tailMap(18).firstKey()));
        System.out.println(map.get(map.headMap(18).lastKey()));
    }
}
