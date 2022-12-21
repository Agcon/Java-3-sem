package ru.agcon.new_labs.laba7.zadanie7_8;

public class Book implements Printable {
    private String Author;
    private String Date;

    public Book(String author, String date) {
        this.Author = author;
        this.Date = date;
    }

    public void print() {
        System.out.println("\nAuthor: " + this.Author + "\nDate: " + this.Date);
    }

    static void printBooks(Printable[] printable) {
        System.out.println("Books in list: ");
        Printable[] var1 = printable;
        int var2 = printable.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            Printable print = var1[var3];
            if (print instanceof Book) {
                print.print();
            }
        }
    }
}
