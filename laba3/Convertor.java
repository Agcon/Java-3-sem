package ru.agcon.new_labs.laba3;

public class Convertor {
    public double SumInRub;
    public Convertor(double sm)
    {
        SumInRub = sm;
    }
    public double Euro()
    {
        return SumInRub / 59;
    }
    public double Dollar()
    {
        return SumInRub / 60;
    }
}
