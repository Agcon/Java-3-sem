package ru.agcon.new_labs.laba6.zadanie10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CPU cpu = new CPU(1000, 8);
        RAM ram = new RAM(5000, 1000);
        Monitor monitor = new Monitor(240, 40);
        Computer computer = new Computer(cpu, ram, monitor, Company.HP);
        System.out.println(computer);
        int x = scanner.nextInt();
        Computer[] computers = new Computer[x];
        for (int i = 0; i < x; i++){
            cpu = new CPU(scanner.nextDouble(), scanner.nextInt());
            ram = new RAM(scanner.nextDouble(), scanner.nextDouble());
            monitor = new Monitor(scanner.nextDouble(), scanner.nextDouble());
            computer = new Computer(cpu, ram, monitor, Company.values()[i % 5]);
            computers[i] = computer;
        }
        Shop shop = new Shop(computers, x);
        System.out.println(shop);
        System.out.println();
        cpu = new CPU(1000, 8);
        ram = new RAM(5000, 1000);
        monitor = new Monitor(240, 40);
        computer = new Computer(cpu, ram, monitor, Company.HP);
        shop.add_computer(computer);
        System.out.println(shop);
        System.out.println();
        shop.delete_computer(1);
        System.out.println(shop);
    }
}
