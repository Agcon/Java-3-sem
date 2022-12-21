package ru.agcon.new_labs.laba18.zadanie1;

public class Main{

    public static void main(String[] args) {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException var2) {
            System.out.println("Attempted division by zero");
        }
    }
}
