package ru.agcon.new_labs.laba19;

import java.util.Comparator;

public class ComparatorByGroup implements Comparator<Student> {
    public ComparatorByGroup() {
    }

    public int compare(Student first, Student second) {
        return first.getGroup().compareTo(second.getGroup());
    }
}
