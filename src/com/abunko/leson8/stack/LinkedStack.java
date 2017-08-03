package com.abunko.leson8.stack;

import com.abunko.leson8.stack.interfaces.Stack;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Andrew on 01.08.2017.
 */
public class LinkedStack <E> implements Stack <E>{

    private  StackElement elem;
    private int size;

    @Override
    public void push(E data) {
        elem = new StackElement(elem, data);
        size++;
    }

    @Override
    public E pop() {
        if (size-- > 0){
            E data = elem.getData();
            elem = elem.getPrevElem();
            return data;
        }else
            throw new NoSuchElementException();
    }

    @Override
    public E peek() {
        if (!this.isEmpty())
             return  elem.getData();
        else
            throw new NoSuchElementException();
    }

    @Override
    public int size() {
        return size > Integer.MAX_VALUE ? Integer.MAX_VALUE : size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public Iterator iterator() {
        return new LinkedStackIterator();
    }

    @Override
    public String toString() {
        Iterator<E> it = this.iterator();
        if (!it.hasNext())
            return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append(']');
        for (; ; ) {
            E e = it.next();
            sb.append(e == this ? "(this Collection)" : e);
            if (!it.hasNext())
                return sb.append('[').reverse().toString();
            sb.append(',').append(' ');
        }
    }



    private class StackElement{
        private StackElement prevElem;
        private E data;

        public StackElement(StackElement prevElem, E data) {
            this.prevElem = prevElem;
            this.data = data;
        }

        public StackElement getPrevElem() {
            return prevElem;
        }

        public E getData() {
            return this.data;
        }

        @Override
        public String toString() {
            return  data.toString();
        }
    }

    private class LinkedStackIterator implements Iterator<E> {
       private StackElement element = elem;

        @Override
        public boolean hasNext() {
            return  element != null;
        }

        @Override
        public E next() {
            E data = element.getData();
            element = element.getPrevElem();
            return data;
        }
    }
}
