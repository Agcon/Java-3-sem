package ru.agcon.new_labs.laba6.zadanie3;

public class Planet implements Nameable{
    private String name;

    public Planet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
