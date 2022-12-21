package ru.agcon.new_labs.laba8;

import java.util.Scanner;

public class zadanie11 {

    public static int function(int prev, int cur){
        Scanner scanner = new Scanner(System.in);
        if (cur == 0 && prev == 0) return 0;
        if (cur == 1) return 1 + function(cur, scanner.nextInt());
        return function(cur, scanner.nextInt());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(function(1, scanner.nextInt()));
    }
}
