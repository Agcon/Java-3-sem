package ru.agcon.new_labs.laba12.zadanie1;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Window extends JPanel {
    private int maxXBorder = 800;
    private int maxYBorder = 800;
    private Random random = new Random();
    private List shapes = new ArrayList();
    private String[] shapesName = new String[]{"Circle", "Star", "Rectangle", "Triangle"};

    public Window() {
        this.setBackground(Color.BLACK);
        this.setPreferredSize(new Dimension(this.maxXBorder, this.maxYBorder));
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for(int count = 0; count < 20; ++count) {
            String shape = this.shapesName[this.random.nextInt(4)];
            System.out.println(shape);
            byte var5 = -1;
            switch(shape.hashCode()) {
                case -1169699505:
                    if (shape.equals("Rectangle")) {
                        var5 = 2;
                    }
                    break;
                case 2587250:
                    if (shape.equals("Star")) {
                        var5 = 1;
                    }
                    break;
                case 1562406440:
                    if (shape.equals("Triangle")) {
                        var5 = 3;
                    }
                    break;
                case 2018617584:
                    if (shape.equals("Circle")) {
                        var5 = 0;
                    }
            }

            switch(var5) {
                case 0:
                    Circle circle = new Circle(this.random.nextInt(256), this.random.nextInt(256), this.random.nextInt(256), this.random.nextInt(this.maxXBorder - 100), this.random.nextInt(this.maxYBorder - 100), this.random.nextInt(100));
                    circle.draw(g);
                    break;
                case 1:
                    Star star = new Star(this.random.nextInt(256), this.random.nextInt(256), this.random.nextInt(256), this.random.nextInt(this.maxXBorder - 100), this.random.nextInt(this.maxYBorder - 100), this.random.nextInt(20));
                    star.draw(g);
                    break;
                case 2:
                    Rectangle rec = new Rectangle(this.random.nextInt(256), this.random.nextInt(256), this.random.nextInt(256), this.random.nextInt(this.maxXBorder - 100), this.random.nextInt(this.maxYBorder - 100), this.random.nextInt(200), this.random.nextInt(200));
                    rec.draw(g);
                    break;
                case 3:
                    Triangle triangle = new Triangle(this.random.nextInt(256), this.random.nextInt(256), this.random.nextInt(256), this.random.nextInt(this.maxXBorder - 100), this.random.nextInt(this.maxXBorder - 100));
                    triangle.draw(g);
            }
        }

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new Window());
        frame.setDefaultCloseOperation(3);
        frame.pack();
        frame.setLocationRelativeTo((Component)null);
        frame.setVisible(true);
    }
}
