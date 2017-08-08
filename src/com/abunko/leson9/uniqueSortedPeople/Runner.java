package com.abunko.leson9.uniqueSortedPeople;

/**
 * Created by Andrew on 08.08.2017.
 */
public class Runner{
    public static void main(String[] args) {
        People people = new People();
        people.addPerson(new Person("Tom", 34))
                .addPerson(new Person("Ben",18))
                .addPerson(new Person("Andrew",23))
                .addPerson(new Person("Ben",18))
                .addPerson(new Person("Pol",11))
                .addPerson(new Person("Pol",11))
                .addPerson(new Person("Pit",44));

        System.out.println(people);
        System.out.println(people.sortPeople());

    }
}
