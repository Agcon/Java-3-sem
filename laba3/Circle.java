package ru.agcon.new_labs.laba3;

public class Circle {
    private Point center;
    private int r;

    public Circle(Point center, int r)
    {
        this.center = center;
        this.r = r;
    }

    public Point getcenter() { return center; }
    public void setcenter(Point center) { this.center = center; }

    public int getR() {
        return r;
    }
    public void setR(int r) {
        this.r = r;
    }

    public void move(double xDisp, double yDisp)
    {
        this.center.setX(center.getX() + xDisp);
        this.center.setY(center.getY() + yDisp);
    }

    public boolean Compare(Circle c2)
    {
        if (r > c2.getR())
            return true;
        else return false;
    }

    @Override
    public String toString() {
        return "Circle{" + "x=" + center.getX() +", y=" + center.getY() + ", r=" + r + '}';
    }
}