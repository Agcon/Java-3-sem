package ru.agcon.new_labs.laba22.zadanie1;

public class EmptyStackException extends Exception {
    public EmptyStackException() {
        super("Stack is empty! Retry with another expression");
    }
}