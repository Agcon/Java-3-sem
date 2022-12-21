package ru.agcon.new_labs.laba19;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> alStudents = new ArrayList();
        alStudents.add(new Student("Oleg", "Mongol", "Designer", 3, "IIII-01-01", 1000));
        alStudents.add(new Student("Gena", "Bukin", "Footballer", 4, "IIII-08-08", 500));
        new LabClassUI(alStudents);
    }
}
