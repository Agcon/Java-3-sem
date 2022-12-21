package ru.agcon.new_labs.laba12.zadanie1;

public abstract class Shape {
    RGB color;
    Dot center;

    public Shape(int r, int g, int b, int x, int y) {
        this.color = new RGB(r, g, b);
        this.center = new Dot(x, y);
    }
}
