package ru.agcon.new_labs.laba19;


import java.util.Comparator;

public class ComparatorBySpeciality implements Comparator<Student> {
    public ComparatorBySpeciality() {
    }

    public int compare(Student first, Student second) {
        return first.getSpeciality().compareTo(second.getSpeciality());
    }
}