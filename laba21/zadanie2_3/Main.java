package ru.agcon.new_labs.laba21.zadanie2_3;

import ru.agcon.new_labs.laba21.zadanie2_3.AnyTypeArray;

public class Main{

    public static void main(String[] args) {
        AnyTypeArray<Integer> storage = new AnyTypeArray();
        Integer[] ar = new Integer[]{1, 2, 3, 4, 5};
        storage.setArray(ar);
        System.out.println((new int[][]{{2, 1, 3}, {2, 1, 3}}).length);
    }
}