package ru.agcon.new_labs.laba6.zadanie10;

public class Computer {
    private CPU cpu;
    private RAM ram;
    private Monitor monitor;
    private Company company;

    public Computer(CPU cpu, RAM ram, Monitor monitor, Company company) {
        this.cpu = cpu;
        this.ram = ram;
        this.monitor = monitor;
        this.company = company;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Computer:\n" + cpu.toString() +
                "\n" + ram.toString() +
                "\n" + monitor.toString() +
                "\nCompany:\n" + company;
    }
}
