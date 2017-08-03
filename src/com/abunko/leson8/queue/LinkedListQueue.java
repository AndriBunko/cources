package com.abunko.leson8.queue;

import com.abunko.leson8.queue.interfaces.Queue;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Andrew on 02.08.2017.
 */
public class LinkedListQueue<E> implements Queue<E> {
    private final LinkedList<E> list = new LinkedList<E>();

    @Override
    public void offer(E e) {
        this.list.offer(e);
    }

    @Override
    public E remove() {
        return this.list.remove();
    }

    @Override
    public E poll() {
        return this.list.poll();
    }

    @Override
    public E element() {
        return this.list.element();
    }

    @Override
    public E peek() {
        return this.list.peek();
    }

    @Override
    public int size() {
        return this.list.size();
    }

    @Override
    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    @Override
    public boolean contains(E elem) {
        return this.list.contains(elem);
    }

    @Override
    public Iterator<E> iterator() {
        return list.iterator();
    }
}
