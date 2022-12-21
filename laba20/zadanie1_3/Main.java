package ru.agcon.new_labs.laba20.zadanie1_3;

public class Main{

    public static void main(String[] args) {
        TVK<Integer, String, AnimalNext> tmp = new TVK(5, "tmp", new AnimalNext(10, "Lion", 200));
        tmp.showClassesName();
    }
}
