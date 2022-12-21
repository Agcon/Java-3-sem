package ru.agcon.new_labs.laba6.zadanie11;

class KelvinConverter implements Convertertable {

    @Override
    public double getConvertedValue(double dbValue) {
        return dbValue + 273;
    }
}
