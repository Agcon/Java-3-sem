package ru.agcon.new_labs.laba21.zadanie2_3;

public class AnyTypeArray<E> {
    private E[] array;

    public AnyTypeArray() {
    }

    public E get(int index) {
        return this.array[index];
    }

    public void setArray(E[] array) {
        this.array = array;
    }
}
