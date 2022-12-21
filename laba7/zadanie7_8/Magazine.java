package ru.agcon.new_labs.laba7.zadanie7_8;

public class Magazine implements Printable {
    private String Author;
    private String Season;

    public Magazine(String author, String season) {
        this.Author = author;
        this.Season = season;
    }

    public void print() {
        System.out.println("\nAuthor: " + this.Author + "\nSeason: " + this.Season);
    }

    static void printMagazines(Printable[] printable) {
        System.out.println("Magazines in list: ");
        Printable[] var1 = printable;
        int var2 = printable.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            Printable print = var1[var3];
            if (print instanceof Magazine) {
                print.print();
            }
        }

    }
}
