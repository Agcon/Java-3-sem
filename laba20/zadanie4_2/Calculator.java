package ru.agcon.new_labs.laba20.zadanie4_2;

public class Calculator {
    public Calculator() {
    }

    public static <T extends Number, V extends Number> Double sum(T a, V b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static <T extends Number, V extends Number> Double multiply(T a, V b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static <T extends Number, V extends Number> Double divide(T a, V b) {
        return a.doubleValue() / b.doubleValue();
    }

    public static <T extends Number, V extends Number> Double subtraction(T a, V b) {
        return a.doubleValue() - b.doubleValue();
    }
}

