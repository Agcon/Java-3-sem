package ru.agcon.new_labs.laba19;

public class StudentNotFoundException extends Exception {
    public StudentNotFoundException() {
        super("Student not found");
    }
}

