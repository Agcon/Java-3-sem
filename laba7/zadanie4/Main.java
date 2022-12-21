package ru.agcon.new_labs.laba7.zadanie4;

public class Main {
    public static void main(String[] args) {
        MathFunc calc = new MathFunc();
        System.out.println("Module of complex num (4 + 3i) = " + calc.moduleOfComplex(4.0D, 3.0D));
        System.out.println("2^3 = " + calc.raisePower(2.0D, 3));
        System.out.println("Area of circle with radius 4 = " + calc.areaOfCircle(4.0D));
    }
}
