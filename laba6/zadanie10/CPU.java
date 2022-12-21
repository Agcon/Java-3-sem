package ru.agcon.new_labs.laba6.zadanie10;

public class CPU {
    private double frequency;
    private int cores;

    public CPU(double frequency, int cores) {
        this.frequency = frequency;
        this.cores = cores;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public double getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "frequency=" + frequency +
                ", cores=" + cores +
                '}';
    }
}
