package ru.agcon.new_labs.laba12.zadanie1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.util.Random;

public class Triangle extends Shape{
    Dot a;
    Dot b;
    Dot c;
    private Random random = new Random();

    public Triangle(int r, int g, int b, int x, int y) {
        super(r, g, b, x, y);
        this.a = new Dot(x + this.random.nextInt( 400), x + this.random.nextInt(400));
        this.b = new Dot(x + this.random.nextInt(400), x + this.random.nextInt(400));
        this.c = new Dot(x + this.random.nextInt(400), x + this.random.nextInt(400));
    }

    public void draw(Graphics g) {
        int[] xPoints = new int[]{this.a.x, this.b.x, this.c.x};
        int[] yPoints = new int[]{this.a.y, this.b.y, this.c.y};
        Graphics2D g2d = (Graphics2D)g;
        GeneralPath triangle = new GeneralPath();
        triangle.moveTo((float)(xPoints[0] + this.center.x), (float)(yPoints[0] + this.center.y));

        for(int i = 1; i < xPoints.length; ++i) {
            triangle.lineTo((float)(xPoints[i] + this.center.x), (float)(yPoints[i] + this.center.y));
        }

        triangle.closePath();
        g2d.setColor(new Color(this.color.r, this.color.g, this.color.b));
        g2d.fill(triangle);
    }
}
