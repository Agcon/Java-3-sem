package ru.agcon.new_labs.laba7.zadanie7_8;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Tolstoy", "1894");
        Book book2 = new Book("Pushkin", "1815");
        Magazine shop1 = new Magazine("Modeler", "autumn");
        Magazine shop2 = new Magazine("Modeler", "winter");
        Printable[] printable = new Printable[]{book1, book2, shop1, shop2};
        Book.printBooks(printable);
        Magazine.printMagazines(printable);
    }
}
