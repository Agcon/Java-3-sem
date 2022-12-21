package ru.agcon.new_labs.laba6.zadanie4;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("abc", 5000.1);
        Car car = new Car("fddg", 547.99 * 888.888);
        System.out.println(book.getPrice());
        System.out.println(car.getPrice());
    }
}