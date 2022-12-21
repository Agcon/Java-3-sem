package ru.agcon.new_labs.laba6.zadanie6_9;

public class Shop implements Printable{
    private String name;
    private String specialization;

    public Shop(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public void print() {
        System.out.println("name = " + this.name + ", specialization = " + this.specialization);
    }
}
