package com.abunko.leson9.numbersCounter;

import com.abunko.leson9.numbersCounter.NumbersCounter;
import com.abunko.leson9.uniqueSortedPeople.People;
import com.abunko.leson9.uniqueSortedPeople.Person;

import java.util.*;

/**
 * Created by Andrew on 03.08.2017.
 */
public class Runner {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(2);

        NumbersCounter numbersCounter = new NumbersCounter(list);
        Map<Integer, Integer> map = numbersCounter.countNumbers();
        System.out.println(map);

    }
}
