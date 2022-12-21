package ru.agcon.new_labs.laba6.zadanie4;

public class Car implements Priceable {
    private String company;
    private double price;

    public Car(String company, double price) {
        this.company = company;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
