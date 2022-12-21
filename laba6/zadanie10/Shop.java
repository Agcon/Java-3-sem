package ru.agcon.new_labs.laba6.zadanie10;

import java.util.Arrays;

public class Shop {
    private Computer computers[];
    private int amount;

    public Shop(Computer[] computers, int amount) {
        this.computers = computers;
        this.amount = amount;
    }

    public void add_computer(Computer computer){
        Computer[] temp = new Computer[amount + 1];
        for(int i = 0; i < amount; i++){
            temp[i] = computers[i];
        }
        temp[amount] = computer;
        computers = temp;
        amount++;
    }

    public void delete_computer(int id){
        Computer[] temp = new Computer[amount - 1];
        int trigger = amount;
        for (int i = 0; i < amount; i++){
            if(i != id % amount) temp[i] = computers[i];
            else{
                trigger = i;
                break;
            }
        }
        amount--;
        for(int i = trigger; i < amount; i++){
            temp[i] = computers[i + 1];
        }
        computers = temp;
    }

    @Override
    public String toString() {
        String s = "";
        s += "Amount = " + amount + "\n" + "List of computers:";
        for (int i = 0; i < amount; i++){
            s += "\n" + computers[i].toString();
        }
        return s;
    }
}
