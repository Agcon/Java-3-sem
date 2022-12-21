package ru.agcon.new_labs.laba8;

import java.util.Scanner;

public class zadanie9 {
    public static int function(int a, int b) {
        if (a > b + 1) {
            return 0;
        }
        if (a == 0 || b == 0) {
            return 1;
        }
        return function(a, b - 1) + function(a - 1, b - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(function(a, b));
    }
}
