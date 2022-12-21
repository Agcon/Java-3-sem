package ru.agcon.new_labs.laba18.zadanie4;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException var8) {
            System.out.println("It is not an integer");
        } catch (Exception var9) {
            System.out.println("Exception general");
        } finally {
            System.out.println("\nFinally!");
        }

    }
}