package ru.agcon.new_labs.laba6.zadanie6_9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printable[] printable = new Printable[4];
        Book book1 = new Book("harry", "rowling", 1997);
        Shop shop1 = new Shop("mvideo", "technik");
        Book book2 = new Book("mumu", "turgenev", 1852);
        Shop shop2 = new Shop("adidas", "clothes");
        printable[0] = book1;
        printable[1] = shop1;
        printable[2] = book2;
        printable[3] = shop2;
        for(int i = 0; i < 4; i++){
            printable[i].print();
        }
    }
}
