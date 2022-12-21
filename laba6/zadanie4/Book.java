package ru.agcon.new_labs.laba6.zadanie4;

public class Book implements Priceable {
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
