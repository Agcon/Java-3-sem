package ru.agcon.new_labs.laba8;

import java.util.Scanner;

public class zadanie10 {
    public static int function(int a, int b){
        if (a == 0) return b;
        return function(a / 10, b * 10 + a % 10);
    }
    public static int function(int a){
        return function(a, 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(function(a));
    }
}
