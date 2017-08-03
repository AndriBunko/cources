package com.abunko.leson8.stack;

import com.abunko.leson8.stack.interfaces.Stack;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Andrew on 02.08.2017.
 */
public class LinkedListSack<E> implements Stack<E>{
    private LinkedList<E> list = new LinkedList();
    @Override
    public void push(E elem) {
       list.push(elem);
    }

    @Override
    public E pop() {
        return list.pop();
    }

    @Override
    public E peek() {
        return list.peek();
    }

    @Override
    public int size() {
        return list.size() > Integer.MAX_VALUE ? Integer.MAX_VALUE : list.size();
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public Iterator<E> iterator() {
        return list.iterator();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
