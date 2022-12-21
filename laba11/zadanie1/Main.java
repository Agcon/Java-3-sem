package ru.agcon.new_labs.laba11.zadanie1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        Task first = new Task("Zavodchenkov", (new SimpleDateFormat("dd.MM.yyyy")).parse("01.12.2018"));
        first.setEndDate(new Date());
        System.out.println(first);
    }
}
