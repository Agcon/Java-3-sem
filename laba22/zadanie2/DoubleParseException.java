package ru.agcon.new_labs.laba22.zadanie2;

public class DoubleParseException extends Exception {
    public DoubleParseException() {
        super("Wrong value! Try another expression");
    }
}
