package com.abunko.leson8.stack;

import com.abunko.leson8.stack.interfaces.Stack;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Andew on 01.08.2017.
 */
public class StackDynamicArray <E> implements Stack <E> {
    private static final int INITIAL_LENGTH = 5;
    private int size = 0;
    private E [] array ;

    public StackDynamicArray() {
        this(INITIAL_LENGTH);
    }

    public StackDynamicArray(int initialLength) {
        this.array =(E[]) new Object[initialLength];
}

    @Override
    public void push(E elem) {
        if (size < array.length){
            array[size] = elem;
        }
        else {
            array = Arrays.copyOf(array,size * 2);
            array[size] = elem;
        }
        size++;
    }

    @Override
    public E pop() {
        if (this.size > 0){
            E elem = array[size - 1];
            array[size - 1] = null;
            size--;
            return elem;
        }else throw new NoSuchElementException();
    }

    @Override
    public E peek() {
        if (this.size > 0){
            E elem = array[size - 1];
            return elem;
        }else throw new NoSuchElementException();
    }

    @Override
    public int size() {
        return size > Integer.MAX_VALUE ? Integer.MAX_VALUE : size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0 ? true : false;
    }

    @Override
    public String toString(){
    Iterator<E> it = iterator();
        if (! it.hasNext())
                return "[]";

    StringBuilder sb = new StringBuilder();
        sb.append(']');
        for (;;) {
        E e = it.next();
        sb.append(e == this ? "(this Collection)" : e);
        if (! it.hasNext())
            return sb.append('[').reverse().toString();
        sb.append(',').append(' ');
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int position = size;
            @Override
            public boolean hasNext() {
                return position > 0;
            }

            @Override
            public E next() {
                return array[--position];
            }

            @Override
            public void remove(){
                array[position] = null;
                size--;
            }
        };
    }
}
