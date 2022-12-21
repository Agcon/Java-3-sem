package ru.agcon.new_labs.laba3;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        System.out.print("Введите сумму покупки в рублях: ");
        Scanner scanner = new Scanner(System.in);
        double sm = scanner.nextDouble();
        Convertor check = new Convertor(sm);
        System.out.println("Выберите валюту для оплаты покупки:\n1 - Рубль\n2 - Евро\n3 - Доллар");
        Scanner source = new Scanner(System.in);
        int n = scanner.nextInt();
        switch (n)
        {
            case 1:
                System.out.print("С вас " + check.SumInRub + "₽");
                break;
            case 2:
                NumberFormat numberFormat2 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
                System.out.print("С вас " + numberFormat2.format(check.Euro()));
                break;
            case 3:
                NumberFormat numberFormat3 = NumberFormat.getCurrencyInstance(Locale.US);
                System.out.print("С вас " + numberFormat3.format(check.Dollar()));
                break;
        }
    }
}
