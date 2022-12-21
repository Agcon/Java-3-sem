package ru.agcon.new_labs.laba12.zadanie1;

import java.awt.*;
import java.awt.geom.GeneralPath;

public class Star extends Shape{
    int coef;

    public Star(int r, int g, int b, int x, int y, int coef) {
        super(r, g, b, x, y);
        this.coef = coef;
    }

    public void draw(Graphics g) {
        int[] xPoints = new int[]{9, 15, 0, 18, 3};
        int[] yPoints = new int[]{0, 18, 6, 6, 18};

        for(int i = 0; i < 5; ++i) {
            xPoints[i] *= this.coef / 3;
            yPoints[i] *= this.coef / 3;
        }

        Graphics2D g2d = (Graphics2D)g;
        GeneralPath star = new GeneralPath();
        star.moveTo((float)(xPoints[0] + this.center.x), (float)(yPoints[0] + this.center.y));

        for(int i = 1; i < xPoints.length; ++i) {
            star.lineTo((float)(xPoints[i] + this.center.x), (float)(yPoints[i] + this.center.y));
        }

        star.closePath();
        g2d.setColor(new Color(this.color.r, this.color.g, this.color.b));
        g2d.fill(star);
    }
}
