package com.abunko.leson8.queue;

import com.abunko.leson8.queue.interfaces.Queue;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Andrew on 02.08.2017.
 */
public class DynamicArrayQueue<E> implements Queue<E> {
    private static final int INITIAL_LENGTH = 5;
    private int size = 0;
    private E [] array ;

    public DynamicArrayQueue() {
        this.array =(E[]) new Object[INITIAL_LENGTH];
    }
    @Override
    public void offer(E elem) {
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
    public E remove() {
        if(this.isEmpty()){
            throw new NoSuchElementException();
        } else {
        E e = array[0];
        array = Arrays.copyOfRange(array, 1 , array.length);
        size--;
        return e;
        }
    }

    @Override
    public E poll() {
        if (this.isEmpty()) {
            return null;
        } else {
            E e = array[0];
            array = Arrays.copyOfRange(array, 1, array.length);
            size--;
            return e;
        }
    }


    @Override
    public E element() {
        if (this.isEmpty()){
            throw new NoSuchElementException();
        }
        return array[0];
    }

    @Override
    public E peek() {
        if (this.isEmpty()){
            return null;
        }
        return array[0];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(E elem) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(elem))
                return true;
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new QueueIterator();
    }

    private class QueueIterator implements Iterator {
        int position = 0;
        @Override
        public boolean hasNext() {
            return position < size ? true : false;
        }

        @Override
        public E next() {
            return array[position++];
        }
    }
}
