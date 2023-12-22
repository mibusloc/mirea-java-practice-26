package ru.mirea.lab26.task2;

import java.util.Iterator;
import java.util.List;

public class CustomList<E> implements Iterator<E> {
    private final List<E> list;
    private int currentIndex;

    public CustomList(List<E> list) {
        this.list = list;
        this.currentIndex = 0;
    }

    @Override
    public E next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        return list.get(currentIndex++);
    }

    @Override
    public boolean hasNext() {
        return currentIndex < list.size();
    }
}

