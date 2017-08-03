package com.abunko.leson8.peopleWithCorrectNames;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Andrew on 01.08.2017.
 */
public class People {
    private final List<Person> people = new ArrayList<>();

    public void add(Person person){
        people.add(person);
    }

    @Override
    public String toString() {
        return String.valueOf(people);
    }

    public void removeNames(){
        Iterator<Person>  iterator = people.iterator();
        while (iterator.hasNext()){
            Person p =  iterator.next();
            if ( p.getName()== null || p.getName().equals("")){
                iterator.remove();
            }
        }

    }
}
