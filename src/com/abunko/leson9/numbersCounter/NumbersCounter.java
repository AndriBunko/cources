package com.abunko.leson9.numbersCounter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Andrew on 06.08.2017.
 */
public class NumbersCounter {
    private final List<Integer> list;

    public NumbersCounter(List<Integer> list) {
        this.list = list;
    }

    public Map<Integer, Integer> countNumbers(){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>() ;

        for (Integer i : list) {
            int count;
            if (map.containsKey(i)){
                count = map.get(i) + 1;
                map.put(i,count);
            }
            else {
                count = 1;
                map.put(i , count);
            }
        }
        return map;
    }
}
