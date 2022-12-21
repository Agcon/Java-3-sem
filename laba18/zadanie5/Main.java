package ru.agcon.new_labs.laba18.zadanie5;

public class Main{

    public static void getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
    }

    public static void main(String[] args) {
        try {
            getDetails((String)null);
        } catch (NullPointerException var2) {
            System.out.println(var2);
        }

    }
}
