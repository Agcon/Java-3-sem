package ru.agcon.new_labs.laba19;

import java.util.Comparator;

public class CompareByGpa implements Comparator<Student> {
    public CompareByGpa() {
    }

    public int compare(Student first, Student second) {
        return first.getGPAScore() - second.getGPAScore();
    }
}
