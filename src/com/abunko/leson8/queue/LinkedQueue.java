package com.abunko.leson8.queue;

import com.abunko.leson8.queue.interfaces.Queue;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Andrew on 02.08.2017.
 */

public class LinkedQueue<E> implements Queue<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    @Override
    public void offer(E e) {
        if(isEmpty()) {
           head = new Node<>(e, null, null);
           size++;
        }
        else if ( !isEmpty() && tail == null){
            tail = new Node<>(e,head, null);
            head.next = tail;
            size++;
        }
        else {
            Node<E> f = tail;
            tail = new Node<>(e,f,null);
            f.next = tail;
            size++;
        }
    }

    @Override
    public E remove() {
        if (isEmpty())
            throw new NoSuchElementException();
        else {
            E e = head.item;
            head = head.next;
            size--;
            return e;
        }
    }

    @Override
    public E poll() {
        if (isEmpty()){
            return null;
        }
        else{
            E e = head.item;
            head = head.next;
            size--;
            return e;
        }
    }

    @Override
    public E element() {
        if (isEmpty())
            throw new NoSuchElementException();
        else {
            return head.item;
        }
    }

    @Override
    public E peek() {
        if (isEmpty())
            return  null;
        else
            return head.item;
    }

    @Override
    public int size() {
        return  size > Integer.MAX_VALUE ? Integer.MAX_VALUE : size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(E elem) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new LinkedQueueIterator();
    }

    @Override
    public String toString() {
        Iterator<E> it = this.iterator();
        if (!it.hasNext())
            return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (; ; ) {
            E e = it.next();
            sb.append(e == this ? "(this Collection)" : e);
            if (!it.hasNext())
                return sb.append(']').toString();
            sb.append(',').append(' ');
        }
    }

    private static class Node<E> {
        E item;
        Node<E> prev;
        Node<E> next;

        Node(E item, Node<E> prev, Node<E> next) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "item=" + item +
                    '}';
        }
    }

    private class LinkedQueueIterator implements Iterator<E> {
        private Node<E> node = head;
        private  int position = 0;

        @Override
        public boolean hasNext() {
            return position < size();
        }

        @Override
        public E next() {

            E e = node.item;
            node = node.next;
            position++;
            return e;
        }
    }
}