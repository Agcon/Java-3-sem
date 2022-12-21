package ru.agcon.new_labs.laba3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class zadanie1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        Random random = new Random();
        double rand[] = new double[x];
        System.out.println("С помощью Random:");
        for (int i = 0; i < x; i++){
            rand[i] = random.nextDouble();
            System.out.print(rand[i]);
            System.out.print(" ");
        }
        System.out.println();
        Arrays.sort(rand);
        for (int i = 0; i < x; i++){
            System.out.print(rand[i]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("С помощью Math.random:");
        for (int i = 0; i < x; i++){
            rand[i] = Math.random();
            System.out.print(rand[i]);
            System.out.print(" ");
        }
        System.out.println();
        Arrays.sort(rand);
        for (int i = 0; i < x; i++){
            System.out.print(rand[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
}
