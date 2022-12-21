package ru.agcon.new_labs.laba7.zadanie4;

public class MathFunc implements MathCalculable {
    public MathFunc() {
    }

    public double moduleOfComplex(double realPart, double imPart) {
        return Math.sqrt(realPart * realPart + imPart * imPart);
    }

    public double raisePower(double value, int powValue) {
        return Math.pow(value, (double)powValue);
    }

    public double areaOfCircle(double radius) {
        return numPI * this.raisePower(radius, 2);
    }
}
