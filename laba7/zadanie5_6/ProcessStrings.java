package ru.agcon.new_labs.laba7.zadanie5_6;

public class ProcessStrings {
    public ProcessStrings() {}

    public int getLength(String a) {
        return a.length();
    }

    public String getOddString(String a) {
        StringBuilder returnString = new StringBuilder();
        StringBuilder s = new StringBuilder(a);

        for(int i = 1; i < s.length(); i += 2) {
            returnString.append(s.charAt(i));
        }

        return new String(returnString);
    }

    public String invertSting(String a) {
        StringBuilder returnString = new StringBuilder();
        StringBuilder s = new StringBuilder(a);

        for(int i = s.length() - 1; i >= 0; --i) {
            returnString.append(s.charAt(i));
        }

        return new String(returnString);
    }
}
