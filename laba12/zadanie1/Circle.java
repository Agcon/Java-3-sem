package ru.agcon.new_labs.laba12.zadanie1;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Circle extends Shape{
    int diameter;

    public Circle(int r, int g, int b, int x, int y, int diameter) {
        super(r, g, b, x, y);
        this.diameter = diameter;
    }

    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        Ellipse2D.Double circle = new Ellipse2D.Double((double)this.center.x, (double)this.center.y, (double)this.diameter, (double)this.diameter);
        g2d.setColor(new Color(this.color.r, this.color.g, this.color.b));
        g2d.fill(circle);
    }
}
