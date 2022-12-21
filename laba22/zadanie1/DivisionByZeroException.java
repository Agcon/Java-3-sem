package ru.agcon.new_labs.laba22.zadanie1;

public class DivisionByZeroException extends Exception {
    public DivisionByZeroException() {
        super("Division by zero! Retry with another expression");
    }
}
