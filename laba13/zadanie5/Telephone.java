package ru.agcon.new_labs.laba13.zadanie5;

class Telephone {
    String stCountryCode = "";
    String stFirstThree = "";
    String stSecondThree = "";
    String stFour = "";

    Telephone(String str) {
        if (str.charAt(0) == '+') {
            this.stCountryCode = this.stCountryCode + "+";
            str = str.replace("+", "");
        }

        String var10001 = this.stCountryCode;
        this.stCountryCode = var10001 + str.substring(0, str.length() - 10);
        int iCurrentPos = this.stCountryCode.length() - 1;
        var10001 = this.stFirstThree;
        this.stFirstThree = var10001 + str.substring(iCurrentPos, iCurrentPos + 3);
        iCurrentPos += this.stFirstThree.length();
        var10001 = this.stSecondThree;
        this.stSecondThree = var10001 + str.substring(iCurrentPos, iCurrentPos + 3);
        iCurrentPos += this.stSecondThree.length();
        var10001 = this.stFour;
        this.stFour = var10001 + str.substring(iCurrentPos, iCurrentPos + 4);
    }

    public String toString() {
        return this.stCountryCode + " " + this.stFirstThree + " " + this.stSecondThree + " " + this.stFour;
    }
}

