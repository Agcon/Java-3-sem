package ru.agcon.new_labs.laba19;

import java.util.Comparator;

public class ComparatorByCourse implements Comparator<Student> {
    public ComparatorByCourse() {
    }

    public int compare(Student first, Student second) {
        return first.getCourse() - second.getCourse();
    }
}
