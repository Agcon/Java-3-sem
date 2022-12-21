package ru.agcon.new_labs.laba6.zadanie10;

public class Monitor {
    private double frequency;
    private double diagonal;

    public Monitor(double frequency, double diagonal) {
        this.frequency = frequency;
        this.diagonal = diagonal;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "frequency=" + frequency +
                ", diagonal=" + diagonal +
                '}';
    }
}
