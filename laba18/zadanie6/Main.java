package ru.agcon.new_labs.laba18.zadanie6;

public class Main{

    public static void printMessage(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception var2) {
            System.out.println("Message is empty");
        }

    }

    public static String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException(" null key in getDetails");
        } else {
            return "data for" + key;
        }
    }

    public static void main(String[] args) {
        printMessage((String)null);
    }
}
