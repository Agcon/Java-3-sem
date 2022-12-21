package ru.agcon.new_labs.laba6.zadanie3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car = new Car("BMW");
        System.out.println(car.getName());
        Planet planet = new Planet("Jupiter");
        System.out.println(planet.getName());
    }
}
