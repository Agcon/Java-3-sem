package ru.agcon.new_labs.laba20.zadanie4_1;

public class Main{

    public static void main(String[] args) {
        MinMax<Double> tmp = new MinMax(new Double[]{5.0D, 2.0D, 3.0D, 4.0D, 1.0D});
        System.out.println(tmp.findMin());
        System.out.println(tmp.findMax());
    }
}
