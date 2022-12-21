package ru.agcon.new_labs.laba12.zadanie1;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Rectangle extends Shape{
    int width;
    int height;

    public Rectangle(int r, int g, int b, int x, int y, int width, int height) {
        super(r, g, b, x, y);
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        Rectangle2D.Double rec = new Rectangle2D.Double((double)this.center.x, (double)this.center.y, (double)this.width, (double)this.height);
        g2d.setColor(new Color(this.color.r, this.color.g, this.color.b));
        g2d.fill(rec);
    }
}
