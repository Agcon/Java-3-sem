package ru.agcon.new_labs.laba6.zadanie10;

public class RAM {
    private double capacity;
    private double frequency;

    public RAM(double capacity, double frequency) {
        this.capacity = capacity;
        this.frequency = frequency;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "capacity=" + capacity +
                ", frequency=" + frequency +
                '}';
    }
}
