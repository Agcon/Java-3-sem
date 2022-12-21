package ru.agcon.new_labs.laba6.zadanie11;

class FahrenheitConverter implements Convertertable {
    @Override
    public double getConvertedValue(double dbValue) {
        return 1.8 * dbValue + 32;
    }
}
