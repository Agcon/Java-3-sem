package ru.agcon.new_labs.laba30;

public class MenuItem {
    String name;
    String description;
    int cost;

    public MenuItem(String name, String description, int cost) {
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public int getCost() {
        return this.cost;
    }
}
