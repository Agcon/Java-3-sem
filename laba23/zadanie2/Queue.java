package ru.agcon.new_labs.laba23.zadanie2;

public interface Queue {
    void enqueue(Object var1);

    Object element();

    Object dequeue();

    int size();

    boolean isEmpty();

    void clear();

    String show();
}
