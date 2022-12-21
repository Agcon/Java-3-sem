package ru.agcon.new_labs.laba6.zadanie3;

public class Car implements Nameable{
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
