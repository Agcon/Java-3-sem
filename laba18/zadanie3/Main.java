package ru.agcon.new_labs.laba18.zadanie3;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException var4) {
            System.out.println("It is not an integer");
        } catch (Exception var5) {
            System.out.println("Exception general");
        }

    }
}
