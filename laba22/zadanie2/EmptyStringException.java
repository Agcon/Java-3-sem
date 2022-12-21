package ru.agcon.new_labs.laba22.zadanie2;

public class EmptyStringException extends Exception {
    public EmptyStringException() {
        super("Empty string not allowed");
    }
}
