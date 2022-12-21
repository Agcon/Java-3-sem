package ru.agcon.new_labs.laba3;

public class Employee {
    public String fullname;
    public double salary;
    public Employee(String fullname, double salary)
    {
        this.fullname = fullname;
        this.salary = salary;
    }
    public void generateReport()
    {
        System.out.printf("%-20s %5s %n", fullname, String.format("%.2f", salary));
    }
}
